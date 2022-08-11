package com.binar.bangundatar;

public class Segitiga extends BangunDatar {

    private Long alas;
    private Long tinggi;

    public Segitiga(String nama) {
        super(nama);
    }

    public Long getAlas() {
        return alas;
    }

    public void setAlas(Long alas) {
        this.alas = alas;
    }

    public Long getTinggi() {
        return tinggi;
    }

    public void setTinggi(Long tinggi) {
        this.tinggi = tinggi;
    }
}
