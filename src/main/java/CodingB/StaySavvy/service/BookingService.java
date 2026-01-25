package CodingB.StaySavvy.service;



import CodingB.StaySavvy.dto.BookingDto;
import CodingB.StaySavvy.dto.BookingRequest;
import CodingB.StaySavvy.dto.GuestDto;
import com.stripe.model.Event;

import java.util.List;

public interface BookingService {
    BookingDto initialiseBooking(BookingRequest bookingRequest);

    BookingDto addGuests(Long bookingId, List<GuestDto> guestDtoList);

    String initiatePayments(Long bookingId);

    void capturePayment(Event event);

    void cancelBooking(Long bookingId);

    String getBookingStatus(Long bookingId);
}
