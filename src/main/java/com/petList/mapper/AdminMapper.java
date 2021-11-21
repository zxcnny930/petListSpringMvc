package com.petList.mapper;

import com.petList.pojo.Admin;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;
@Mapper
public interface AdminMapper {
    //驗證帳號

    List<Admin> CheckAdmin(Admin admin);

    List<Admin> Check();
}
