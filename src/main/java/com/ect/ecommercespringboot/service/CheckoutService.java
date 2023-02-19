package com.ect.ecommercespringboot.service;

import com.ect.ecommercespringboot.dto.Purchase;
import com.ect.ecommercespringboot.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
