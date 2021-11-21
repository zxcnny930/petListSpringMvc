package com.petList.service.Impl;

import com.petList.mapper.ComitMapper;
import com.petList.pojo.Comit;
import com.petList.service.ComitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ComitImpl implements ComitService {
    @Autowired
    private ComitMapper comitMapper;

    public void setComitMapper(ComitMapper comitMapper) {
        this.comitMapper = comitMapper;
    }
    //////////////////////////////////////////////////////////////
    @Override
    public List<Comit> SelectAllComit(Comit comit) {
        return comitMapper.SelectAllComit(comit);
    }

    @Override
    public int DeleteComitById(int id) {
        return comitMapper.DeleteComitById(id);
    }

    @Override
    public int UpdateCat(Comit comit) {
        return comitMapper.UpdateCat(comit);

    }

    @Override
    public int UpdateDog(Comit comit) {
        return comitMapper.UpdateDog(comit);
    }
}
