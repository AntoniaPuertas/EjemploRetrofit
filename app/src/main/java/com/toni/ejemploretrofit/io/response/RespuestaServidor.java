package com.toni.ejemploretrofit.io.response;

import com.toni.ejemploretrofit.io.model.Villano;

import java.util.ArrayList;

public class RespuestaServidor {
    private ArrayList<Villano> mensaje;
    private int estado;

    public RespuestaServidor(ArrayList<Villano> listaVillanos, int estado){
        this.mensaje = listaVillanos;
        this.estado = estado;
    }


    public ArrayList<Villano> getListaVillanos() {
        return mensaje;
    }

    public void setListaVillanos(ArrayList<Villano> listaVillanos) {
        this.mensaje = listaVillanos;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
