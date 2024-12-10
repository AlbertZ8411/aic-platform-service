package com.tencent.wxcloudrun.service;
import com.tencent.wxcloudrun.model.VO.VisitorVO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudyVisitorService
{
    public List<VisitorVO> getAllVisitor()
    {
        List<VisitorVO> Visitor = new ArrayList<>();
        Visitor.add(new VisitorVO(1, "test for test for test", "https://img.js.design/assets/img/67180739c861649a3c7efbf6.png#f626dca42639174b12e4c6b53cee2687","AIC金牌"));
        Visitor.add(new VisitorVO(2, "进行一个测的试", "https://img.js.design/assets/img/67180739c861649a3c7efbf6.png#f626dca42639174b12e4c6b53cee2687","你好"));
        Visitor.add(new VisitorVO(3, "进行两个测的试", "https://img.js.design/assets/img/67180739c861649a3c7efbf6.png#f626dca42639174b12e4c6b53cee2687","AIC金的牌"));
        return Visitor;
    }

}
