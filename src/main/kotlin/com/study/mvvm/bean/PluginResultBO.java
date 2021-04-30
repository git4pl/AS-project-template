package com.study.mvvm.bean;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.study.mvvm.plugin.Plugin;

import java.awt.Component;

public class PluginResultBO {
    private Plugin plugin;


    private Boolean success;

    private DisplayType displayType;

    private JSON data;

    public Boolean getSuccess() {
        return this.success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public DisplayType getDisplayType() {
        return this.displayType;
    }

    public void setDisplayType(DisplayType displayType) {
        this.displayType = displayType;
    }

    public JSON getData() {
        return this.data;
    }

    public void setData(JSON data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return (this.success != null && this.success.booleanValue());
    }

    public Plugin getPlugin() {
        return this.plugin;
    }

    public void setPlugin(Plugin plugin) {
        this.plugin = plugin;
    }

    public PluginResultBO(Plugin plugin, Boolean success, DisplayType displayType, JSON data) {
        this.plugin = plugin;
        this.success = success;
        this.displayType = displayType;
        this.data = data;
    }

    public static PluginResultBO getSuccessInstance(Plugin plugin, DisplayType displayType, JSON data) {
        return new PluginResultBO(plugin, Boolean.valueOf(true), displayType, data);
    }

    public static PluginResultBO getSuccessInstanceWithTextArea(Plugin plugin, String text) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("text", text);
        return getSuccessInstance(plugin, DisplayType.TextArea, (JSON)jsonObject);
    }

    public static PluginResultBO getSuccessInstanceWithComponent(Plugin plugin, Component component) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("component", component);
        return getSuccessInstance(plugin, DisplayType.Component, (JSON)jsonObject);
    }

    public static PluginResultBO getFailInstance(Plugin plugin, DisplayType displayType, JSON data) {
        return new PluginResultBO(plugin, Boolean.valueOf(false), displayType, data);
    }

    public static PluginResultBO getFailInstance(Plugin plugin) {
        return new PluginResultBO(plugin, Boolean.valueOf(false), null, null);
    }
}

