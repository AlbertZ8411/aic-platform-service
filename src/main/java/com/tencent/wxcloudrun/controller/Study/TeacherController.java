package com.tencent.wxcloudrun.controller.Study;


import com.tencent.wxcloudrun.model.VO.TeacherVO;
import com.tencent.wxcloudrun.model.VO.VisitorVO;
import com.tencent.wxcloudrun.service.Study.TeacherService;
import com.tencent.wxcloudrun.service.Study.VisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Study/Teacher")
public class TeacherController
{
    @Autowired
    private TeacherService teacherService;

    @GetMapping
    public List<TeacherVO> getAllTeacher()
    {
        return teacherService.getAllTeacher();
    }

}
