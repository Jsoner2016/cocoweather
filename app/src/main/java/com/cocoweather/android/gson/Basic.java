package com.cocoweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Jsoner on 2017/3/14.
 * "basic":{
 *     "city":"苏州"，
 *     "id":"CN101190401"
 *     "update”：{
 *         “loc”:"2022-09-09 19:09"
 *     }
 * }
 */
public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }

}
