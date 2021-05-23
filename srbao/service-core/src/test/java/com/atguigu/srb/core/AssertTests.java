package com.atguigu.srb.core;

import org.junit.Test;
import org.springframework.util.Assert;

/**
 * Author:虾饺
 * Date: 2021/5/19 22:00
 */
public class AssertTests {

    //if else的用法
    @Test
    public void test1() {
        Object o = null;
        if (o == null) {
            throw new IllegalArgumentException("用户不存在.");
        }
    }

        //断言的用法：更为简洁
    @Test
    public void test2() {
        // 另一种写法
        Object o = null;
        Assert.notNull(o, "用户不存在.");
    }

}
