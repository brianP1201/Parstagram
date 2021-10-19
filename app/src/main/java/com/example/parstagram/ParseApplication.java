package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register Parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("GuTquBxCGygnySrJaVQH0rFIPW8D0lY9Slax4IUv")
                .clientKey("Bx6RpX3XI6BQ2Usel8AFyk1CWQG3YYAj7vZE8p6P")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
