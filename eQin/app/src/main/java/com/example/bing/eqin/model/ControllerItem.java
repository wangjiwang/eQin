package com.example.bing.eqin.model;

import com.chad.library.adapter.base.entity.MultiItemEntity;

import java.util.Date;

public class ControllerItem {
    private DeviceItem deviceItem;
    private String data;
    private Date date;

    public DeviceItem getDeviceItem() {
        return deviceItem;
    }

    public void setDeviceItem(DeviceItem deviceItem) {
        this.deviceItem = deviceItem;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
