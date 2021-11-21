package com.petList.service;

import com.petList.pojo.Admin;

import java.util.List;

public interface AdminService {
    //驗證帳號
    List<Admin> CheckAdmin(Admin admin);

    List<Admin> Check();
}
