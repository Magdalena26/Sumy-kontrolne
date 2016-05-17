package com.project.to.algo;

import com.project.to.plik.Plik;

import java.io.FileInputStream;
import java.security.MessageDigest;

/**
 * Created by Magda on 2016-05-14.
 */
public class Algorytm1 implements Algorytm {


    public String wylicz(Plik plik) throws Exception {
        String sciezka=plik.getNazwa();
        MessageDigest md= MessageDigest.getInstance("SHA1");
        FileInputStream fis=new FileInputStream(sciezka);
        byte [] bytes=new byte[1024];

        int n=0; // wczytane

        while((n=fis.read(bytes))!=-1){
            md.update(bytes, 0, n);
        };

        byte [] mdbytes=md.digest();

        // na hexy
        StringBuffer sb=new StringBuffer("");
        for(int i=0;i<mdbytes.length;i++){
            sb.append(Integer.toString((mdbytes[i] & 0xff)+0x100, 16).substring(1));
        }
        return sb.toString();
    }
}
