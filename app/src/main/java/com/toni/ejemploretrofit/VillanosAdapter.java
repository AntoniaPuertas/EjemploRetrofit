package com.toni.ejemploretrofit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.toni.ejemploretrofit.io.model.Villano;

import java.util.ArrayList;

public class VillanosAdapter extends RecyclerView.Adapter<VillanosAdapter.VillanosHolder>{
    ArrayList<Villano> listaVillanos;
    Context context;
    LayoutInflater inflater;

    public VillanosAdapter(ArrayList<Villano> listaVillanos, Context context) {
        this.listaVillanos = listaVillanos;
        this.context = context;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public VillanosHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item, parent, false);
        return new VillanosHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VillanosHolder holder, int position) {
        Villano villano = listaVillanos.get(position);
        holder.txtNombreVillano.setText(villano.getNombre());
        String imagenUrl = "https://apcpruebas.es/imagenes/" + villano.getImagen();
        Glide.with(context).load(imagenUrl).into(holder.imgVillano);
    }

    @Override
    public int getItemCount() {
        return listaVillanos.size();
    }

    class VillanosHolder extends RecyclerView.ViewHolder{
        ImageView imgVillano;
        TextView txtNombreVillano;

        public VillanosHolder(@NonNull View itemView) {
            super(itemView);
            imgVillano = itemView.findViewById(R.id.imgVillano);
            txtNombreVillano = itemView.findViewById(R.id.txtNombreVillanoItem);
        }
    }
}
