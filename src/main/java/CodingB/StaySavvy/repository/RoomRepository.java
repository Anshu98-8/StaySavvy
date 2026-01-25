package CodingB.StaySavvy.repository;


import CodingB.StaySavvy.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
