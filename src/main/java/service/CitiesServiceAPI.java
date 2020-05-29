package service;

import AirportModel.Airport;
import CitiesModel.Cities;
import CitiesModel.City;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

import java.util.List;

public interface CitiesServiceAPI {
    @Headers({
            "x-rapidapi-host:geocodeapi.p.rapidapi.com",
	"x-rapidapi-key:7cced2c12fmshc4fcaaff61a7d5ap1a048bjsn46ddaaada51c"
    })
    //@GET("/GetNearestCities?latitude=40.0756&longitude=116.59&range=0")
    @GET("/GetNearestCities?")
    Call<List<City>> getCities(@Query("latitude") double latitude,
                                @Query("longitude") double longitude,
                                @Query("range") int range
                               );

}
