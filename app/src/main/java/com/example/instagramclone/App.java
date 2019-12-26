package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("pPILuvtWSza6tWefWqwLzz3JFNqjFd6Y7RzGALLF")
                // if defined
                .clientKey("0n9E6N5JTn3unuaGZe9QPYpcr61Aois8eaPDZQpN")
                .server("https://parseapi.back4app.com/")
                .build()
        );



    }
}
