package com.seecen.service;

import com.seecen.pojo.Carousel;

import java.util.List;

public interface ICarouselService {

    /**
     * 查询所有轮播图列表
     * @param isShow
     * @return
     */
    public List<Carousel> queryAll(Integer isShow);

}
