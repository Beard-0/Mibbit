package com.teamtreehouse.mibbit;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseInstallation;
import com.parse.ParseUser;
import com.parse.PushService;
import com.teamtreehouse.mibbit.ui.MainActivity;
import com.teamtreehouse.mibbit.utils.ParseConstants;


public class MibbitApplication extends Application {

    public static void updateParseInstallation(ParseUser user) {
        ParseInstallation installation = ParseInstallation.getCurrentInstallation();
        installation.put(ParseConstants.KEY_USER_ID, user.getObjectId());
        installation.saveInBackground();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "sMpe2ZIflPDIClV7LSELvGM1sqkyDZblkAggPzJv", "KrqPZwKLRW5WV65vdwYlZWWBy4LXVupBFRs5hQbv");

        PushService.setDefaultPushCallback(this, MainActivity.class, R.drawable.ic_stat_ic_launcher);
    }
}
