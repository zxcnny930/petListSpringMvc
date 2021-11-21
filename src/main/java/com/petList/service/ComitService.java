package com.petList.service;

import com.petList.pojo.Comit;

import java.util.List;

public interface ComitService {
    //搜尋
    List<Comit> SelectAllComit(Comit comit);
    //刪除
    int DeleteComitById(int id );
    //上傳貓
    int UpdateCat(Comit comit);
    //上傳狗
    int UpdateDog(Comit comit);


}
