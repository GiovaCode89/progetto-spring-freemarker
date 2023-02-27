package com.example.progettospringfreemarker.model;

public class TV {

    public String marca;
    public String modello;
    public int pollici;


    public TV(String marca, String modello, int pollici) {
        this.marca = marca;
        this.modello = modello;
        this.pollici = pollici;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPollici() {
        return pollici;
    }

    public void setPollici(int pollici) {
        this.pollici = pollici;
    }
}
