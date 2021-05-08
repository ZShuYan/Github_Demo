package com.fc.service;

import com.fc.bean.HouseList;

import java.util.List;

public interface HouseService {
    //查询所有的房屋列表
    List<HouseList> showHouseList();
    //根据id查询房屋
    HouseList findById(int id);
    //更新房屋信息
    int updateHouse(HouseList houseList);
    //添加-->根据房屋查询房屋，主要是判断房屋是否存在
    HouseList findByHouse(HouseList houseList);
    //删除
    int  deleteHouse(int id);
    //添加房屋信息
    int addHouse(HouseList houselist);
}
