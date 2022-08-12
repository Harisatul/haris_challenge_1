package com.binar.bangundatar;

public class Persegi extends BangunDatar{


    private Long sisi;

    public Persegi(String nama) {
        super(nama);
    }

    public Long getSisi() {
        return sisi;
    }

    public void setSisi(Long sisi) {
        this.sisi = sisi;
    }
}
