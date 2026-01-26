package com.CodingB.StaySavvy.service;



import com.CodingB.StaySavvy.dto.HotelPriceResponseDto;
import com.CodingB.StaySavvy.dto.HotelSearchRequest;
import com.CodingB.StaySavvy.dto.InventoryDto;
import com.CodingB.StaySavvy.dto.UpdateInventoryRequestDto;
import com.CodingB.StaySavvy.entity.Room;
import org.springframework.data.domain.Page;

import java.util.List;

public interface InventoryService {

    void initializeRoomForAYear(Room room);

    void deleteAllInventories(Room room);

    Page<HotelPriceResponseDto> searchHotels(HotelSearchRequest hotelSearchRequest);

    List<InventoryDto> getAllInventoryByRoom(Long roomId);

    void updateInventory(Long roomId, UpdateInventoryRequestDto updateInventoryRequestDto);
}
