package CodingB.StaySavvy.service;


import CodingB.StaySavvy.dto.ProfileUpdateRequestDto;
import CodingB.StaySavvy.dto.SecurityDto.UserDto;
import CodingB.StaySavvy.entity.User;

public interface UserService {

    User getUserById(Long id);

    void updateProfile(ProfileUpdateRequestDto profileUpdateRequestDto);

    UserDto getMyProfile();

}
