//package com.example.fitnesstrackerprototype1;
//
////package com.example.fitnesstrackerprototype1;
//
//import android.content.BroadcastReceiver;
//import android.content.Context;
//import android.content.Intent;
//
//public class BootReceiver extends BroadcastReceiver {
//    @Override
//    public void onReceive(Context context, Intent intent) {
//        if (Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction())) {
//            MainActivity.scheduleDailyNotification(context);
//        }
//    }
//}

package com.example.fitnesstrackerprototype1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class BootReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction())) {
            MainActivity.scheduleDailyNotification(context);
        }
    }
}