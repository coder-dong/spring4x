package com.smart.anno.bean;

import com.smart.anno.InjectId;

/**
 * Created by coding-dong on 2018/7/10.
 */
@InjectId(canInject = true, sourceValue = "10010")
public class TestBean2 {
    private String id = "";

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "TestBean2{" +
                "id='" + id + '\'' +
                '}';
    }
}
