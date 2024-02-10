package com.yoga.pavan.dto.response;

import com.yoga.pavan.enumerated.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {
    private String id;
    private String name;
    private String email;
    private String image;
    private String password;
    private Role role;
  

}
