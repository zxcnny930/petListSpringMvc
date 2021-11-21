package com.petList.service.Impl;

import com.petList.mapper.FromMapper;
import com.petList.pojo.CatFrom;
import com.petList.pojo.DogFrom;
import com.petList.service.FromService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FromImpl implements FromService {
    @Autowired
    private FromMapper fromMapper;

    public void setFromMapper(FromMapper fromMapper) {
        this.fromMapper = fromMapper;
    }
//////////////////////////////////////////////////////////////
    @Override
    public List<CatFrom> CatFrom(CatFrom catFrom) {
        return null;
    }

    @Override
    public List<DogFrom> DogFrom(DogFrom dogFrom) {
        return null;
    }
}
