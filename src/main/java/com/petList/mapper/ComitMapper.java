package com.petList.mapper;

import com.petList.pojo.CatFrom;
import com.petList.pojo.Comit;
import com.petList.pojo.DogFrom;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;
@Mapper
public interface ComitMapper {
    //搜尋
    List<Comit> SelectAllComit(Comit comit);
    //刪除
    int DeleteComitById(int id );
    //上傳貓
    int UpdateCat(Comit comit);
    //上傳狗
    int UpdateDog(Comit comit);


}
