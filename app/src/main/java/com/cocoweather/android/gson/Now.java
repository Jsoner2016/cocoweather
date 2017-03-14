package com.cocoweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Jsoner on 2017/3/14.
 * "now": {  //实况天气
 "cond": {  //天气状况
 "code": "104",  //天气状况代码
 "txt": "阴"  //天气状况描述
 }
 */
public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
