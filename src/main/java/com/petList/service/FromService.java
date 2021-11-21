package com.petList.service;

import com.petList.pojo.CatFrom;
import com.petList.pojo.DogFrom;

import java.util.List;

public interface FromService {

    //搜尋貓
    List<CatFrom> CatFrom(CatFrom catFrom);
    //蒐尋狗
    List<DogFrom> DogFrom(DogFrom dogFrom);

}
