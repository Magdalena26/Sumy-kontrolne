package com.project.to;

import com.project.to.algo.Algorytm1;
import com.project.to.algo.Algorytm2;
import com.project.to.plik.Film;
import com.project.to.plik.PlikSumyKontrolnej;
import com.project.to.plik.Zdjecie;

/**
 * Created by Magda on 2016-05-14.
 */
public class Test {
    public static void main(String []args){

        SumaKontrolna sumaKontrolna=new SumaKontrolna(new Algorytm1());

        System.out.println();

        PlikSumyKontrolnej plikSumyKontrolnej1 = sumaKontrolna.generuj(new Zdjecie(12, "d:\\po.JPG", ".jpg"));
        System.out.println(plikSumyKontrolnej1.pobierzZawartosc());

        plikSumyKontrolnej1 = sumaKontrolna.generuj(new Film(12, "d:\\film.AVI", ".avi"));
        System.out.println(plikSumyKontrolnej1.pobierzZawartosc());

        sumaKontrolna.setAlgorytm(new Algorytm2());
        plikSumyKontrolnej1 = sumaKontrolna.generuj(new Film(12, "d:\\film.AVI", ".avi"));
        System.out.println(plikSumyKontrolnej1.pobierzZawartosc());

        System.out.println(sumaKontrolna.porownaj(plikSumyKontrolnej1, new Film(12, "d:\\film.AVI", ".avi") ));
    }
}