package rutwik.shende.myretrofitbasicapplication.services;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rutwik.shende.myretrofitbasicapplication.models.User;

public interface SreviceApi {
    @GET("register.php")
    Call<User> doRegisteration(
            @Query("name") String name,
            @Query("email") String email,
            @Query("phone") String phone,
            @Query("password") String password
    );

    @GET("login.php")
    Call<User> doLogin(
            @Query("email") String email,
            @Query("password") String password
    );

}



