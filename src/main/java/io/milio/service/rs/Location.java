package io.milio.service.rs;

public class Location {
    public String lat;
    public String lon;

    public Location() {
    }

    @Override
    public String toString() {
        return "Location{" +
                "lat='" + lat + '\'' +
                ", lon='" + lon + '\'' +
                '}';
    }
}
