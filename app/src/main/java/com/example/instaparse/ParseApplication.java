package com.example.instaparse;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("Ga3mjZI47CZ0vnmgoiNe7a56XqoYotse9PQbw2xl")
                .clientKey("5SLtuImgaxgC5Vp7O9VxD8cCjJ21PmcMpIzhJanh")
                .server("https://parseapi.back4app.com")
                .build()
        );


    }
}
