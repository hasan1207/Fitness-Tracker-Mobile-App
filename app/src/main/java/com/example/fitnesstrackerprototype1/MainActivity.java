//package com.example.fitnesstrackerprototype1;
//
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.TextView;
//import androidx.appcompat.app.AppCompatActivity;
//import android.content.Intent;
//import android.net.Uri;
//import android.widget.Toast;
//
//
//
//public class MainActivity extends AppCompatActivity {
//
//    private TextView statusTextView;
//    private Button startButton;
//    private boolean isTracking = false;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        statusTextView = findViewById(R.id.statusTextView);
//        startButton = findViewById(R.id.startButton);
//
//        startButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (!isTracking) {
//                    startTracking();
//                } else {
//                    stopTracking();
//                }
//            }
//        });
//    }
//
//    private void startTracking() {
//        isTracking = true;
//        startButton.setText("Stop Tracking");
//        statusTextView.setText("Tracking started...");
//        // Add your GPS tracking logic here
//
//
//        // Start the Stopwatch activity
//        Intent intent = new Intent(this, StopwatchActivity.class);
//        startActivity(intent);
//
//
////
////        isTracking = true;
////        startButton.setText("Stop Tracking");
////        statusTextView.setText("Tracking started...");
////
////        // Launch Google Maps application
////        Uri gmmIntentUri = Uri.parse("geo:0,0?q=workout route");
////        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
////        mapIntent.setPackage("com.google.android.apps.maps");
////        if (mapIntent.resolveActivity(getPackageManager()) != null) {
////            startActivity(mapIntent);
////        } else {
////            // Google Maps not installed, handle the error
////            // For example, display a toast message
////            Toast.makeText(this, "Google Maps app not installed", Toast.LENGTH_SHORT).show();
////        }
//
////        isTracking = true;
////        startButton.setText("Stop Tracking");
////        statusTextView.setText("Tracking started...");
////        // Open Google Maps in a web browser
////        Uri gmmIntentUri = Uri.parse("https://www.google.com/maps");
////        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
////        mapIntent.setPackage("com.android.chrome"); // Use Chrome browser or change to another browser if needed
////        if (mapIntent.resolveActivity(getPackageManager()) != null) {
////            startActivity(mapIntent);
////        } else {
////            Toast.makeText(this, "No browser app found", Toast.LENGTH_SHORT).show();
////        }
//
//    }
//
//    private void stopTracking() {
//        isTracking = false;
//        startButton.setText("Start Tracking");
//        statusTextView.setText("Tracking stopped.");
//        // Add any necessary logic to stop tracking
//    }
//}


package com.example.fitnesstrackerprototype1;

import android.app.AlarmManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.app.ActivityCompat;

import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

import com.google.firebase.database.FirebaseDatabase;

import java.util.Calendar;

