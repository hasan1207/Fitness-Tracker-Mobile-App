package com.example.fitnesstrackerprototype1;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

//public class WaterCalculatorActivity extends AppCompatActivity {
//
//    private EditText editTextHeight;
//    private EditText editTextWeight;
//    private EditText editTextDuration;
//    private EditText editTextCaloriesBurnt;
//    private TextView textViewResult;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_water);
//
//        editTextHeight = findViewById(R.id.editTextHeight);
//        editTextWeight = findViewById(R.id.editTextWeight);
//        editTextDuration = findViewById(R.id.editTextDuration);
//        editTextCaloriesBurnt = findViewById(R.id.editTextCaloriesBurnt);
//        textViewResult = findViewById(R.id.textViewResult);
//
//        Button calculateButton = findViewById(R.id.calculateButton);
//        calculateButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                calculateWaterIntake();
//            }
//        });
//    }
//
//    private void calculateWaterIntake() {
//        // Get inputs from EditText fields
//        float height = Float.parseFloat(editTextHeight.getText().toString());
//        float weight = Float.parseFloat(editTextWeight.getText().toString());
//        int duration = Integer.parseInt(editTextDuration.getText().toString());
//        int caloriesBurnt = Integer.parseInt(editTextCaloriesBurnt.getText().toString());
//
//        // Calculate water intake using a formula or guideline
//        // Example formula: 0.03 liters per kilogram of body weight per hour of exercise
//        float waterIntakeLiters = (float) (0.03 * weight * duration / 60.0);
//
//        // Optionally adjust water intake based on calories burnt or other factors
//
//        // Display the result
//        String result = String.format(Locale.getDefault(), "Water Intake: %.2f liters", waterIntakeLiters);
//        textViewResult.setText(result);
//    }
//}

import android.widget.Spinner;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;

public class WaterCalculatorActivity extends AppCompatActivity {

    private EditText editTextHeight;
    private EditText editTextWeight;
    private EditText editTextDuration;
    private Spinner spinnerIntensity; // Added Spinner for intensity
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water);

        editTextHeight = findViewById(R.id.editTextHeight);
        editTextWeight = findViewById(R.id.editTextWeight);
        editTextDuration = findViewById(R.id.editTextDuration);
        spinnerIntensity = findViewById(R.id.spinnerIntensity); // Initialize Spinner
        textViewResult = findViewById(R.id.textViewResult);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.intensity_levels, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerIntensity.setAdapter(adapter);

        Button calculateButton = findViewById(R.id.calculateButton);
//        calculateButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                calculateWaterIntake();
//            }
//        });

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateWaterIntake();

                LottieAnimationView av = new LottieAnimationView(WaterCalculatorActivity.this);
                av.setAnimation(R.raw.water);
                av.playAnimation();

                Toast t = new Toast(WaterCalculatorActivity.this);
                t.setView(av);
                t.setDuration(Toast.LENGTH_LONG);
                t.show();
            }
        });
    }

    private void calculateWaterIntake() {
        // Get inputs from EditText fields
        float height = Float.parseFloat(editTextHeight.getText().toString());
        float weight = Float.parseFloat(editTextWeight.getText().toString());
        int duration = Integer.parseInt(editTextDuration.getText().toString());

        // Get selected intensity level from Spinner
        String intensity = spinnerIntensity.getSelectedItem().toString();
        int caloriesBurnt;
        switch (intensity) {
            case "Low":
                caloriesBurnt = 100; // Set a default value for low intensity
                break;
            case "Moderate":
                caloriesBurnt = 200; // Set a default value for moderate intensity
                break;
            case "High":
                caloriesBurnt = 300; // Set a default value for high intensity
                break;
            default:
                caloriesBurnt = 0; // Set a default value if intensity is not recognized
        }

        // Calculate water intake using a formula or guideline
        // Example formula: 0.03 liters per kilogram of body weight per hour of exercise
        //float waterIntakeLiters = (float) (0.03 * weight * duration / 60.0);
        //float waterIntakeLiters = (float) ((float) (0.03 * weight * duration / 60.0) + (caloriesBurnt / 200.0));
        float waterIntakeLiters = (float) ((0.03 * weight * duration / 60.0) + (caloriesBurnt / 200.0) + (height / 100.0 * 0.1));
        // Optionally adjust water intake based on calories burnt or other factors

        // Display the result
        String result = String.format(Locale.getDefault(), "Water Intake: %.2f liters", waterIntakeLiters);
        textViewResult.setText(result);
    }
}
