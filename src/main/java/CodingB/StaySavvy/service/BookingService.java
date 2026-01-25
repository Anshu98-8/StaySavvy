package CodingB.StaySavvy.service;



import CodingB.StaySavvy.dto.BookingDto;
import CodingB.StaySavvy.dto.BookingRequest;
import CodingB.StaySavvy.dto.GuestDto;
import CodingB.StaySavvy.dto.HotelReportDto;
import CodingB.StaySavvy.entity.enums.BookingStatus;
import com.stripe.model.Event;

import java.time.LocalDate;
import java.util.List;

public interface BookingService {

    BookingDto initialiseBooking(BookingRequest bookingRequest);

    BookingDto addGuests(Long bookingId, List<Long> guestIdList);

    String initiatePayments(Long bookingId);

    void capturePayment(Event event);

    void cancelBooking(Long bookingId);

    BookingStatus getBookingStatus(Long bookingId);

    List<BookingDto> getAllBookingsByHotelId(Long hotelId);

    HotelReportDto getHotelReport(Long hotelId, LocalDate startDate, LocalDate endDate);

    List<BookingDto> getMyBookings();
}
