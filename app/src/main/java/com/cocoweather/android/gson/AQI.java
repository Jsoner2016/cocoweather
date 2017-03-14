package com.cocoweather.android.gson;

/**
 * Created by Jsoner on 2017/3/14.
 *"aqi":{
 *     "city":{
 *         "aqi":"44",
 *         "pm":"13"
 *     }
 *}
 */
public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
