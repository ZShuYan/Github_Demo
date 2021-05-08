package com.fc.controller;

import com.fc.bean.HouseList;
import com.fc.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("house")
public class HouseController {
    /**
     * 房屋业务层对象
     */
    @Autowired
    private HouseService houseService;

    @RequestMapping("showHouseList")
    public String showHouseList(Model model) {
        // 查询出所有房屋信息
        List<HouseList> houselists = houseService.showHouseList();
        model.addAttribute("houselist", houselists);
        model.addAttribute("mainPage", "ahouselist.jsp");
        // 返回管理员首页
        return "admin/main1.jsp";
    }


    /**
     * 根据id查询房屋信息
     *
     * @param id    房屋id
     * @param model model对象
     * @return 首页
     */
    @RequestMapping("houseInfo")
    public String houseInfo(int id, Model model) {
        // 根据id查询出房屋信息
        HouseList house = houseService.findById(id);
        model.addAttribute("mainPage", "changehouse.jsp");
        model.addAttribute("houselist", house);
        return "admin/main1.jsp";
    }

    /**
     * 提交房屋信息修改
     *
     * @param houseList 修改为的房屋信息
     * @param model     model对象
     * @return
     */
    @RequestMapping("houseUpdate")
    public String houseUpdate(HouseList houseList, Model model) {
        System.out.println("更改信息传入的houseId:"+houseList.getHouseid ());
        HouseList house = houseService.findByHouse (houseList);
//        System.out.println ("findByHouse方法查询到的house:"+house.getHouseid ());
        // 如果house不为空，则代表该信息已经存在
        if (null != house) {
            //判断传入的houseid是否等于数据库查到的id
            if (!houseList.getHouseid ().equals (house.getHouseid ())){
                //相当于传入的id不等于它本身数据库的id
                System.out.println("房屋已经存在");
                model.addAttribute("error", "该房屋id已存在！");
                model.addAttribute("mainPage", "changehouse.jsp");
                model.addAttribute("houselist", houseList);
            }else {
                //相当于传入的id等于它本身数据库的id
                model.addAttribute("error", "该房屋id已存在！");
                model.addAttribute("mainPage", "changehouse.jsp");
                model.addAttribute("houselist", houseList);
            }
            return "admin/main1.jsp";
        } else {
            System.out.println("房屋id不同的不存在");
            int nums = houseService.updateHouse(houseList);
            if (nums > 0) {
                model.addAttribute("houselist", houseList);
                model.addAttribute("mainPage", "changehouse.jsp");
                model.addAttribute("error", "更新成功");
                return "admin/main1.jsp";
            } else {
                System.out.println("更新房屋信息失败");
                model.addAttribute("error", "更新房屋信息失败！");
                model.addAttribute("mainPage", "changehouse.jsp");
                model.addAttribute("houselist", house);
                return "admin/main1.jsp";
            }

        }
    }

    /**
     * 删除房屋信息
     *
     * @param id 根据id删除
     * @return showHouseList
     */
    @RequestMapping("deleteHouse")
    public String deleteHouse(int id) {
        houseService.deleteHouse(id);
        // 返回至展示房屋列表页面
        return "redirect:showHouseList";
    }

    /**
     * 跳转至添加房屋信息界面
     *
     * @param model
     * @return
     */
    @RequestMapping("toaddhouse")
    public String toaddhouse(Model model) {
        model.addAttribute("mainPage", "addhouse.jsp");
        return "admin/main1.jsp";
    }

    /**
     * 添加房屋信息
     *
     * @param houselist
     * @return
     */
    @RequestMapping("addhouse")
    public String addHouse(Model model,HouseList houselist) {
        System.out.println (houselist);
        // 查询当前房屋是否已经存在
        HouseList house = houseService.findByHouse(houselist);
        System.out.println (house);
        // 当前房屋不存在
        if (null != house) {
            model.addAttribute("error", "该房屋已经存在!");
            model.addAttribute("mainPage", "addhouse.jsp");
            model.addAttribute("houselist", houselist);
            return "admin/main1.jsp";
        } else {
            houseService.addHouse(houselist);
            model.addAttribute("error", "添加房屋成功!");
            model.addAttribute("mainPage", "addhouse.jsp");
            model.addAttribute("houselist", houselist);
            return "admin/main1.jsp";
        }

    }




}
