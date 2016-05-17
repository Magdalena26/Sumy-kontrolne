package com.project.to.plik;

/**
 * Created by Magda on 2016-05-14.
 */
public class NagranieDzwiekowe implements Plik {

    int rozmiar;
    String nazwa;
    String rozszerzenie;

    public NagranieDzwiekowe(int rozmiar, String nazwa, String rozszerzenie){
        this.rozmiar=rozmiar;
        this.nazwa=nazwa;
        this.rozszerzenie=rozszerzenie;
    }


    @Override
    public int getRozmiar() {
       return rozmiar;
    }

    @Override
    public String getNazwa() {
       return nazwa;
    }


    @Override
    public String getRozszerzenie() {
        return rozszerzenie;
    }

    @Override
    public String pobierzZawartosc(){
        return nazwa+ " "+rozmiar+" "+rozszerzenie;
    }
}
