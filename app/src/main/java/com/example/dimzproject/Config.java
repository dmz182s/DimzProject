package com.example.dimzproject;

public class Config {
    public static final String mServerUrl = "http://169.254.120.185:3306/remote_LED/";

    public static final String URL_ADD_DATA =mServerUrl+"AddData.php";
    public static final String URL_GET_DATA =mServerUrl+"GetData.php";
    public static final String URL_GET_LAST_STATUS =mServerUrl+"GetLastStatus.php";

    public static final String KEY_ID = "id";
    public static final String KEY_POWER = "power";
    public static final String KEY_TIME = "time";

    public static final String TAG_JSON_ARRAY = "result";
    public static final String TAG_ID = "id";
    public static final String TAG_POWER = "power";
    public static final String TAG_TIME = "time";
}