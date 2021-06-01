package com.toni.ejemploretrofit.io.response;

import com.toni.ejemploretrofit.io.model.Villano;

import java.util.ArrayList;

public class RespuestaServidor {
    private ArrayList<Villano> listaVillanos;

    public RespuestaServidor(ArrayList<Villano> listaVillanos){
        this.listaVillanos = listaVillanos;
    }


    public ArrayList<Villano> getListaVillanos() {
        return listaVillanos;
    }

    public void setListaVillanos(ArrayList<Villano> listaVillanos) {
        this.listaVillanos = listaVillanos;
    }
}
