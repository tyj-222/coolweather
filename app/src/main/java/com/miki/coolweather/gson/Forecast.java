package com.miki.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class Forecast {
    public String date;

    @SerializedName("cond_txt_d")
    public String info;

    public String tmp_max;
    public String tmp_min;
}
