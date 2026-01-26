package com.CodingB.StaySavvy.service;


import com.CodingB.StaySavvy.dto.HotelDto;
import com.CodingB.StaySavvy.dto.HotelInfoDto;
import com.CodingB.StaySavvy.dto.HotelInfoRequestDto;

import java.util.List;

public interface HotelService {
    HotelDto createNewHotel(HotelDto hotelDto);

    HotelDto getHotelById(Long id);

    HotelDto updateHotelById(Long id, HotelDto hotelDto);

    void deleteHotelById(Long id);

    void activateHotel(Long hotelId);

    HotelInfoDto getHotelInfoById(Long hotelId, HotelInfoRequestDto hotelInfoRequestDto);

    List<HotelDto> getAllHotels();

}
