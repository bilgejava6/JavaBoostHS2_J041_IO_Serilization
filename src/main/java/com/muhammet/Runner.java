package com.muhammet;

import java.io.*;

public class Runner {
    public static void main(String[] args) {
        /**
         * Input / Output -> Giriş Çıkış işlemleri
         * File IO, bir dosyayı okumak ya da Yazmak.
         * Bu işlemleri yaparken işlerimizi kolaylaştırmak için kullanmakta olduğumuz Objeler bu
         * okuma yazma işlemlerinde de aktif kullanılmaktadır. Bu nedenle nesne dediğimiz bilgiler
         * RAM üzerinde bulunan adresler ve verilerdir. Bunları bir dosyaya aktarılabilmesi için
         * özel bir şekilde paketlenmesi işimizi kolaylaştırı. İşte burada Serilizable kavramı
         * karşımıza çıkar.
         * Serializable, serileştime yapılacak olan sınıfı işaretlemek için kullanılan
         * boş bir arayüzdür.
         * marker interface -> içerisinde herhangi bir method ve props olmayan sadece işaretleme
         * yapmak için tasarlanmış interface lere denilir.
         * Neden Serileştirme yapılır?
         * 1. Nesneyi Saklamak (new Musteri() - Object): Nesneleri bir dosyaya ya da veritabına kaydetmek.
         * 2. Network(Ağ) üzerinden iletim: Nesneleri bir bilgisayardan diğerine ağ üzserinden iletmek için.
         * 3. Önbelleklemek (RAM de bekletme): nesnelerin RAM üzerinde tutulması.
         *
         * Dosya ya bilgi girişi yapmak ->  Dosyaya çıktı vermek
         */
        String FILE_NAME = "/Users/muhammetalikaya/BILGEADAM_DATAS/Java_Boost_HS2/Java_Temel_Konular/J041_IO_Serilization/src/main/resources/ornek.txt";
        dosyayaYaz(FILE_NAME);
        try{
            FileInputStream file = new FileInputStream(FILE_NAME); // Dosyayı okur ve bir stream açar
            ObjectInputStream read = new ObjectInputStream(file); // read okuma işlemini yapacak olan sınıf.
            String okunanIfade = (String) read.readObject(); // objeyi dosyadan oku.
            System.out.println("Okunan ifade.....: "+ okunanIfade);
        }catch (Exception exception){
            System.err.println("Beklenmeyen durum...: "+ exception.getMessage());
        }

    }

    private static void dosyayaYaz(String FILE_NAME){
        try{
            FileOutputStream file = new FileOutputStream(FILE_NAME);
            String ifade = "Selam arkadaşlar, bugün Java da IO işlemlerine bakıyoruz.";
            ObjectOutputStream write = new ObjectOutputStream(file);
            write.writeObject(ifade);
            write.close();
            file.close();
        }catch (FileNotFoundException e){
            System.err.println("File not found");
        }catch (IOException e){
            System.err.println("Dosya Okuma ve Yazma Hatası");
        }
    }


}
