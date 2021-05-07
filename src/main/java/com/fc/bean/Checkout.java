package com.fc.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Checkout {

    private Integer id;
    private String house_id;
    private String address;
    private String status;
    private Integer userlist_id;
    private Userlist userlist;


}
