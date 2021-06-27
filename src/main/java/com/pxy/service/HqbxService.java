package com.pxy.service;

import com.pxy.pojo.Bxxx;

import java.util.List;

public interface HqbxService {

    //增加报修信息
    void addBxxx(Bxxx bxxx);

    //根据id删除一个报修信息
    void deleteBxxxById(int id);

    //更新报修信息
    int updateBxxx(Bxxx bxxx);

    //根据id查询,返回一个Bxxx
    Bxxx queryBxxxById(int id);

    //查询全部Bxxx,返回list集合
    List<Bxxx> queryAllBxxx();
}

