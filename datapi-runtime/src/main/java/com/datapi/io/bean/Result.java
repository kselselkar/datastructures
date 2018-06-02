package com.datapi.io.bean;

import java.io.Serializable;

public class Result implements Serializable{

    private String status;

    public Result(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
