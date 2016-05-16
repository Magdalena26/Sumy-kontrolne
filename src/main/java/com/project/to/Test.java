package com.project.to;

import com.project.to.algo.Algorytm1;
import com.project.to.algo.Algorytm2;
import com.project.to.plik.Film;

/**
 * Created by Magda on 2016-05-14.
 */
public class Test {
    public static void main(String []args){
        SumaKontrolna sumaKontrolna=new SumaKontrolna(new Algorytm1(), new Film(12, "d:\\po.JPG", ".jpg"));
        sumaKontrolna.display();
        System.out.println(sumaKontrolna.display());

        SumaKontrolna sumaKontrolna2=new SumaKontrolna(new Algorytm2(), new Film(12, "d:\\film.AVI", ".avi"));
        sumaKontrolna2.display();
        System.out.println(sumaKontrolna2.display());

        SumaKontrolna sumaKontrolna3=new SumaKontrolna(new Algorytm1(), new Film(12, "d:\\muzyka.mp3", ".mp3"));
        sumaKontrolna3.display();
        System.out.println(sumaKontrolna3.display());
    }
}