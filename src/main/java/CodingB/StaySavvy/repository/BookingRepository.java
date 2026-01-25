package CodingB.StaySavvy.repository;


import CodingB.StaySavvy.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
