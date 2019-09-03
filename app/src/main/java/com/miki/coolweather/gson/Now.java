package com.miki.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class Now {
    @SerializedName("tmp")
    public String temperature;

    public String vis;
    public String wind_dir;
    @SerializedName("cond_txt")
    public  String info;

}
