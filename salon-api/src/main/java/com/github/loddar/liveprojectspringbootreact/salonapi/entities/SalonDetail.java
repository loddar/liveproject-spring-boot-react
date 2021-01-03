package com.github.loddar.liveprojectspringbootreact.salonapi.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SalonDetail {
    private String name;
    private String address;
    private String city;
    private String state;
    private String zipcode;
    private String phone;
}
