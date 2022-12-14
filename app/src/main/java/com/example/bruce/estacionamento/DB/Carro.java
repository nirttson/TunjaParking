package com.example.bruce.estacionamento.DB;

import java.io.Serializable;

public class Carro implements Serializable {
    private long id;
    private String modelo;
    private String placa;
    private String dono;
    private String telefone;
    private int estacionado;

    public int getEstacionado() {
        return estacionado;
    }

    public void setEstacionado(int estacionado) {
        this.estacionado = estacionado;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString(){
        return this.getDono();
    }
}
