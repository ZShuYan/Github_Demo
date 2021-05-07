package com.fc.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HouseList {
    private Integer id;
    private String houseid;
    private String address;
    private double area;
    private double price;
    private String status;

}
