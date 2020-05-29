package RetrofitBuilderPackage;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitsBuilderClass {

    private Retrofit retrofit;
    private String url;

    public RetrofitsBuilderClass(String url) {
        this.url = url;
        setRetrofit();
    }

    public Retrofit getRetrofit() {
        return retrofit;
    }

    public void setRetrofit() {
        this.retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }



}


