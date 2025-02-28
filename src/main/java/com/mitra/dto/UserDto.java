package com.mitra.dto;

import com.mitra.entity.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class UserDto implements Dto{
    String email;
    String password;
    Role role;
}
