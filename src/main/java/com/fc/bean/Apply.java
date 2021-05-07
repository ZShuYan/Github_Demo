package com.fc.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Apply {
    private Integer id;
    private String house_id;
    private String address;
    private double area;
    private double price;
    private Integer userlist_id;
    private String status;
    private Userlist userlist;

}
