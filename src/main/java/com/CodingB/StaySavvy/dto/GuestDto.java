package com.CodingB.StaySavvy.dto;


import com.CodingB.StaySavvy.entity.User;
import com.CodingB.StaySavvy.entity.enums.Gender;
import lombok.Data;

import java.time.LocalDate;

@Data
public class GuestDto {
    private Long id;
    private User user;
    private String name;
    private Gender gender;
    private LocalDate dateOfBirth;
}
