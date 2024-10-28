package com.example.fitnesstrackerprototype1;//package com.example.fitnesstrackerprototype1;
////package com.example.fitnesstrackerprototype1;
////
////public class StopwatchActivity {
////}
//
//import android.os.Bundle;
//import android.os.Handler;
//import android.support.v7.app.AppCompatActivity;
//import android.widget.TextView;
//
//public class StopwatchActivity extends AppCompatActivity {
//
//    private int seconds = 0;
//    private boolean running;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_stopwatch);
//        runTimer();
//    }
//
//    public void onClickStart() {
//        running = true;
//    }
//
//    public void onClickStop() {
//        running = false;
//    }
//
//    public void onClickReset() {
//        running = false;
//        seconds = 0;
//    }
//
//    private void runTimer() {
//        final TextView timeView = (TextView) findViewById(R.id.time_view);
//        final Handler handler = new Handler();
//        handler.post(new Runnable() {
//            @Override
//            public void run() {
//                int hours = seconds / 3600;
//                int minutes = (seconds % 3600) / 60;
//                int secs = seconds % 60;
//                String time = String.format("%d:%02d:%02d", hours, minutes, secs);
//                timeView.setText(time);
//                if (running) {
//                    seconds++;
//                }
//                handler.postDelayed(this, 1000);
//            }
//        });
//    }
//}
//
//import android.os.Bundle;
//import android.os.Handler;
//import android.support.v7.app.AppCompatActivity;
//import android.view.View;
//import android.widget.TextView;
//
//public class StopwatchActivity extends AppCompatActivity {
//
//    private int seconds = 0;
//    private boolean running;
//    private TextView timeView;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_stopwatch);
//        timeView = findViewById(R.id.time_view);
//        runTimer();
//    }
//
//    public void onClickStart(View view) {
//        running = true;
//    }
//
//    public void onClickStop(View view) {
//        running = false;
//    }
//
//    public void onClickReset(View view) {
//        running = false;
//        seconds = 0;
//    }
//
//    private void runTimer() {
//        final Handler handler = new Handler();
//        handler.post(new Runnable() {
//            @Override
//            public void run() {
//                int hours = seconds / 3600;
//                int minutes = (seconds % 3600) / 60;
//                int secs = seconds % 60;
//                String time = String.format("%02d:%02d:%02d", hours, minutes, secs);
//                timeView.setText(time);
//                if (running) {
//                    seconds++;
//                }
//                handler.postDelayed(this, 1000);
//            }
//        });
//    }
//}
//
//
//import android.app.Activity;
//import android.os.Bundle;
//import android.os.Handler;
//import android.view.View;
//import android.widget.TextView;
//
//public class StopwatchActivity extends Activity {
//
//    private int seconds = 0;
//    private boolean running;
//    private TextView timeView;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_stopwatch);
//        timeView = findViewById(R.id.time_view);
//        runTimer();
//    }
//
//    public void onClickStart(View view) {
//        running = true;
//    }
//
//    public void onClickStop(View view) {
//        running = false;
//    }
//
//    public void onClickReset(View view) {
//        running = false;
//        seconds = 0;
//    }
//
//    private void runTimer() {
//        final Handler handler = new Handler();
//        handler.post(new Runnable() {
//            @Override
//            public void run() {
//                int hours = seconds / 3600;
//                int minutes = (seconds % 3600) / 60;
//                int secs = seconds % 60;
//                String time = String.format("%02d:%02d:%02d", hours, minutes, secs);
//                timeView.setText(time);
//                if (running) {
//                    seconds++;
//                }
//                handler.postDelayed(this, 1000);
//            }
//        });
//    }
//}


