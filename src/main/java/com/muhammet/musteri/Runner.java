package com.muhammet.musteri;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Runner {
    private static final String FILE_NAME = "/Users/muhammetalikaya/BILGEADAM_DATAS/Java_Boost_HS2/Java_Temel_Konular/J041_IO_Serilization/src/main/resources/Musteri.txt";
    public static void main(String[] args) {
      //Musteri musteri = new Musteri("Deniz TAŞ","Ankara","0 555 999 8877");
      //addFile(musteri);
      try{
          FileInputStream fis = new FileInputStream(FILE_NAME);
          ObjectInputStream ois = new ObjectInputStream(fis);
          Musteri readMusteri =  (Musteri) ois.readObject();
          System.out.println("Okunan Müşteri....: "+ readMusteri);
      }catch (Exception exception){
          System.err.println("Bekjenneyen durum...: "+exception);
      }
    }
    private static void addFile(Musteri musteri){
        try{
            FileOutputStream fos = new FileOutputStream(FILE_NAME);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(musteri);
            oos.close();
            fos.close();
        }catch (Exception exception){
            System.err.println("Beklenmeyen hata....: "+ exception);
        }
    }
}
