package com.teamtreehouse.mibbit;

import android.app.Application;

import com.parse.Parse;


public class MibbitApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "sMpe2ZIflPDIClV7LSELvGM1sqkyDZblkAggPzJv", "KrqPZwKLRW5WV65vdwYlZWWBy4LXVupBFRs5hQbv");

    }
}
