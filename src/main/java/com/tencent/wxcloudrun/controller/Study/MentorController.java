package com.tencent.wxcloudrun.controller.Study;


import com.tencent.wxcloudrun.model.VO.MentorVO;
import com.tencent.wxcloudrun.model.VO.VisitorVO;
import com.tencent.wxcloudrun.service.Study.MentorService;
import com.tencent.wxcloudrun.service.Study.VisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Study/Mentor")
public class MentorController
{
    @Autowired
    private MentorService mentorService;

    @GetMapping
    public List<MentorVO> getAllMentor()
    {
        return mentorService.getAllMentor();
    }

}
