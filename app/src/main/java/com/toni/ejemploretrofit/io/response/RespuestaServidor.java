package com.toni.ejemploretrofit.io.response;

import com.toni.ejemploretrofit.io.model.Villano;

import java.util.ArrayList;

public class RespuestaServidor {
    private int estado;
    private ArrayList<Villano> mensaje;

    public RespuestaServidor(int estado, ArrayList<Villano> listaVillanos){
        this.estado = estado;
        this.mensaje = listaVillanos;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public ArrayList<Villano> getMensaje() {
        return mensaje;
    }

    public void setMensaje(ArrayList<Villano> mensaje) {
        this.mensaje = mensaje;
    }
}
