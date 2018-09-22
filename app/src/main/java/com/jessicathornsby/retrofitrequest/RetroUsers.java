package com.jessicathornsby.retrofitrequest;

import com.google.gson.annotations.SerializedName;

public class RetroUsers {

    @SerializedName("name")
    private String name;


    public RetroUsers(String name) {
        this.name = name;

    }

    public String getUser() {
        return name;
    }

    public void setUser(String name) {
        this.name = name;
    }



}
