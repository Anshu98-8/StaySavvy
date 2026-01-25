package CodingB.StaySavvy.service;


import CodingB.StaySavvy.dto.HotelDto;
import CodingB.StaySavvy.dto.HotelPriceDto;
import CodingB.StaySavvy.dto.HotelSearchRequest;
import CodingB.StaySavvy.entity.Room;
import org.springframework.data.domain.Page;

public interface InventoryService {

    void initializeRoomForAYear(Room room);

    void deleteAllInventories(Room room);

    Page<HotelPriceDto> searchHotels(HotelSearchRequest hotelSearchRequest);

}
