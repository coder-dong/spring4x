package com.smart.editor;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.util.Date;

/**
 * Created by coding-dong on 2018/6/14.
 */
public class Plane {

    private String name;

    private String type;

    private double price;

    private Date produceDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getProduceDate() {
        return produceDate;
    }

    public void setProduceDate(Date produceDate) {
        this.produceDate = produceDate;
    }

    public Plane(String name, String type, double price, Date produceDate) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.produceDate = produceDate;
    }

    public Plane() {
    }

    @Override
    public String toString() {
        return JSONObject.toJSONString(this, SerializerFeature.WriteDateUseDateFormat);
    }
}
