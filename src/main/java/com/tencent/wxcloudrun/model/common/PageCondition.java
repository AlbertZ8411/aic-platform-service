package com.tencent.wxcloudrun.model.common;

import lombok.Data;

/**
 *
 * @author zhualbert <a href="mailto:albert.zhu8411@gmail.com">Albert Zhu</a>
 * @version 1.0
 *
 * */
@Data
public class PageCondition<T> extends Condition<T> {

    private Integer pageNum;

    private Integer pageSize;

}
