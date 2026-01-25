package CodingB.StaySavvy.repository;


import CodingB.StaySavvy.entity.Inventory;
import CodingB.StaySavvy.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {

    void deleteByDateAfterAndRoom(LocalDate date, Room room);
}
