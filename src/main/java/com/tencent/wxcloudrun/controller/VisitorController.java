package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.model.VO.NewsVO;
import com.tencent.wxcloudrun.model.VO.VisitorVO;
import com.tencent.wxcloudrun.service.NewsService;
import com.tencent.wxcloudrun.service.StudyVisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/Study/Visitor")

public class VisitorController
{
    @Autowired
    private StudyVisitorService visitorService;

    @GetMapping
    public List<VisitorVO> getAllVisitor() {
        return visitorService.getAllVisitor();
    }
}
