package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Now {
    @SerializedName("tmp")
    public String temperatrue;

    public More more;

    private class More {
        @SerializedName("txt")
        public String info;
    }
}
