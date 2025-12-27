package com.yxy.mapper;

import com.yxy.pojo.Brand;

import java.util.List;

public interface BrandMapper {


    /**
     * 查询所有
     * @return
     */
    public List<Brand> selectAll();
    
}
