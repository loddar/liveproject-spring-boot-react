package com.github.loddar.liveprojectspringbootreact.salonapi;

import lombok.Data;

@Data
public class SalonDetail {
    private String name;
    private String address;
    private String zipcode;
    private String city;
    private String state;
    private String phone;
}
