package service;

import AirportModel.Airport;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

import java.util.List;

public interface AirportServiceAPI {

    @Headers({
            "x-rapidapi-host:cometari-airportsfinder-v1.p.rapidapi.com",
            "x-rapidapi-key:7cced2c12fmshc4fcaaff61a7d5ap1a048bjsn46ddaaada51c"

    })

    @GET("/api/airports/by-text?")
    Call<List<Airport>> getAirports(@Query("text") String text);
}
