package com.example.fitnesstrackerprototype1;

public class Coordinates {
    private double latitude;
    private double longitude;

    // Constructor

    public Coordinates(){
        this.latitude = 0;
        this.longitude = 0;
    }
    public Coordinates(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // Getters and setters
    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    // Method to calculate distance between two coordinates using Haversine formula
    public double distanceTo(Coordinates other) {
        final int R = 6371; // Radius of the earth in kilometers
        double latDistance = Math.toRadians(other.latitude - this.latitude);
        double lonDistance = Math.toRadians(other.longitude - this.longitude);
        double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
                + Math.cos(Math.toRadians(this.latitude)) * Math.cos(Math.toRadians(other.latitude))
                * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance = R * c; // convert to kilometers
        return distance;
    }

    // Override toString method for easy printing
    @Override
    public String toString() {
        return "(" + latitude + ", " + longitude + ")";
    }

    // Example usage
    public static void main(String[] args) {
        Coordinates coord1 = new Coordinates(40.7128, -74.0060); // New York City
        Coordinates coord2 = new Coordinates(34.0522, -118.2437); // Los Angeles

        System.out.println("com.example.fitnesstrackerprototype1.Coordinates 1: " + coord1);
        System.out.println("com.example.fitnesstrackerprototype1.Coordinates 2: " + coord2);

        double distance = coord1.distanceTo(coord2);
        System.out.println("Distance between coordinates: " + distance + " km");
    }
}
