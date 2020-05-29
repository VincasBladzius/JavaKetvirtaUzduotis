package AirportModel;

public class AirportLocation {
    private double longitude;
    private double latitude;

    public double getLongitude() {
        return longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    @Override
    public String toString() {
        return "longitude " + longitude +
                " latitude " + latitude;
    }
}