//public class MainActivity extends AppCompatActivity {
//
//    private TextView statusTextView;
//    private Button startButton;
//    private boolean isTracking = false;
//
//    private static final String CHANNEL_ID = "YOUR_CHANNEL_ID";
//    private static final int REQUEST_CODE_POST_NOTIFICATIONS = 1;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        createNotificationChannel();
//        checkAndRequestPermissions();
//        scheduleDailyNotification(this);
//
//        statusTextView = findViewById(R.id.statusTextView);
//        startButton = findViewById(R.id.startButton);
//        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
//
//        startButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (!isTracking) {
//                    startTracking();
//                } else {
//                    stopTracking();
//                }
//            }
//        });
//
//
//    }
//
//    public void openCalculator(View view) {
//        Intent intent = new Intent(this, CalculatorActivity.class);
//        startActivity(intent);
//    }
//
//    public void openBmiCalculator(View view) {
//        Intent intent = new Intent(this, BmiCalculatorActivity.class);
//        startActivity(intent);
//    }
//
//    public void openWaterCalculator(View view) {
//        Intent intent = new Intent(this, WaterCalculatorActivity.class);
//        startActivity(intent);
//    }
//
//    public void viewWorkouts(View view) {
//        Intent intent = new Intent(this, WorkoutListActivity.class);
//        startActivity(intent);
//    }
//
//    private void startTracking() {
//        isTracking = true;
//        startButton.setText("Stop Tracking");
//        statusTextView.setText("Tracking started...");
//
//        // Start the Stopwatch activity
//        Intent intent = new Intent(this, StopwatchActivity.class);
//        startActivity(intent);
//    }
//
//    private void stopTracking() {
//        isTracking = false;
//        startButton.setText("Start Tracking");
//        statusTextView.setText("Tracking stopped.");
//        // Add any necessary logic to stop tracking
//    }
//
//    private void createNotificationChannel() {
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
//            CharSequence name = "Daily Reminder Channel";
//            String description = "Channel for daily reminders";
//            int importance = NotificationManager.IMPORTANCE_HIGH;
//            NotificationChannel channel = new NotificationChannel(CHANNEL_ID, name, importance);
//            channel.setDescription(description);
//
//            NotificationManager notificationManager = getSystemService(NotificationManager.class);
//            notificationManager.createNotificationChannel(channel);
//        }
//    }
//
//    private void checkAndRequestPermissions() {
//        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED) {
//            ActivityCompat.requestPermissions(this, new String[]{android.Manifest.permission.POST_NOTIFICATIONS}, REQUEST_CODE_POST_NOTIFICATIONS);
//        }
//    }
//
//    public static void scheduleDailyNotification(Context context) {
//        Intent intent = new Intent(context, NotificationReceiver.class);
//        PendingIntent pendingIntent = PendingIntent.getBroadcast(
//                context, 0, intent, PendingIntent.FLAG_IMMUTABLE | PendingIntent.FLAG_UPDATE_CURRENT);
//
//        AlarmManager alarmManager = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);
//
//        Calendar calendar = Calendar.getInstance();
//        calendar.setTimeInMillis(System.currentTimeMillis());
//        calendar.set(Calendar.HOUR_OF_DAY, 16);
//        calendar.set(Calendar.MINUTE, 38);
//        calendar.set(Calendar.SECOND, 0);
//
//        if (calendar.getTimeInMillis() < System.currentTimeMillis()) {
//            calendar.add(Calendar.DAY_OF_YEAR, 1);
//        }
//
//        alarmManager.setRepeating(
//                AlarmManager.RTC_WAKEUP,
//                calendar.getTimeInMillis(),
//                AlarmManager.INTERVAL_DAY,
//                pendingIntent);
//    }
//
//    @Override
//    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
//        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
//        if (requestCode == REQUEST_CODE_POST_NOTIFICATIONS) {
//            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
//                // Permission granted, proceed with notification setup if needed
//            } else {
//                // Permission denied, handle as needed
//            }
//        }
//    }
//}
//
////public class MainActivity extends AppCompatActivity {
////
////    private static final String CHANNEL_ID = "YOUR_CHANNEL_ID";
////    private static final int REQUEST_CODE_POST_NOTIFICATIONS = 1;
////
////    @Override
////    protected void onCreate(Bundle savedInstanceState) {
////        super.onCreate(savedInstanceState);
////        setContentView(R.layout.activity_main);
////
////        createNotificationChannel();
////        checkAndRequestPermissions();
////        scheduleDailyNotification(this);
////    }
////
////    private void createNotificationChannel() {
////        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
////            CharSequence name = "Daily Reminder Channel";
////            String description = "Channel for daily reminders";
////            int importance = NotificationManager.IMPORTANCE_HIGH;
////            NotificationChannel channel = new NotificationChannel(CHANNEL_ID, name, importance);
////            channel.setDescription(description);
////
////            NotificationManager notificationManager = getSystemService(NotificationManager.class);
////            notificationManager.createNotificationChannel(channel);
////        }
////    }
////
////    private void checkAndRequestPermissions() {
////        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED) {
////            ActivityCompat.requestPermissions(this, new String[]{android.Manifest.permission.POST_NOTIFICATIONS}, REQUEST_CODE_POST_NOTIFICATIONS);
////        }
////    }
////
////    public static void scheduleDailyNotification(Context context) {
////        Intent intent = new Intent(context, NotificationReceiver.class);
////        PendingIntent pendingIntent = PendingIntent.getBroadcast(
////                context, 0, intent, PendingIntent.FLAG_IMMUTABLE | PendingIntent.FLAG_UPDATE_CURRENT);
////
////        AlarmManager alarmManager = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);
////
////        Calendar calendar = Calendar.getInstance();
////        calendar.setTimeInMillis(System.currentTimeMillis());
////        calendar.set(Calendar.HOUR_OF_DAY, 14);
////        calendar.set(Calendar.MINUTE, 0);
////        calendar.set(Calendar.SECOND, 0);
////
////        if (calendar.getTimeInMillis() < System.currentTimeMillis()) {
////            calendar.add(Calendar.DAY_OF_YEAR, 1);
////        }
////
////        alarmManager.setRepeating(
////                AlarmManager.RTC_WAKEUP,
////                calendar.getTimeInMillis(),
////                AlarmManager.INTERVAL_DAY,
////                pendingIntent);
////    }
////
////    @Override
////    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
////        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
////        if (requestCode == REQUEST_CODE_POST_NOTIFICATIONS) {
////            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
////                // Permission granted, proceed with notification setup if needed
////            } else {
////                // Permission denied, handle as needed
////            }
////        }
////    }
////
////
////}



