package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.model.VO.CommunityVO;
import com.tencent.wxcloudrun.service.CommunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/living-room/communityItems")
public class CommunityController {

    @Autowired
    private CommunityService communityService;

    @GetMapping
    public List<CommunityVO> getAllCommunities() {
        return communityService.getAllCommunities();
    }
}