package com.example.fitnesstrackerprototype1;

public class Workout {
    private String date;
    private String endDate;

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    private String startTime;
    private String endTime;

    private Coordinates startLocation;

    private Coordinates endLocation;

    private double displacement;
    private double totalDistance;


    // Empty constructor required for Firebase
    public Workout() {
    }

    public double getTotalDistance() {
        return totalDistance;
    }

    public void setTotalDistance(double totalDistance) {
        this.totalDistance = totalDistance;
    }

    public Workout(String date, String endDate, String startTime, String endTime, Coordinates startLocation, Coordinates endLocation, double totalDistance) {
        this.date = date;
        this.endDate = endDate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.startLocation = startLocation;
        this.endLocation = endLocation;
        this.displacement = this.startLocation.distanceTo(this.endLocation);
        this.totalDistance = totalDistance;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Coordinates getStartLocation() {
        return startLocation;
    }

    public void setStartLocation(Coordinates startLocation) {
        this.startLocation = startLocation;
    }

    public Coordinates getEndLocation() {
        return endLocation;
    }

    public void setEndLocation(Coordinates endLocation) {
        this.endLocation = endLocation;
    }

    public double getDisplacement() {
        return displacement;
    }

    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }
// Getters and setters...
}