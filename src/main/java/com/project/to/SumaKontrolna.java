package com.project.to;

import com.project.to.algo.Algorytm;
import com.project.to.plik.Plik;
import com.project.to.plik.PlikSumyKontrolnej;

/**
 * Created by Magda on 2016-05-14.
 */

public class SumaKontrolna {

    private String plikSumy=null;
    private Algorytm algorytm;


    public SumaKontrolna(Algorytm algorytm){

        this.algorytm=algorytm;

    }

    public PlikSumyKontrolnej generuj(Plik plik){
        try {
            plikSumy=algorytm.wylicz(plik);
        } catch (Exception e) {
            e.printStackTrace();
        }
        PlikSumyKontrolnej plikSumyKontrolnej = new PlikSumyKontrolnej(plik.getNazwa(), plik.getRozszerzenie());
        plikSumyKontrolnej.setSuma(plikSumy);
        return plikSumyKontrolnej;
    }
    public void setAlgorytm(Algorytm algorytm){
        this.algorytm = algorytm;
    }

    public boolean porownaj(PlikSumyKontrolnej plikSumyKontrolnej, Plik plik){

        if(plikSumyKontrolnej.pobierzZawartosc().equals(generuj(plik).pobierzZawartosc())){
            return true;
        }
        return false;
    }


}
