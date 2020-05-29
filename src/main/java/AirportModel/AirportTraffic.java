package AirportModel;

import RetrofitBuilderPackage.RetrofitsBuilderClass;
import javafx.scene.control.ListView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import service.AirportServiceAPI;

import java.util.ArrayList;
import java.util.List;

public class AirportTraffic {
    private String text;
    private ArrayList<Airport> airport;

    public ArrayList<Airport> getAirport() {
        return airport;
    }



    @Override
    public String toString() {
        return "AirportTraffic{" +
                "airport=" + airport +
                '}';
    }

    public AirportTraffic(String text) {
        this.text = text;
    }

    public void ExecuteSearch(ListView airportsView){
        final String BASE_URL ="https://cometari-airportsfinder-v1.p.rapidapi.com";
        RetrofitsBuilderClass retrofitsBuilder = new RetrofitsBuilderClass(BASE_URL);
        Retrofit retrofit = retrofitsBuilder.getRetrofit();
        AirportServiceAPI airportServiceAPI = retrofit.create(AirportServiceAPI.class);
        ArrayList<String> airportStrings = new ArrayList<>();

        Call<List<Airport>> call = airportServiceAPI.getAirports(text);
        call.enqueue(new Callback<List<Airport>>() {
            @Override
            public void onResponse(Call<List<Airport>> call, Response<List<Airport>> response) {

                List<Airport> airports = response.body();
                for(Airport a : airports){
                    airportsView.getItems().add(a.toString());
                }

            }

            @Override
            public void onFailure(Call<List<Airport>> call, Throwable t) {
                System.out.println(t.getMessage());
            }
        });

    }
}
