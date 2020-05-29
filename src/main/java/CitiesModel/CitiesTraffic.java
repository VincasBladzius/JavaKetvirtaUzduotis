package CitiesModel;

import AirportModel.Airport;
import AirportModel.AirportLocation;
import RetrofitBuilderPackage.RetrofitsBuilderClass;
import javafx.scene.control.ListView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import service.AirportServiceAPI;
import service.CitiesServiceAPI;

import java.util.List;

public class CitiesTraffic {

    private float latitude;
    private float longitude;
    private int range;

    public CitiesTraffic(float latitude, float longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.range = 0;
    }

    public void ExcecuteSearch(ListView citiesView) {
        final String BASE_URL = "https://geocodeapi.p.rapidapi.com";
        RetrofitsBuilderClass retrofitsBuilder = new RetrofitsBuilderClass(BASE_URL);
        Retrofit retrofit = retrofitsBuilder.getRetrofit();
        CitiesServiceAPI citiesServiceAPI = retrofit.create(CitiesServiceAPI.class);

        Call<List<City>> call = citiesServiceAPI.getCities(latitude, longitude, range);
        call.enqueue(new Callback<List<City>>() {
            @Override
            public void onResponse(Call<List<City>> call, Response<List<City>> response) {
                List<City> airport = response.body();
                for (City a : airport) {
                    citiesView.getItems().add(a.toString());
                }

            }

            @Override
            public void onFailure(Call<List<City>> call, Throwable t) {
                System.out.println(t.getMessage());
            }
        });
    }}

