package CodingB.StaySavvy.service;


import CodingB.StaySavvy.entity.Room;

public interface InventoryService {

    void initializeRoomForAYear(Room room);

    void deleteFutureInventories(Room room);

}
