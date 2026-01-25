package CodingB.StaySavvy.repository;


import CodingB.StaySavvy.entity.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRepository extends JpaRepository<Guest, Long> {
}