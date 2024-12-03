package com.tencent.wxcloudrun.controller;


import com.tencent.wxcloudrun.model.Community;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class LivingRoomController {

    @GetMapping("/communityItems")
    public List<Community> getCommunityItems() {
        List<Community> communityItems = new ArrayList<>();

        communityItems.add(new Community(1,"https://img.js.design/assets/img/6746dd40de61f2f62e81ca5c.png#8c586aedfa9ff13dad28693e3b921790","AIC智汇1","AIC1智汇是为AI创业者量身打造的社区，致力于构建AI大模型交流社区与资源聚合生态。"));
        communityItems.add(new Community(2,"https://img.js.design/assets/img/6746dd40de61f2f62e81ca5c.png#8c586aedfa9ff13dad28693e3b921790","AIC智汇2","AIC2智汇是为AI创业者量身打造的社区，致力于构建AI大模型交流社区与资源聚合生态。"));
        communityItems.add(new Community(3,"https://img.js.design/assets/img/6746dd40de61f2f62e81ca5c.png#8c586aedfa9ff13dad28693e3b921790","AIC智汇3","AIC3智汇是为AI创业者量身打造的社区，致力于构建AI大模型交流社区与资源聚合生态。"));



        return communityItems;
    }
}