package com.petList.service.Impl;

import com.petList.mapper.AdminMapper;
import com.petList.pojo.Admin;
import com.petList.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdminImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;

    public void setAdminMapper(AdminMapper adminMapper) {
        this.adminMapper = adminMapper;
    }
    //////////////////////////////////////////////////////////////
    @Override
    public List<Admin> CheckAdmin(Admin admin) {
        return adminMapper.CheckAdmin(admin);
    }

    @Override
    public List<Admin> Check() {
        return adminMapper.Check();
    }
}
