package com.fc.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Userlist {
    private Integer id;
    private String name;
    private String idcard;
    private String phone;
    private Integer user_id;
    private List<Apply> apply;
    private List<Zulist> zulist;
    private List<Checkout> checkout;
    private List<Applyout> applyout;
    private User user;


}
