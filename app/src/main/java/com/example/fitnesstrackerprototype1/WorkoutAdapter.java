package com.example.fitnesstrackerprototype1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import java.text.DecimalFormat;

public class WorkoutAdapter extends RecyclerView.Adapter<WorkoutAdapter.ViewHolder> {
    private List<Workout> workouts = new ArrayList<>();

    public void setWorkouts(List<Workout> workouts) {
        this.workouts = workouts;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_workout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Workout workout = workouts.get(position);
        // Bind workout data to ViewHolder
        holder.bind(workout);
    }

    @Override
    public int getItemCount() {
        return workouts.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        // Define ViewHolder views
        TextView startDateTextView;
        TextView endDateTextView;
        TextView startTimeTextView;
        TextView endTimeTextView;
        TextView startCoordinatesTextView;
        TextView endCoordinatesTextView;
        TextView displacementTextView;

        TextView totalDistanceTextView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            // Initialize ViewHolder views
            startDateTextView = itemView.findViewById(R.id.startDateTextView);
            endDateTextView = itemView.findViewById(R.id.endDateTextView);
            startTimeTextView = itemView.findViewById(R.id.startTimeTextView);
            endTimeTextView = itemView.findViewById(R.id.endTimeTextView);
            startCoordinatesTextView = itemView.findViewById(R.id.startCoordinatesTextView);
            endCoordinatesTextView = itemView.findViewById(R.id.endCoordinatesTextView);
            displacementTextView = itemView.findViewById(R.id.displacementTextView);
            totalDistanceTextView = itemView.findViewById((R.id.totalDistanceTextView));
        }

        public void bind(Workout workout) {
            // Bind workout data to views
            startDateTextView.setText("Start Date: " + workout.getDate());
            endDateTextView.setText("End Date: " + workout.getDate());
            startTimeTextView.setText("Start Time: " + workout.getStartTime());
            endTimeTextView.setText("End Time: " + workout.getEndTime());
            startCoordinatesTextView.setText(("Starting Coordinates: (" + workout.getStartLocation().getLatitude() + ", " + workout.getStartLocation().getLongitude() + ")"));
            endCoordinatesTextView.setText(("Ending Coordinates: (" + workout.getEndLocation().getLatitude() + ", " + workout.getEndLocation().getLongitude() + ")"));

//            DecimalFormat df = new DecimalFormat("#.###");
//            double roundedNum = Double.parseDouble(df.format(workout.getDisplacement()));
//            displacementTextView.setText("Displacement: " + roundedNum + " Kilometers");

            DecimalFormat df = new DecimalFormat("#.###");
            double roundedDisp = Double.parseDouble(df.format(workout.getDisplacement()));
            displacementTextView.setText("Displacement: " + roundedDisp + " Kilometers");
            double roundedDist = Double.parseDouble(df.format(workout.getTotalDistance()));
            totalDistanceTextView.setText("Total Distance Covered: " + roundedDist + " Kilometers");

        }
    }
}