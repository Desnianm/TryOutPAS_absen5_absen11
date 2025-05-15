package com.example.tryoutpas_absen5_absen11;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
public class REtrofitClient {
    private static final String BASE_URL = "https://www.thesportsdb.com";
    private static Retrofit retrofit;

    public static Retrofit getInstance() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
