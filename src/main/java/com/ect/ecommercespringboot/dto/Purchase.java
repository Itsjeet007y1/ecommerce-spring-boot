package com.ect.ecommercespringboot.dto;

import com.ect.ecommercespringboot.entity.Address;
import com.ect.ecommercespringboot.entity.Customer;
import com.ect.ecommercespringboot.entity.Order;
import com.ect.ecommercespringboot.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;

    private Address shippingAddress;

    private Address billingAddress;

    private Order order;

    private Set<OrderItem> orderItems;
}
