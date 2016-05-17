package com.project.to.plik;

/**
 * Created by Magda on 2016-05-14.
 */
public class Film implements Plik {

    int rozmiar;
    String nazwa;
    String rozszerzenie;
    int dlugosc;

    public Film(int rozmiar, String nazwa, String rozszerzenie){
        this.rozmiar=rozmiar;
        this.nazwa=nazwa;
        this.rozszerzenie=rozszerzenie;
    }

    public Film(int rozmiar, String nazwa, String rozszerzenie, int dlugosc){
        this.rozmiar=rozmiar;
        this.nazwa=nazwa;
        this.rozszerzenie=rozszerzenie;
        this.dlugosc=dlugosc;
    }

    @Override
    public int getRozmiar() {
        return rozmiar;
    }

    @Override
    public String getNazwa() {
        return nazwa;
    }

    public int getDlugosc(){
        return dlugosc;
    }


    @Override
    public String getRozszerzenie() {
        return rozszerzenie;
    }

    @Override
    public String pobierzZawartosc(){
        return nazwa+ " "+rozmiar+ " "+rozszerzenie;
    }
}
