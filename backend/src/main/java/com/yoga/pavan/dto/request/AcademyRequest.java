package com.yoga.pavan.dto.request;


    

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class AcademyRequest {
    private String name;
    private String email;
    private String password;


}

