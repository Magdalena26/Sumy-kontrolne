package com.project.to.plik;

/**
 * Created by Magda on 2016-05-17.
 */
public class PlikSumyKontrolnej implements Plik {

    private int rozmiar=0;
    private String nazwa;
    private String rozszerzenie;
    private String suma=null;

    public PlikSumyKontrolnej(String nazwa, String rozszerzenie){
        this.nazwa=nazwa;
        this.rozszerzenie=rozszerzenie;
    }

    public void setSuma(String suma){
        this.suma=suma;
        rozmiar=suma.length();
    }


    @Override
    public int getRozmiar() {
        return 0;
    }

    @Override
    public String getNazwa() {
        return null;
    }

    @Override
    public String getRozszerzenie() {
        return null;
    }

    @Override
    public String pobierzZawartosc() {
        return suma;
    }
}
