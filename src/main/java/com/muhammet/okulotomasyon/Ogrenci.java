package com.muhammet.okulotomasyon;

import java.io.Serializable;

public class Ogrenci implements Serializable {
    String ad;
    String adres;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Ogrenci{");
        sb.append("ad='").append(ad).append('\'');
        sb.append(", adres='").append(adres).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public Ogrenci(String ad, String adres) {
        this.ad = ad;
        this.adres = adres;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }
}
