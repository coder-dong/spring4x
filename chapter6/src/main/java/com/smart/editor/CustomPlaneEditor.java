package com.smart.editor;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Created by coding-dong on 2018/6/14.
 */
public class CustomPlaneEditor extends PropertyEditorSupport{

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        if (text == null || "".equals(text.trim())){
            return;
        }

        String[] propertyArray = text.split(",");

        Plane plane = new Plane();
        plane.setName(propertyArray[0]);
        plane.setType(propertyArray[1]);
        plane.setPrice(Double.parseDouble(propertyArray[2]));
        try {
            plane.setProduceDate(new SimpleDateFormat("yyyyMMdd hhmmss").parse(propertyArray[3]));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        setValue(plane);
    }
}
