package CitiesModel;

public class City {
    private String Country;
    private String City;
    private int Population;
    private float Distance;

    public String getCountry() {
        return Country;
    }

    public String getCity() {
        return City;
    }

    public int getPopulation() {
        return Population;
    }

    public float getDistance() {
        return Distance;
    }

    public String stringDistance;

    public String getStringDistance(float distance) {
        stringDistance = String.format("%.02f", distance/1000);
        return stringDistance;
    }

    public void setStringDistance(String stringDistance) {
        this.stringDistance = stringDistance;
    }

    @Override
    public String toString() {
        return City + " " + Country + "\n" + " Population: " + Population + "\n" + " Distance: " + getStringDistance(Distance)  + "km";
    }
}
