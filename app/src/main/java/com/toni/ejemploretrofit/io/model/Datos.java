package com.toni.ejemploretrofit.io.model;

import java.util.ArrayList;

public class Datos {
    private static ArrayList<Villano> listaVillanos = new ArrayList<>();

    public static ArrayList<Villano> getListaVillanos() {
        return listaVillanos;
    }

    public static void setListaVillanos(ArrayList<Villano> listaVillanos) {
        Datos.listaVillanos = listaVillanos;
    }
}
