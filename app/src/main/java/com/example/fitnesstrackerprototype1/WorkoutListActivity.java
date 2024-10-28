package com.example.fitnesstrackerprototype1;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WorkoutListActivity extends AppCompatActivity {


    private DatabaseReference mDatabase;
    private RecyclerView recyclerView;
    private WorkoutAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_workout_list);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Initialize Firebase database reference
        mDatabase = FirebaseDatabase.getInstance().getReference().child("Fitness Tracker").child("Workouts");

        // Initialize RecyclerView
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Initialize adapter
        adapter = new WorkoutAdapter();
        recyclerView.setAdapter(adapter);

        // Retrieve data from Firebase
        retrieveWorkouts();
    }

    private void retrieveWorkouts() {
        mDatabase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                List<Workout> workouts = new ArrayList<>();
                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                    Workout workout = snapshot.getValue(Workout.class);
                    if (workout != null) {
                        workouts.add(workout);
                    }
                }
                sortWorkoutsByDateAndTimeDescending(workouts);
                adapter.setWorkouts(workouts);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                // Handle error
            }
        });
    }

    private void sortWorkoutsByDateAndTimeDescending(List<Workout> workouts) {
        Collections.sort(workouts, new Comparator<Workout>() {
            @Override
            public int compare(Workout w1, Workout w2) {
                // Compare by startDate first
                int dateComparison = w2.getDate().compareTo(w1.getDate());
                if (dateComparison != 0) {
                    return dateComparison;
                }
                // If startDate is the same, compare by startTime
                return w2.getStartTime().compareTo(w1.getStartTime());
            }
        });
    }
}