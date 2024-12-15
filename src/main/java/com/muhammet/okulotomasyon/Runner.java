package com.muhammet.okulotomasyon;

import com.muhammet.musteri.Musteri;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        /**
         * Öğrenci Otomasyon
         * --------
         * Öğrenci Bilgilerini consol dan girerek öğrenciyi dosyaya kaydedin.
         */
        System.out.print("Öğrenci adı.....: ");
        String ad = new Scanner(System.in).nextLine();
        System.out.print("Öğrenci adresi..: ");
        String adres = new Scanner(System.in).nextLine();
        Ogrenci ogrenci = new Ogrenci(ad, adres);
        addFile(ogrenci);
    }
    private static String  FILE_NAME = "/Users/muhammetalikaya/BILGEADAM_DATAS/Java_Boost_HS2/Java_Temel_Konular/J041_IO_Serilization/src/main/resources/Ogrenci.txt";

    private static void addFile(Ogrenci ogrenci){
        try{
            FileOutputStream fos = new FileOutputStream(FILE_NAME);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(ogrenci);
            oos.close();
            fos.close();
        }catch (Exception exception){
            System.err.println("Beklenmeyen hata....: "+ exception);
        }
    }
}
