package com.leticiacampos.rhpayroll.services;

import org.springframework.stereotype.Service;

import com.leticiacampos.rhpayroll.entities.Payment;

@Service
public class PaymentService {
	
	public Payment getPayment(long workerId, int days) {
		return new Payment("Bob", 200.00, days);
	}
}