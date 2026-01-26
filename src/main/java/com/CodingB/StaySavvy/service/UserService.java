package com.CodingB.StaySavvy.service;


import com.CodingB.StaySavvy.dto.ProfileUpdateRequestDto;
import com.CodingB.StaySavvy.dto.SecurityDto.UserDto;
import com.CodingB.StaySavvy.entity.User;

public interface UserService {

    User getUserById(Long id);

    void updateProfile(ProfileUpdateRequestDto profileUpdateRequestDto);

    UserDto getMyProfile();

}
