package com.CodingB.StaySavvy.service;


import com.CodingB.StaySavvy.entity.Booking;

public interface CheckoutService {

    String getCheckoutSession(Booking booking, String successUrl, String failureUrl);

}
