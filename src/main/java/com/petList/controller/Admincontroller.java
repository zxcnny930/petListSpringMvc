package com.petList.controller;

import com.petList.pojo.Admin;
import com.petList.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class Admincontroller {
    @Autowired
    private AdminService adminService;
    @RequestMapping("/Check")
    public String list(Model model){
        List<Admin> admin = adminService.Check();
        model.addAttribute("list",admin);
    return "allAdmin";
    }
}
