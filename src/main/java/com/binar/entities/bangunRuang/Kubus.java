package com.binar.entities.bangunRuang;

public class Kubus extends BangunRuang{

    private Long sisi;

    public Kubus(String nama) {
        super(nama);
    }

    public Long getSisi() {
        return sisi;
    }

    public void setSisi(Long sisi) {
        this.sisi = sisi;
    }
}