//
//import android.os.Bundle;
//import android.os.Handler;
//import android.view.View;
//import android.widget.Button;
//import android.widget.TextView;
//import androidx.appcompat.app.AppCompatActivity;
//
//public class StopwatchActivity extends AppCompatActivity {
//
//    private int seconds = 0;
//    private boolean running;
//    private TextView stopwatchTextView;
//    private Button startButton;
//    private Button stopButton;
//    private Button resetButton;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_stopwatch);
//
//        stopwatchTextView = findViewById(R.id.stopwatchTextView);
//        startButton = findViewById(R.id.startButton);
//        stopButton = findViewById(R.id.stopButton);
//        resetButton = findViewById(R.id.resetButton);
//
//        startButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                onClickStart();
//            }
//        });
//
//        stopButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                onClickStop();
//            }
//        });
//
//        resetButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                onClickReset();
//            }
//        });
//
//        runTimer();
//    }
//
//    public void onClickStart() {
//        running = true;
//    }
//
//    public void onClickStop() {
//        running = false;
//    }
//
//    public void onClickReset() {
//        running = false;
//        seconds = 0;
//    }
//
////    private void runTimer() {
////        final Handler handler = new Handler();
////        handler.post(new Runnable() {
////            @Override
////            public void run() {
////                int hours = seconds / 3600;
////                int minutes = (seconds % 3600) / 60;
////                int secs = seconds % 60;
////
////                String time = String.format("%d:%02d:%02d", hours, minutes, secs);
////
////                stopwatchTextView.setText(time);
////
////                if (running) {
////                    seconds++;
////                }
////
////                handler.postDelayed(this, 1000);
////            }
////        });
////    }
//
//
//    private void runTimer() {
//        final Handler handler = new Handler();
//        handler.post(new Runnable() {
//            @Override
//            public void run() {
//                int hours = seconds / 3600;
//                int minutes = (seconds % 3600) / 60;
//                int secs = seconds % 60;
//
//                String time = String.format("%d:%02d:%02d", hours, minutes, secs);
//
//                stopwatchTextView.setText(time);
//
//                if (running) {
//                    seconds++;
//                }
//
//                handler.postDelayed(this, 1000);
//            }
//        });
//    }
//
//
//
//
//}


import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.location.Location;
import android.os.Bundle;
//import android.support.annotation.NonNull;
//import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.PowerManager;



