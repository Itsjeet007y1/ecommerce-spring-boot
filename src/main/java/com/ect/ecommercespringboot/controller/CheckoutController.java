package com.ect.ecommercespringboot.controller;

import com.ect.ecommercespringboot.dto.PaymentInfo;
import com.ect.ecommercespringboot.dto.Purchase;
import com.ect.ecommercespringboot.dto.PurchaseResponse;
import com.ect.ecommercespringboot.service.CheckoutService;
import com.stripe.model.PaymentIntent;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@CrossOrigin
@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {

    private CheckoutService checkoutService;

    private Logger logger = Logger.getLogger(getClass().getName());

    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase) {
        PurchaseResponse purchaseResponse = checkoutService.placeOrder(purchase);
        return purchaseResponse;
    }

    @PostMapping("/payment-intent")
    public ResponseEntity<String> createPaymentIntent(@RequestBody PaymentInfo paymentInfo) throws Exception {

        logger.info("paymentInfo.amount: " + paymentInfo.getAmount());

        PaymentIntent paymentIntent = checkoutService.createPaymentIntent(paymentInfo);
        String paymentString = paymentIntent.toJson();
        return new ResponseEntity<>(paymentString, HttpStatus.OK);
    }
}
