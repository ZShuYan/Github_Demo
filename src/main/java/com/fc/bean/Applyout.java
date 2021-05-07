package com.fc.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 退租申请
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Applyout {
    private Integer id;
    private String house_id;
    private String address;
    private String status;
    private Integer userlist_id;
    private List<Userlist> userlist;


}