//public class StopwatchActivity extends AppCompatActivity implements
//        GoogleApiClient.ConnectionCallbacks,
//        GoogleApiClient.OnConnectionFailedListener,
//        LocationListener {
//
//    private GoogleApiClient mGoogleApiClient;
//    private LocationRequest mLocationRequest;
//    private TextView locationTextView;
//    private int seconds = 0;
//    private boolean running;
//    private TextView stopwatchTextView;
//    private Button startButton;
//    private Button stopButton;
//    private Button resetButton;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_stopwatch);
//
//        stopwatchTextView = findViewById(R.id.stopwatchTextView);
//        startButton = findViewById(R.id.startButton);
//        stopButton = findViewById(R.id.stopButton);
//        resetButton = findViewById(R.id.resetButton);
//        locationTextView = findViewById(R.id.locationTextView);
//        buildGoogleApiClient();
//        mGoogleApiClient.connect();
//
//        startButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                onClickStart();
//            }
//        });
//
//        stopButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                onClickStop();
//            }
//        });
//
//        resetButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                onClickReset();
//            }
//        });
//
//        runTimer();
//    }
//
//    protected synchronized void buildGoogleApiClient() {
//        mGoogleApiClient = new GoogleApiClient.Builder(this)
//                .addConnectionCallbacks(this)
//                .addOnConnectionFailedListener(this)
//                .addApi(LocationServices.API)
//                .build();
//    }
//
//    public void onClickStart() {
//        running = true;
//    }
//
//    public void onClickStop() {
//        running = false;
//    }
//
//    public void onClickReset() {
//        running = false;
//        seconds = 0;
//    }
//
//
//    private void runTimer() {
//        final Handler handler = new Handler();
//        handler.post(new Runnable() {
//            @Override
//            public void run() {
//                int hours = seconds / 3600;
//                int minutes = (seconds % 3600) / 60;
//                int secs = seconds % 60;
//
//                String time = String.format("%d:%02d:%02d", hours, minutes, secs);
//
//                stopwatchTextView.setText(time);
//
//                if (running) {
//                    seconds++;
//                }
//
//                handler.postDelayed(this, 1000);
//            }
//        });
//    }
//
//
//    @Override
//    public void onConnected(@Nullable Bundle bundle) {
//        mLocationRequest = LocationRequest.create();
//        mLocationRequest.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);
//        mLocationRequest.setInterval(1000); // Update location every second
//        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
//            // TODO: Consider calling
//            //    ActivityCompat#requestPermissions
//            // here to request the missing permissions, and then overriding
//            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
//            //                                          int[] grantResults)
//            // to handle the case where the user grants the permission. See the documentation
//            // for ActivityCompat#requestPermissions for more details.
//            return;
//        }
//        LocationServices.FusedLocationApi.requestLocationUpdates(mGoogleApiClient, mLocationRequest, this);
//    }
//
//    @Override
//    public void onConnectionSuspended(int i) {
//
//    }
//
//    @Override
//    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
//
//    }
//
//    @Override
//    public void onLocationChanged(@NonNull Location location) {
//        String latitude = String.valueOf(location.getLatitude());
//        String longitude = String.valueOf(location.getLongitude());
//
//        // Update UI with location data
//        locationTextView.setText("Latitude: " + latitude + ", Longitude: " + longitude);
//    }
//
//    @Override
//    protected void onStart() {
//        super.onStart();
//        if (mGoogleApiClient != null) {
//            mGoogleApiClient.connect();
//        }
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        if (mGoogleApiClient != null && mGoogleApiClient.isConnected()) {
//            mGoogleApiClient.disconnect();
//        }
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        if (mGoogleApiClient != null) {
//            LocationServices.FusedLocationApi.removeLocationUpdates(mGoogleApiClient, this);
//            mGoogleApiClient.disconnect();
//        }
//    }
//}


//public class StopwatchActivity extends AppCompatActivity implements
//        GoogleApiClient.ConnectionCallbacks,
//        GoogleApiClient.OnConnectionFailedListener,
//        LocationListener {
//
//    private GoogleApiClient mGoogleApiClient;
//    private LocationRequest mLocationRequest;
//    private TextView locationTextView;
//    private int seconds = 0;
//    private boolean running;
//    private TextView stopwatchTextView;
//    private Button startButton;
//    private Button stopButton;
//    private Button resetButton;
//    private Button getLocationButton; // Add button reference
//
//
//    private static final int MY_PERMISSIONS_REQUEST_LOCATION = 123;
//
//
//    private ImageView gifImageView;
//    private GifDrawable gifDrawable;
//
//    private boolean isPlaying = false;
//    private Handler handler;
//
////    private ImageView gifImageView;
////    private GifDrawable gifDrawable;
////    private Button startAnimButton, stopAnimButton;
////    private boolean isPlaying = false;
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_stopwatch);
//
//        stopwatchTextView = findViewById(R.id.stopwatchTextView);
//        startButton = findViewById(R.id.startButton);
//        stopButton = findViewById(R.id.stopButton);
//        resetButton = findViewById(R.id.resetButton);
//        locationTextView = findViewById(R.id.locationTextView);
//        getLocationButton = findViewById(R.id.getLocationButton); // Initialize button reference
//
//
//        gifImageView = findViewById(R.id.gifImageView);
//
//
//        buildGoogleApiClient();
//        mGoogleApiClient.connect();
//
////        startButton.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View v) {
////                onClickStart();
////            }
////        });
////
////        stopButton.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View v) {
////                onClickStop();
////            }
////        });
//
//        resetButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                onClickReset();
//            }
//        });
//
//        getLocationButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                requestLocationUpdate(); // Call method to request location updates
//            }
//        });
//
////        Glide.with(this)
////                .asGif()
////                .load(R.drawable.animation2)
////                .diskCacheStrategy(DiskCacheStrategy.NONE)
////                .into(gifImageView);
////
////        startButton.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View v) {
////                onClickStart();
////            }
////        });
////
////        stopButton.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View v) {
////                onClickStop();
////            }
////        });
//
//        // Initialize handler for stopwatch
//        handler = new Handler();
//
//        startButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                onClickStart();
//            }
//        });
//
//        stopButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                onClickStop();
//            }
//        });
//
//        //runTimer();
//    }
//
//    protected synchronized void buildGoogleApiClient() {
//        mGoogleApiClient = new GoogleApiClient.Builder(this)
//                .addConnectionCallbacks(this)
//                .addOnConnectionFailedListener(this)
//                .addApi(LocationServices.API)
//                .build();
//    }
//
////    public void onClickStart() {
////        running = true;
////    }
////
////    public void onClickStop() {
////        running = false;
////    }
////public void onClickStart() {
////    running = true;
////    // Start GIF playback
////    gifDrawable = (GifDrawable) gifImageView.getDrawable();
////    gifDrawable.start();
////    isPlaying = true;
////}
//
//    public void onClickStart() {
//        if (!isPlaying) {
//            // Load GIF using Glide only when the user clicks the Start button
//            Glide.with(this)
//                    .asGif()
//                    .load(R.drawable.animation2)
//                    .diskCacheStrategy(DiskCacheStrategy.NONE)
//                    .into(gifImageView);
//
//            // Get the GifDrawable instance after loading the GIF
//            gifDrawable = (GifDrawable) gifImageView.getDrawable();
//
//            // Check if gifDrawable is not null and is loaded successfully
//            if (gifDrawable != null) {
//                // Start GIF playback
//                gifDrawable.start();
//                isPlaying = true;
//            } else {
//                // Handle error when GIF loading fails
//                // You can show a toast or log an error message
//                Log.e("StopwatchActivity", "Failed to load GIF");
//            }
//        }
//
//        running = true;
//        runTimer();
//    }
//
////    public void onClickStop() {
////        running = false;
////        // Stop GIF playback
////        if (isPlaying && gifDrawable != null) {
////            gifDrawable.stop();
////            isPlaying = false;
////        }
////    }
//
//    public void onClickStop() {
//        running = false;
//        // Stop GIF playback
//        if (isPlaying && gifDrawable != null) {
//            gifDrawable.stop();
//            isPlaying = false;
//            Log.d("StopwatchActivity", "GIF playback stopped");
//        } else {
//            Log.d("StopwatchActivity", "Unable to stop GIF playback: isPlaying=" + isPlaying + ", gifDrawable=" + gifDrawable);
//        }
//    }
//    public void onClickReset() {
//        running = false;
//        seconds = 0;
//    }
//
//    private void runTimer() {
//        final Handler handler = new Handler();
//        handler.post(new Runnable() {
//            @Override
//            public void run() {
//                int hours = seconds / 3600;
//                int minutes = (seconds % 3600) / 60;
//                int secs = seconds % 60;
//
//                String time = String.format("%d:%02d:%02d", hours, minutes, secs);
//
//                stopwatchTextView.setText(time);
//
//                if (running) {
//                    seconds++;
//                }
//
//                handler.postDelayed(this, 1000);
//            }
//        });
//    }
//
//
////
////    private void runTimer() {
////        handler.post(new Runnable() {
////            @Override
////            public void run() {
////                int hours = seconds / 3600;
////                int minutes = (seconds % 3600) / 60;
////                int secs = seconds % 60;
////
////                String time = String.format("%02d:%02d:%02d", hours, minutes, secs);
////
////                TextView stopwatchTextView = findViewById(R.id.stopwatchTextView);
////                stopwatchTextView.setText(time);
////
////                if (running) {
////                    seconds++;
////                }
////
////                handler.postDelayed(this, 1000);
////            }
////        });
////    }
//
//
//
//    private void requestLocationUpdate() {
//        if (mGoogleApiClient != null && mGoogleApiClient.isConnected()) {
//            if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
//                // Request location permissions
//                ActivityCompat.requestPermissions(this,
//                        new String[]{android.Manifest.permission.ACCESS_FINE_LOCATION, android.Manifest.permission.ACCESS_COARSE_LOCATION},
//                        MY_PERMISSIONS_REQUEST_LOCATION);
//                return;
//            }
//            LocationServices.FusedLocationApi.requestLocationUpdates(mGoogleApiClient, mLocationRequest, this);
//        }
//    }
//
//    // Override onRequestPermissionsResult to handle permission request response
//    @Override
//    public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {
//        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
//        switch (requestCode) {
//            case MY_PERMISSIONS_REQUEST_LOCATION: {
//                // If request is cancelled, the result arrays are empty.
//                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
//                    // Permission granted, proceed with location updates
//                    requestLocationUpdate();
//                } else {
//                    // Permission denied, handle accordingly (e.g., show a message)
//                    Toast.makeText(this, "Location permission denied", Toast.LENGTH_SHORT).show();
//                }
//                return;
//            }
//        }
//    }
//
//    @Override
//    public void onConnected(@Nullable Bundle bundle) {
//        mLocationRequest = LocationRequest.create();
//        mLocationRequest.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);
//        mLocationRequest.setInterval(1000); // Update location every second
//        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
//            // TODO: Handle permission
//            return;
//        }
//        LocationServices.FusedLocationApi.requestLocationUpdates(mGoogleApiClient, mLocationRequest, this);
//    }
//
//    @Override
//    public void onConnectionSuspended(int i) {
//    }
//
//    @Override
//    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
//    }
//
//    @Override
//    public void onLocationChanged(@NonNull Location location) {
//        String latitude = String.valueOf(location.getLatitude());
//        String longitude = String.valueOf(location.getLongitude());
//
//        // Update UI with location data
//        locationTextView.setText("Latitude: " + latitude + ", Longitude: " + longitude);
//
//        // Remove location updates after fetching once
//        LocationServices.FusedLocationApi.removeLocationUpdates(mGoogleApiClient, this);
//    }
//
//    @Override
//    protected void onStart() {
//        super.onStart();
//        if (mGoogleApiClient != null) {
//            mGoogleApiClient.connect();
//        }
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        if (mGoogleApiClient != null && mGoogleApiClient.isConnected()) {
//            mGoogleApiClient.disconnect();
//        }
//    }
//
//
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        if (mGoogleApiClient != null && mGoogleApiClient.isConnected()) {
//            LocationServices.FusedLocationApi.removeLocationUpdates(mGoogleApiClient, this);
//        }
//        if (mGoogleApiClient != null && mGoogleApiClient.isConnected()) {
//            mGoogleApiClient.disconnect();
//        }
//    }
//}


//public class StopwatchActivity extends AppCompatActivity implements
//        GoogleApiClient.ConnectionCallbacks,
//        GoogleApiClient.OnConnectionFailedListener,
//        LocationListener {
//
//    private GoogleApiClient mGoogleApiClient;
//    private LocationRequest mLocationRequest;
//    private TextView locationTextView;
//    private int seconds = 0;
//    private boolean running;
//    private TextView stopwatchTextView;
//    private Button startButton;
//    private Button stopButton;
//    private Button resetButton;
//    private Button getLocationButton; // Add button reference
//
//
//    private static final int MY_PERMISSIONS_REQUEST_LOCATION = 123;
//
//
//    private ImageView gifImageView;
//    private GifDrawable gifDrawable;
//
//    private boolean isPlaying = false;
//    private Handler handler;
//
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_stopwatch);
//
//        stopwatchTextView = findViewById(R.id.stopwatchTextView);
//        startButton = findViewById(R.id.startButton);
//        stopButton = findViewById(R.id.stopButton);
//        resetButton = findViewById(R.id.resetButton);
//        locationTextView = findViewById(R.id.locationTextView);
//        getLocationButton = findViewById(R.id.getLocationButton); // Initialize button reference
//
//
//        gifImageView = findViewById(R.id.gifImageView);
//
//
//        buildGoogleApiClient();
//        mGoogleApiClient.connect();
//
//
//        resetButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                onClickReset();
//            }
//        });
//
//        getLocationButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                requestLocationUpdate(); // Call method to request location updates
//            }
//        });
//
//
//
//        // Initialize handler for stopwatch
//        handler = new Handler();
//
//        startButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                onClickStart();
//            }
//        });
//
//        stopButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                onClickStop();
//            }
//        });
//
//        //runTimer();
//    }
//
//    protected synchronized void buildGoogleApiClient() {
//        mGoogleApiClient = new GoogleApiClient.Builder(this)
//                .addConnectionCallbacks(this)
//                .addOnConnectionFailedListener(this)
//                .addApi(LocationServices.API)
//                .build();
//    }
//
//
//
//    public void onClickStart() {
//        if (!isPlaying) {
//            // Load GIF using Glide only when the user clicks the Start button
//            Glide.with(this)
//                    .asGif()
//                    .load(R.drawable.animation2)
//                    .diskCacheStrategy(DiskCacheStrategy.NONE)
//                    .into(gifImageView);
//
//            // Get the GifDrawable instance after loading the GIF
//            gifDrawable = (GifDrawable) gifImageView.getDrawable();
//
//            // Check if gifDrawable is not null and is loaded successfully
//            if (gifDrawable != null) {
//                // Start GIF playback
//                gifDrawable.start();
//                isPlaying = true;
//            } else {
//                // Handle error when GIF loading fails
//                // You can show a toast or log an error message
//                Log.e("StopwatchActivity", "Failed to load GIF");
//            }
//        }
//
//        running = true;
//        runTimer();
//    }
//
//
//
//
//
//    public void onClickStop() {
//        running = false;
//        // Stop GIF playback
//        if (isPlaying && gifDrawable != null) {
//            gifDrawable.stop();
//            isPlaying = false;
//            Log.d("StopwatchActivity", "GIF playback stopped");
//        } else {
//            Log.d("StopwatchActivity", "Unable to stop GIF playback: isPlaying=" + isPlaying + ", gifDrawable=" + gifDrawable);
//        }
//    }
//    public void onClickReset() {
//        running = false;
//        seconds = 0;
//    }
//
//    private void runTimer() {
//        final Handler handler = new Handler();
//        handler.post(new Runnable() {
//            @Override
//            public void run() {
//                int hours = seconds / 3600;
//                int minutes = (seconds % 3600) / 60;
//                int secs = seconds % 60;
//
//                String time = String.format("%d:%02d:%02d", hours, minutes, secs);
//
//                stopwatchTextView.setText(time);
//
//                if (running) {
//                    seconds++;
//                }
//
//                handler.postDelayed(this, 1000);
//            }
//        });
//    }
//
//
//
//
//
//    private void requestLocationUpdate() {
//        if (mGoogleApiClient != null && mGoogleApiClient.isConnected()) {
//            if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
//                // Request location permissions
//                ActivityCompat.requestPermissions(this,
//                        new String[]{android.Manifest.permission.ACCESS_FINE_LOCATION, android.Manifest.permission.ACCESS_COARSE_LOCATION},
//                        MY_PERMISSIONS_REQUEST_LOCATION);
//                return;
//            }
//            LocationServices.FusedLocationApi.requestLocationUpdates(mGoogleApiClient, mLocationRequest, this);
//        }
//    }
//
//    // Override onRequestPermissionsResult to handle permission request response
//    @Override
//    public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {
//        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
//        switch (requestCode) {
//            case MY_PERMISSIONS_REQUEST_LOCATION: {
//                // If request is cancelled, the result arrays are empty.
//                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
//                    // Permission granted, proceed with location updates
//                    requestLocationUpdate();
//                } else {
//                    // Permission denied, handle accordingly (e.g., show a message)
//                    Toast.makeText(this, "Location permission denied", Toast.LENGTH_SHORT).show();
//                }
//                return;
//            }
//        }
//    }
//
//    @Override
//    public void onConnected(@Nullable Bundle bundle) {
//        mLocationRequest = LocationRequest.create();
//        mLocationRequest.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);
//        mLocationRequest.setInterval(1000); // Update location every second
//        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
//            // TODO: Handle permission
//            return;
//        }
//        LocationServices.FusedLocationApi.requestLocationUpdates(mGoogleApiClient, mLocationRequest, this);
//    }
//
//    @Override
//    public void onConnectionSuspended(int i) {
//    }
//
//    @Override
//    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
//    }
//
//    @Override
//    public void onLocationChanged(@NonNull Location location) {
//        String latitude = String.valueOf(location.getLatitude());
//        String longitude = String.valueOf(location.getLongitude());
//
//        // Update UI with location data
//        locationTextView.setText("Latitude: " + latitude + ", Longitude: " + longitude);
//
//        // Remove location updates after fetching once
//        LocationServices.FusedLocationApi.removeLocationUpdates(mGoogleApiClient, this);
//    }
//
//    @Override
//    protected void onStart() {
//        super.onStart();
//        if (mGoogleApiClient != null) {
//            mGoogleApiClient.connect();
//        }
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        if (mGoogleApiClient != null && mGoogleApiClient.isConnected()) {
//            mGoogleApiClient.disconnect();
//        }
//    }
//
//
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        if (mGoogleApiClient != null && mGoogleApiClient.isConnected()) {
//            LocationServices.FusedLocationApi.removeLocationUpdates(mGoogleApiClient, this);
//        }
//        if (mGoogleApiClient != null && mGoogleApiClient.isConnected()) {
//            mGoogleApiClient.disconnect();
//        }
//    }
//}


import com.bumptech.glide.request.RequestListener;

import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
//import android.support.annotation.NonNull;
//import android.support.annotation.Nullable;
//import android.support.v4.app.ActivityCompat;
//import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.gif.GifDrawable;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import android.telephony.SmsManager;
import android.widget.Toast;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

public class StopwatchActivity extends AppCompatActivity implements
        GoogleApiClient.ConnectionCallbacks,
        GoogleApiClient.OnConnectionFailedListener,
        LocationListener {

    //private PowerManager.WakeLock wakeLock;

    private GoogleApiClient mGoogleApiClient;
    //private static final int MY_PERMISSIONS_REQUEST_SEND_SMS = 0;

    private static final int MY_PERMISSIONS_REQUEST_SEND_SMS = 1;
    private DatabaseReference mDatabase;
    private LocationRequest mLocationRequest;
    private TextView locationTextView;
    private int seconds = 0;
    private boolean running;
    private TextView stopwatchTextView;
    private Button startButton;
    private Button stopButton;
    //private Button resetButton;
    private Button getLocationButton;
    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
    private static final int MY_PERMISSIONS_REQUEST_LOCATION = 123;
    private GifDrawable gifDrawable;

    private ImageView gifImageView;
    private boolean isPlaying = false;
    private Handler handler;

    //private String startDate;
    private String startTime;
    private String endTime;

    private double startLatitude;
    private double startLongitude;
    private double endLatitude;
    private double endLongitude;
    private String startDateStr;
    private String endDateStr;
    private ArrayList<Coordinates> coordinates;

    private SimpleDateFormat sdfDate;

    private int check = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stopwatch);
        sdfDate = new SimpleDateFormat("dd-MM-yyyy");
        startDateStr = sdfDate.format(new Date());

        mDatabase = FirebaseDatabase.getInstance().getReference().child("Fitness Tracker").child("Workouts");
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        stopwatchTextView = findViewById(R.id.stopwatchTextView);
        startButton = findViewById(R.id.startButton);
        stopButton = findViewById(R.id.stopButton);
        //resetButton = findViewById(R.id.resetButton);
        locationTextView = findViewById(R.id.locationTextView);
        getLocationButton = findViewById(R.id.getLocationButton);
        gifImageView = findViewById(R.id.gifImageView);
        buildGoogleApiClient();
        mGoogleApiClient.connect();
        coordinates = new ArrayList<Coordinates>();


        getLocationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                requestLocationUpdate();
            }
        });

        handler = new Handler(Looper.getMainLooper());

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickStart();
            }
        });

        stopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickStop();
            }
        });

        //FirebaseDatabase.getInstance().getReference().child("Fitness Tracker").child("Android").setValue("abcd");
    }

    protected synchronized void buildGoogleApiClient() {
        mGoogleApiClient = new GoogleApiClient.Builder(this)
                .addConnectionCallbacks(this)
                .addOnConnectionFailedListener(this)
                .addApi(LocationServices.API)
                .build();
    }



    private void checkForSmsPermission() {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.SEND_SMS)
                != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.SEND_SMS},
                    MY_PERMISSIONS_REQUEST_SEND_SMS);
        }
    }



    private void sendSMS(String phoneNumber, String message) {
        SmsManager smsManager = SmsManager.getDefault();
        try {
            smsManager.sendTextMessage(phoneNumber, null, message, null, null);
            Toast.makeText(getApplicationContext(), "SMS Sent!", Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
            Toast.makeText(getApplicationContext(), "SMS failed, please try again later!", Toast.LENGTH_SHORT).show();
            e.printStackTrace();
        }
    }

    private void writeToDatabase() {
        String workoutId = mDatabase.push().getKey();
        //endTime = new Date().toString();
        endTime = sdf.format(new Date());
        endDateStr = sdfDate.format(new Date());

        //SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        //String startDateStr = sdf.format(new Date());
        Coordinates start = new Coordinates(startLatitude, startLongitude);
        Coordinates end = new Coordinates(endLatitude, endLongitude);

        double totalDistance = 0.0;
        double firstDistance = 0.0;
        double lastDistance;

        firstDistance = start.distanceTo(coordinates.get(0));
        lastDistance = (coordinates.get(coordinates.size() - 1)).distanceTo(end);
        for(int i = 0; i < coordinates.size()-1; i++){
            totalDistance += coordinates.get(i).distanceTo(coordinates.get(i+1));
        }
        totalDistance = totalDistance + firstDistance + lastDistance;
        Workout workout = new Workout(startDateStr, endDateStr, startTime, endTime, start, end, totalDistance);


        checkForSmsPermission();
        String message = "";

        BigDecimal bd = new BigDecimal(Double.toString(totalDistance));
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        double roundedValue = bd.doubleValue();
        message += "Workout on - " + (new Date().toString()) + "\nDate: " + startDateStr + "\nTime: " + startTime + " to " + endTime + "\nTotal Distance covered: " + Math.round(roundedValue);
        sendSMS("9952665455", message);



        // Write the new workout to the database
        mDatabase.child("Workout on - " + (new Date().toString())).setValue(workout);
    }


    public void onClickStart() {

        if (check == 0) {
            check = check + 1;
            if (!running) {
                Glide.with(this)
                        .asGif()
                        .load(R.drawable.animation4)
                        .diskCacheStrategy(DiskCacheStrategy.NONE)
                        .listener(new RequestListener<GifDrawable>() {
                            @Override
                            public boolean onLoadFailed(@Nullable GlideException e, Object model, Target<GifDrawable> target, boolean isFirstResource) {
                                Log.e("StopwatchActivity", "Failed to load GIF", e);
                                return false; // Return false to allow loading to continue
                            }

                            @Override
                            public boolean onResourceReady(GifDrawable resource, Object model, Target<GifDrawable> target, DataSource dataSource, boolean isFirstResource) {
                                gifDrawable = resource; // Assign the loaded GIF to gifDrawable
                                gifDrawable.start(); // Start GIF playback
                                isPlaying = true; // Update isPlaying flag
                                return false; // Return false to allow loading to continue
                            }
                        })
                        .into(gifImageView);
                //SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                startTime = sdf.format(new Date());

            }

            running = true;
            requestLocationUpdate();
            runTimer();
        }

    }




    public void onClickStop() {
        check = 0;
        running = false;
        // Check if gifDrawable is not null before stopping
        if (gifDrawable != null && isPlaying) {
            gifDrawable.stop();
            isPlaying = false;
        }

        // Request a single location update when the stop button is clicked
        if (mGoogleApiClient != null && mGoogleApiClient.isConnected()) {
            if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                // TODO: Consider calling
                //    ActivityCompat#requestPermissions
                // here to request the missing permissions, and then overriding
                //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                //                                          int[] grantResults)
                // to handle the case where the user grants the permission. See the documentation
                // for ActivityCompat#requestPermissions for more details.
                return;
            }
            Location lastLocation = LocationServices.FusedLocationApi.getLastLocation(mGoogleApiClient);
            if (lastLocation != null) {
                endLatitude = lastLocation.getLatitude();
                endLongitude = lastLocation.getLongitude();
            }
        }

        // Write to the database
        writeToDatabase();
    }


    public void onClickReset() {

//        startTime = sdf.format(new Date());
        running = false;
        seconds = 0;
        stopwatchTextView.setText("0:00:00");
        if (isPlaying && gifDrawable != null) {
            gifDrawable.stop();
            isPlaying = false;
        }

    }








    private void runTimer() {
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if (running) {
                    int hours = seconds / 3600;
                    int minutes = (seconds % 3600) / 60;
                    int secs = seconds % 60;

                    String time = String.format("%d:%02d:%02d", hours, minutes, secs);
                    stopwatchTextView.setText(time);

                    seconds++; // Increment seconds only when running

                    // Schedule the next run after 1 second
                    handler.postDelayed(this, 1000);
                }
            }
        }, 1000);
    }



    private void requestLocationUpdate() {
        if (mGoogleApiClient != null && mGoogleApiClient.isConnected()) {
            if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(this,
                        new String[]{android.Manifest.permission.ACCESS_FINE_LOCATION, android.Manifest.permission.ACCESS_COARSE_LOCATION},
                        MY_PERMISSIONS_REQUEST_LOCATION);
                return;
            }
            LocationServices.FusedLocationApi.requestLocationUpdates(mGoogleApiClient, mLocationRequest, this);
        }
    }





    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode) {
            case MY_PERMISSIONS_REQUEST_LOCATION: {
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    requestLocationUpdate();
                } else {
                    Toast.makeText(this, "Location permission denied", Toast.LENGTH_SHORT).show();
                }
                return;
            }
            case MY_PERMISSIONS_REQUEST_SEND_SMS: {
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    // Permission granted, you can now send SMS
                    //sendSMS("9952665455", "Hello, this is a test message!"); // Example phone number and message
                } else {
                    Toast.makeText(this, "SMS permission denied", Toast.LENGTH_SHORT).show();
                }
                return;
            }
        }

    }

    @Override
    public void onConnected(@Nullable Bundle bundle) {
        mLocationRequest = LocationRequest.create();
        mLocationRequest.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);
        mLocationRequest.setInterval(1000);
        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            return;
        }
        //LocationServices.FusedLocationApi.requestLocationUpdates(mGoogleApiClient, mLocationRequest, this);
    }

    @Override
    public void onConnectionSuspended(int i) {}

    @Override
    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {}



    @Override
    public void onLocationChanged(@NonNull Location location) {
        String latitude = String.valueOf(location.getLatitude());
        String longitude = String.valueOf(location.getLongitude());
        locationTextView.setText("Latitude: " + latitude + ", Longitude: " + longitude);
        coordinates.add(new Coordinates(location.getLatitude(), location.getLongitude()));
        // Update the startLatitude and startLongitude variables when location changes
        if (running && startLatitude == 0 && startLongitude == 0) {
            startLatitude = location.getLatitude();
            startLongitude = location.getLongitude();
        }

        // Update the endLatitude and endLongitude variables when location changes and activity is not running
        if (!running) {
            endLatitude = location.getLatitude();
            endLongitude = location.getLongitude();
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        if (mGoogleApiClient != null) {
            mGoogleApiClient.connect();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (mGoogleApiClient != null && mGoogleApiClient.isConnected()) {
            mGoogleApiClient.disconnect();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mGoogleApiClient != null && mGoogleApiClient.isConnected()) {
            LocationServices.FusedLocationApi.removeLocationUpdates(mGoogleApiClient, this);
            mGoogleApiClient.disconnect();
        }
        getWindow().clearFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

    }
}
