package CodingB.StaySavvy.dto;


import CodingB.StaySavvy.entity.User;
import CodingB.StaySavvy.entity.enums.Gender;
import lombok.Data;

@Data
public class GuestDto {
    private Long id;
    private User user;
    private String name;
    private Gender gender;
    private Integer age;
}
