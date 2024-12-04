package com.tencent.wxcloudrun.service;

import com.tencent.wxcloudrun.model.VO.CommunityVO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommunityService {

    public List<CommunityVO> getAllCommunities() {
        List<CommunityVO> communityItems = new ArrayList<>();
        communityItems.add(new CommunityVO(1, "https://img.js.design/assets/img/6746dd40de61f2f62e81ca5c.png#8c586aedfa9ff13dad28693e3b921790", "AIC智汇1", "AIC1智汇是为AI创业者量身打造的社区，致力于构建AI大模型交流社区与资源聚合生态。"));
        communityItems.add(new CommunityVO(2, "https://img.js.design/assets/img/6746dd40de61f2f62e81ca5c.png#8c586aedfa9ff13dad28693e3b921790", "AIC智汇2", "AIC2智汇是为AI创业者量身打造的社区，致力于构建AI大模型交流社区与资源聚合生态。"));
        communityItems.add(new CommunityVO(3, "https://img.js.design/assets/img/6746dd40de61f2f62e81ca5c.png#8c586aedfa9ff13dad28693e3b921790", "AIC智汇3", "AIC3智汇是为AI创业者量身打造的社区，致力于构建AI大模型交流社区与资源聚合生态。"));

        return communityItems;
    }
}