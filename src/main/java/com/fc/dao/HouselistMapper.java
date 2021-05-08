package com.fc.dao;

import com.fc.bean.HouseList;

import java.util.List;

public interface HouselistMapper {
    List<HouseList> findAllHouse();

    HouseList findById(int id);

    int deleteHouse(int id);

    HouseList findByHouse(HouseList houselist);

    int addHouse(HouseList houseList);

    int updateHouse(HouseList houseList);
}
