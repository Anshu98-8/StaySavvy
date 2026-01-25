package CodingB.StaySavvy.service;


import CodingB.StaySavvy.entity.Booking;

public interface CheckoutService {

    String getCheckoutSession(Booking booking, String successUrl, String failureUrl);

}