import android.app.AlarmManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private static final String CHANNEL_ID = "daily_reminder_channel";
    private static final int REQUEST_CODE_POST_NOTIFICATIONS = 1;

    private TextView statusTextView;
    private Button startButton;
    private boolean isTracking = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        statusTextView = findViewById(R.id.statusTextView);
        startButton = findViewById(R.id.startButton);
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);

        createNotificationChannel();
        checkAndRequestPermissions();
        scheduleDailyNotification(this);

        startButton.setOnClickListener(v -> {
            if (!isTracking) {
                startTracking();
            } else {
                stopTracking();
            }
        });
    }

    private void createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            CharSequence name = "Daily Reminder Channel";
            String description = "Channel for daily reminders";
            int importance = NotificationManager.IMPORTANCE_HIGH;
            NotificationChannel channel = new NotificationChannel(CHANNEL_ID, name, importance);
            channel.setDescription(description);

            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        }
    }

    private void checkAndRequestPermissions() {
        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{android.Manifest.permission.POST_NOTIFICATIONS}, REQUEST_CODE_POST_NOTIFICATIONS);
        }
    }


    //Working with warning
//    public static void scheduleDailyNotification(Context context) {
//        Intent intent = new Intent(context, NotificationReceiver.class);
//        PendingIntent pendingIntent = PendingIntent.getBroadcast(
//                context, 0, intent, PendingIntent.FLAG_IMMUTABLE | PendingIntent.FLAG_UPDATE_CURRENT);
//
//        AlarmManager alarmManager = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);
//
//        Calendar calendar = Calendar.getInstance();
//        calendar.setTimeInMillis(System.currentTimeMillis());
//        calendar.set(Calendar.HOUR_OF_DAY, 18);  // 4 PM
//        calendar.set(Calendar.MINUTE, 3);
//        calendar.set(Calendar.SECOND, 0);
//
//        if (calendar.getTimeInMillis() < System.currentTimeMillis()) {
//            calendar.add(Calendar.DAY_OF_YEAR, 1);
//        }
//
//        alarmManager.setExactAndAllowWhileIdle(
//                AlarmManager.RTC_WAKEUP,
//                calendar.getTimeInMillis(),
//                pendingIntent);
//    }

    public static void scheduleDailyNotification(Context context) {
        Intent intent = new Intent(context, NotificationReceiver.class);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(
                context, 0, intent, PendingIntent.FLAG_IMMUTABLE | PendingIntent.FLAG_UPDATE_CURRENT);

        AlarmManager alarmManager = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);

        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.set(Calendar.HOUR_OF_DAY, 14);  // 2 PM
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);

        if (calendar.getTimeInMillis() < System.currentTimeMillis()) {
            calendar.add(Calendar.DAY_OF_YEAR, 1);
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
                if (alarmManager != null && !alarmManager.canScheduleExactAlarms()) {
                    // Device doesn't support scheduling exact alarms, handle gracefully
                    // For example, display a message to the user or use an alternative approach
                    Log.e("AlarmManager", "Device doesn't support scheduling exact alarms");
                    return;
                }
            }
        }

        try {
            alarmManager.setExactAndAllowWhileIdle(
                    AlarmManager.RTC_WAKEUP,
                    calendar.getTimeInMillis(),
                    pendingIntent);
        } catch (SecurityException e) {
            // Handle SecurityException gracefully
            Log.e("AlarmManager", "SecurityException when scheduling exact alarm: " + e.getMessage());
            // For example, display a message to the user or use an alternative approach
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == REQUEST_CODE_POST_NOTIFICATIONS) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                // Permission granted, proceed with notification setup if needed
            } else {
                // Permission denied, handle as needed
            }
        }
    }



    public void openBmiCalculator(View view) {
        Intent intent = new Intent(this, BmiCalculatorActivity.class);
        startActivity(intent);
    }

    public void openWaterCalculator(View view) {
        Intent intent = new Intent(this, WaterCalculatorActivity.class);
        startActivity(intent);
    }

    public void viewWorkouts(View view) {
        Intent intent = new Intent(this, WorkoutListActivity.class);
        startActivity(intent);
    }

    private void startTracking() {
        isTracking = true;
        startButton.setText("Stop Tracking");
        statusTextView.setText("Tracking started...");

        // Start the Stopwatch activity
        Intent intent = new Intent(this, StopwatchActivity.class);
        startActivity(intent);
    }

    private void stopTracking() {
        isTracking = false;
        startButton.setText("Start Tracking");
        statusTextView.setText("Tracking stopped.");
        // Add any necessary logic to stop tracking
    }
}