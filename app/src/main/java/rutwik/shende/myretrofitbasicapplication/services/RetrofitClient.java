package rutwik.shende.myretrofitbasicapplication.services;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    public static Retrofit getApiClient(String basurl){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(basurl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit;
    }
}
