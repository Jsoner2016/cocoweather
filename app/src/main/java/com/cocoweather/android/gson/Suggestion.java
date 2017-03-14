package com.cocoweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Jsoner on 2017/3/14.
 *   "suggestion": {  //生活指数，仅限国内城市
 "comf": { //舒适度指数
 "brf": "较不舒适",  //简介
 "txt": "白天天气多云，同时会感到有些热，不很舒适。" //详细描述
 }
 */
public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort{
        @SerializedName("txt")
        public String info;
    }
    public class CarWash{
        @SerializedName("txt")
        public String info;
    }
    public class Sport{
        @SerializedName("txt")
        public String info;

    }
}
