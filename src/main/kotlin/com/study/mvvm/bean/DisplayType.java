package com.study.mvvm.bean;

import java.util.HashMap;
import java.util.Map;

public enum DisplayType {
    TextArea("textArea"),
    List("list"),
    Component("component"),
    UNKNOW("unknow");

    private String type;

    private static Map<String, DisplayType> cache;

    static {
        cache = new HashMap<>();
        cache.put("component", Component);
        cache.put("textArea", TextArea);
        cache.put("list", List);
    }

    DisplayType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public DisplayType getInstance(String name) {
        DisplayType displayType = cache.get(name);
        if (displayType == null)
            return UNKNOW;
        return displayType;
    }
}
