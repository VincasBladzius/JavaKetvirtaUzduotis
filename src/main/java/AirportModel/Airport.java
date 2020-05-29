package AirportModel;

public class Airport {
    private String airportId;
    private String code;
    private String name;
    private AirportLocation location;

    public String getName() {
        return name;
    }

    public String getAirportId() {
        return airportId;
    }

    public String getCode() {
        return code;
    }

    public AirportLocation getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Airport: " + getName() +

                ", code: " + getCode() + "  " +

                getLocation().toString() + "\n";
    }
}
