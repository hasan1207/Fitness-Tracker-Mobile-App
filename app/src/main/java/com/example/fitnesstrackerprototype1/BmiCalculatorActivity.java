package com.example.fitnesstrackerprototype1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;

public class BmiCalculatorActivity extends AppCompatActivity {

    private EditText editTextWeight;
    private EditText editTextHeight;
    private Button buttonCalculate;
    private TextView textViewResult;

    private static final float UNDERWEIGHT_THRESHOLD = 18.5f;
    private static final float NORMAL_THRESHOLD = 24.9f;
    private static final float OVERWEIGHT_THRESHOLD = 29.9f;
    private static final float MAX_BMI = 40.0f; // Example maximum BMI value
    private static final float MIN_BMI = 10.0f; // Example minimum BMI value


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);

        editTextWeight = findViewById(R.id.editTextWeight);
        editTextHeight = findViewById(R.id.editTextHeight);
        buttonCalculate = findViewById(R.id.buttonCalculate);
        textViewResult = findViewById(R.id.textViewResult);

//        buttonCalculate.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                calculateBMI();
//            }
//        });

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                LottieAnimationView av = new LottieAnimationView(BmiCalculatorActivity.this);
                av.setAnimation(R.raw.bmi);
                av.playAnimation();

                Toast t = new Toast(BmiCalculatorActivity.this);
                t.setView(av);
                t.setDuration(Toast.LENGTH_LONG);
                t.show();

                calculateBMI();
            }
        });
    }

//    private void calculateBMI() {
//        String weightStr = editTextWeight.getText().toString();
//        String heightStr = editTextHeight.getText().toString();
//
//        if (weightStr.isEmpty() || heightStr.isEmpty()) {
//            textViewResult.setText("Please enter weight and height.");
//            return;
//        }
//
//        float weight = Float.parseFloat(weightStr);
//        float height = Float.parseFloat(heightStr) / 100; // converting cm to meters
//
//        float bmi = weight / (height * height);
//
//        String bmiResult = String.format("Your BMI: %.2f", bmi);
//        textViewResult.setText(bmiResult);
//
//
//
//        // Update ProgressBar color based on BMI value
//        ProgressBar progressBar = findViewById(R.id.bmiProgressBar);
//
//        // Scale BMI to range [0, 100]
//        int progress = (int) ((bmi - MIN_BMI) / (MAX_BMI - MIN_BMI) * 100);
//        progressBar.setProgress(progress);
//
//        // Adjust visibility based on calculated BMI
//        if (bmi < UNDERWEIGHT_THRESHOLD) {
//            progressBar.setProgressDrawable(getResources().getDrawable(R.drawable.bmi_progress_bar_underweight));
//        } else if (bmi < NORMAL_THRESHOLD) {
//            progressBar.setProgressDrawable(getResources().getDrawable(R.drawable.bmi_progress_bar_normal));
//        } else if (bmi < OVERWEIGHT_THRESHOLD) {
//            progressBar.setProgressDrawable(getResources().getDrawable(R.drawable.bmi_progress_bar_overweight));
//        } else {
//            progressBar.setProgressDrawable(getResources().getDrawable(R.drawable.bmi_progress_bar_obese));
//        }
//
//        progressBar.setVisibility(View.VISIBLE); // Show the progress bar
//    }

    private void calculateBMI() {
        String weightStr = editTextWeight.getText().toString();
        String heightStr = editTextHeight.getText().toString();

        if (weightStr.isEmpty() || heightStr.isEmpty()) {
            textViewResult.setText("Please enter weight and height.");
            return;
        }

        float weight = Float.parseFloat(weightStr);
        float height = Float.parseFloat(heightStr) / 100; // converting cm to meters

        float bmi = weight / (height * height);

        String bmiResult = String.format("Your BMI: %.2f", bmi);
        textViewResult.setText(bmiResult);

        // Update ProgressBar color based on BMI value
        ProgressBar progressBar = findViewById(R.id.bmiProgressBar);
        //ProgressBar progressBar = findViewById(R.id.bmiProgressBar);
        progressBar.setVisibility(View.VISIBLE);
        // Scale BMI to range [0, 100]
        int progress = (int) ((bmi - MIN_BMI) / (MAX_BMI - MIN_BMI) * 100);
        progressBar.setProgress(progress);

        // Adjust visibility based on calculated BMI
        progressBar.setVisibility(View.VISIBLE); // Show the progress bar

        // Set progress bar's progress drawable based on BMI category
        if (bmi < UNDERWEIGHT_THRESHOLD) {
            progressBar.setProgressDrawable(getResources().getDrawable(R.drawable.bmi_progress_bar));
        } else if (bmi < NORMAL_THRESHOLD) {
            progressBar.setProgressDrawable(getResources().getDrawable(R.drawable.bmi_progress_bar));
        } else if (bmi < OVERWEIGHT_THRESHOLD) {
            progressBar.setProgressDrawable(getResources().getDrawable(R.drawable.bmi_progress_bar));
        } else {
            progressBar.setProgressDrawable(getResources().getDrawable(R.drawable.bmi_progress_bar));
        }
    }


}