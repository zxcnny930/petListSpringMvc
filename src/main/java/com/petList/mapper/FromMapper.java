package com.petList.mapper;

import com.petList.pojo.CatFrom;
import com.petList.pojo.DogFrom;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;
@Mapper
public interface FromMapper {

    //搜尋貓
    List<CatFrom> CatFrom(CatFrom catFrom);
    //蒐尋狗
    List<DogFrom> DogFrom(DogFrom dogFrom);

}
