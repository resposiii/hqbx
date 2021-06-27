package com.pxy.service;

import com.pxy.dao.HqbxMapper;
import com.pxy.pojo.Bxxx;

import java.util.List;


public class HqbxServiceImpl implements HqbxService {

    private HqbxMapper hqbxMapper;

    public void setHqbxMapper(HqbxMapper hqbxMapper) {
        this.hqbxMapper = hqbxMapper;
    }


    public void addBxxx(Bxxx bxxx) {
        hqbxMapper.addBxxx(bxxx);
    }

    public void deleteBxxxById(int id) {
        hqbxMapper.deleteBxxxById(id);
    }

    public int updateBxxx(Bxxx bxxx) {
        return hqbxMapper.updateBxxx(bxxx);
    }

    public Bxxx queryBxxxById(int id) {
        return hqbxMapper.queryBxxxById(id);
    }

    public List<Bxxx> queryAllBxxx() {
        return hqbxMapper.queryAllBxxx();
    }
}

