package com.fc.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Zulist {
    private Integer zid;
    private String house_id;
    private Double price;
    private String address;
    private Integer userlist_id;
    private Integer contract_id;
    private Userlist userlist;

}
