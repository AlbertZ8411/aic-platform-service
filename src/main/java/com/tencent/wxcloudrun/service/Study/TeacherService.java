package com.tencent.wxcloudrun.service.Study;


import com.tencent.wxcloudrun.model.VO.TeacherVO;
import com.tencent.wxcloudrun.model.VO.VisitorVO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeacherService
{
    public List<TeacherVO> getAllTeacher()
    {
        List<TeacherVO> Teacher = new ArrayList<>();
        Teacher.add(new TeacherVO(1,"TC","https://img.js.design/assets/smartFill/img324164da746310.jpg","金牌大厨"));
        Teacher.add(new TeacherVO(2,"NH","https://img.js.design/assets/smartFill/img324164da746310.jpg","银牌大厨"));
        Teacher.add(new TeacherVO(3,"ABC","https://img.js.design/assets/smartFill/img324164da746310.jpg","铜牌大厨"));
        return Teacher;
    }

}
