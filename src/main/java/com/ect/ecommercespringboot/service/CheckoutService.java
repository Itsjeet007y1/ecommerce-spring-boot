package com.ect.ecommercespringboot.service;

import com.ect.ecommercespringboot.dto.PaymentInfo;
import com.ect.ecommercespringboot.dto.Purchase;
import com.ect.ecommercespringboot.dto.PurchaseResponse;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);

    PaymentIntent createPaymentIntent(PaymentInfo paymentInfo) throws StripeException;
}
