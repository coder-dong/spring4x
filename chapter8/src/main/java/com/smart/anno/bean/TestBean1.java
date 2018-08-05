package com.smart.anno.bean;

import com.smart.anno.InjectId;

/**
 * Created by coding-dong on 2018/7/10.
 */
@InjectId(canInject = false, sourceValue = "abc111")
public class TestBean1 {
    private String id = "";

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "TestBean1{" +
                "id='" + id + '\'' +
                '}';
    }
}
