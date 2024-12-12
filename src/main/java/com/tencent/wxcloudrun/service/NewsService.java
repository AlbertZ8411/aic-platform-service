package com.tencent.wxcloudrun.service;

import org.springframework.stereotype.Service;

import com.tencent.wxcloudrun.model.VO.NewsVO;

import java.util.ArrayList;
import java.util.List;

@Service
public class NewsService
{
    public List<NewsVO> getAllNews() {
        List<NewsVO> newsItems = new ArrayList<>();
        newsItems.add(new NewsVO("https://img.js.design/assets/smartFill/img431164da758808.jpg", "AIC最新变动态1", 1696123200000L,"这里是咨询1的内容"));
        newsItems.add(new NewsVO("https://img.js.design/assets/smartFill/img431164da758808.jpg", "AIC最新变动态1", 1696219200000L,"这里是咨询2的内容"));
        return newsItems;
    }

}
