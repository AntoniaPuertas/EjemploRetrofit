package com.toni.ejemploretrofit;

import com.toni.ejemploretrofit.io.model.Villano;

import java.util.ArrayList;

public class Datos {
    private static Datos instancia;
    private static ArrayList<Villano> listaVillanos;

    private Datos(){
        listaVillanos = new ArrayList<Villano>();
    }

    public static Datos getInstance(){
        if(instancia == null){
            instancia = new Datos();
        }
        return instancia;
    }

    public static void inicializarDatos(){
        instancia = null;
    }

    public ArrayList<Villano> getListaVillanos(){
        return listaVillanos;
    }

}
