package com.toni.ejemploretrofit.io.response;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface ApiService {
    //Aquí se definen las estructuras de nuestras peticiones

    @GET("villanos.php")
    Call<RespuestaServidor> getDatos();
}
