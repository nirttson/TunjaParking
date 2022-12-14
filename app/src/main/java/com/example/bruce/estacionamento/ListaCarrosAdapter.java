package com.example.bruce.estacionamento;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import com.example.bruce.estacionamento.DB.Carro;

public class ListaCarrosAdapter extends BaseAdapter {
    private final List<Carro> carros;
    private final Activity activity;
    public final int numItems;


    public ListaCarrosAdapter(List<Carro> carros, Activity activity) {
        this.carros = carros;
        this.activity = activity;
        this.numItems = carros.size();
    }

    @Override
    public int getCount() {
        return numItems;
    }


    @Override
    public Object getItem(int position) {
        return carros.get(position);
    }

    @Override
    public long getItemId(int position) {
        return carros.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = activity.getLayoutInflater().inflate(R.layout.item_carro, null);
        Carro carro = carros.get(position);
        TextView txtDono = v.findViewById(R.id.txtDono1);
        TextView txtDocumento = v.findViewById(R.id.txtModelo1);
        TextView txtplaca = v.findViewById(R.id.txtPlaca1);
        //TextView txtTelefone = v.findViewById(R.id.txtTelefone1);

        if(carro.getEstacionado() == 1) v.setBackgroundColor(activity.getResources().getColor(R.color.carro_estacionado));
        else v.setBackgroundColor(activity.getResources().getColor(R.color.carro_desestacionado));

        txtDono.setText(carro.getDono());
        txtDocumento.setText(carro.getModelo());
        txtplaca.setText(" " + carro.getPlaca());

        return v;
    }
}
