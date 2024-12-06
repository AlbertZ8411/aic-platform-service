package com.tencent.wxcloudrun.controller;


import com.tencent.wxcloudrun.model.VO.NewsVO;
import com.tencent.wxcloudrun.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/newsItems")
public class NewsController {

    @Autowired
    private NewsService newsService;

    @GetMapping
    public List<NewsVO> getAllNews() {
        return newsService.getAllNews();
    }
}