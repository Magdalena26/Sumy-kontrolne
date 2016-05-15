package com.project.to.plik;

/**
 * Created by Magda on 2016-05-14.
 */
public class Zdjecie implements Plik {
    int rozmiar;
    String nazwa;
    String rozszerzenie;
    String rozdzielczosc;

    public Zdjecie(int rozmiar, String nazwa, String rozszerzenie){
        this.rozmiar=rozmiar;
        this.nazwa=nazwa;
        this.rozszerzenie=rozszerzenie;
    }

    public Zdjecie(int rozmiar, String nazwa, String rozszerzenie, String rozdzielczosc){
        this.rozmiar=rozmiar;
        this.nazwa=nazwa;
        this.rozszerzenie=rozszerzenie;
        this.rozdzielczosc=rozdzielczosc;
    }

    public String getRozdzielczosc(){
        return rozdzielczosc;
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
    public void wczytaj() {

    }

    @Override
    public String getRozszerzenie() {
        return rozszerzenie;
    }

    public String display(){
        return nazwa+ " "+rozmiar+" rozszerzenie";
    }
}
