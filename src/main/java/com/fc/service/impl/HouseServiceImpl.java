package com.fc.service.impl;

import com.fc.bean.HouseList;
import com.fc.dao.HouselistMapper;
import com.fc.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HouseServiceImpl implements HouseService {
    @Autowired
    private HouselistMapper houselistMapper;
    @Override
    public List<HouseList> showHouseList() {

        return houselistMapper.findAllHouse ();
    }
    @Override
    public HouseList findById(int id) {

        return houselistMapper.findById(id);
    }

    @Override
    public int deleteHouse(int id) {

        return houselistMapper.deleteHouse(id);
    }

    @Override
    public HouseList findByHouse(HouseList houselist) {

        return houselistMapper.findByHouse(houselist);
    }

    @Override
    public int addHouse(HouseList houseList) {

        return  houselistMapper.addHouse(houseList);
    }

    @Override
    public int updateHouse(HouseList houseList) {
        return houselistMapper.updateHouse(houseList);
    }


}
