package com.tencent.wxcloudrun.service.Study;


import com.tencent.wxcloudrun.model.VO.MentorVO;
import com.tencent.wxcloudrun.model.VO.VisitorVO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MentorService
{
    public List<MentorVO> getAllMentor()
    {
        List<MentorVO> Mentor = new ArrayList<>();
        Mentor.add(new MentorVO(1,"TC","https://img.js.design/assets/smartFill/img324164da746310.jpg","金牌大厨"));
        Mentor.add(new MentorVO(2,"NH","https://img.js.design/assets/smartFill/img324164da746310.jpg","银牌大厨"));
        Mentor.add(new MentorVO(3,"ABC","https://img.js.design/assets/smartFill/img324164da746310.jpg","铜牌大厨"));
        return Mentor;
    }

}
