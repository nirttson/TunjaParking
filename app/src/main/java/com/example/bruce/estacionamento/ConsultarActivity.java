package com.example.bruce.estacionamento;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.List;

import com.example.bruce.estacionamento.DB.CarroDAO;
import com.example.bruce.estacionamento.DB.Carro;

public class ConsultarActivity extends AppCompatActivity {
    private ListView listaCarros;
    private ImageButton consultar;
    private String placa;
    private EditText campoConsulta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultar);

        listaCarros = findViewById(R.id.lista_consultar);
        consultar = findViewById(R.id.ibConsultar);
        campoConsulta = findViewById(R.id.edtConsulta);

        consultar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                placa = campoConsulta.getText().toString();
                consultaCarros();
            }
        });
    }

    public void consultaCarros(){

        final CarroDAO dao = new CarroDAO(ConsultarActivity.this);
        List<Carro> carros = dao.consultar(placa);
        dao.close();

        ListaCarrosAdapter adpt = new ListaCarrosAdapter(carros, ConsultarActivity.this);
        listaCarros.setAdapter(adpt);
    }

    @Override
    public void onResume(){
        super.onResume();
    }




}
