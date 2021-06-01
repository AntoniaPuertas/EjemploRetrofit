package com.toni.ejemploretrofit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

import com.toni.ejemploretrofit.io.model.Datos;
import com.toni.ejemploretrofit.io.response.ApiAdapter;
import com.toni.ejemploretrofit.io.response.ApiService;
import com.toni.ejemploretrofit.io.response.RespuestaServidor;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    RecyclerView recycler;
    VillanosAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler = findViewById(R.id.recycler);
        getDatos(this);
    }

    private void getDatos(Context context){
        Retrofit retrofit = new ApiAdapter().getDatosServidor();
        ApiService service = retrofit.create(ApiService.class);

        Call<RespuestaServidor> call = service.getDatos();

        call.enqueue(new Callback<RespuestaServidor>() {
            @Override
            public void onResponse(Call<RespuestaServidor> call, Response<RespuestaServidor> response) {
                if(response.body() == null){
                    //el servidor no responde
                }else{

                        Datos.setListaVillanos(response.body().getListaVillanos());
                        mostrarRecycler(context);

                }
            }

            @Override
            public void onFailure(Call<RespuestaServidor> call, Throwable t) {
                System.out.println(t.toString());
                Toast.makeText(MainActivity.this, "Comprueba tu conexión", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void mostrarRecycler(Context context){
        adapter = new VillanosAdapter(Datos.getListaVillanos(), context);
        recycler.setAdapter(adapter);
        recycler.setLayoutManager(new LinearLayoutManager(this));
    }
}