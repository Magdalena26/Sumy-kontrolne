package com.project.to;

import com.project.to.algo.Algorytm;
import com.project.to.plik.Plik;

/**
 * Created by Magda on 2016-05-14.
 */

public class SumaKontrolna {

    private String plikSumy=null;
    private Algorytm algorytm;
    private Plik plik;

    public SumaKontrolna(Algorytm algorytm, Plik plik){
        this.plik=plik;
        this.algorytm=algorytm;
        plikSumy=generuj(algorytm, plik);
    }

    public String generuj(Algorytm algorytm, Plik plik){
        try {
            plikSumy=algorytm.wylicz(plik);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return plikSumy;
    }

    public boolean porownaj(){
        return false;
    }



    public String display(){
        return "Suma kontrolna pliku "+ plik.getNazwa()+": "+plikSumy;
    }


}
