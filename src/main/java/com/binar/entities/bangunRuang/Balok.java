package com.binar.entities.bangunRuang;


public class Balok extends BangunRuang{

    private Long panjang;
    private Long lebar;
    private Long tinggi;


    public Balok(String nama) {
        super(nama);
    }

    public Long getPanjang() {
        return panjang;
    }

    public void setPanjang(Long panjang) {
        this.panjang = panjang;
    }

    public Long getLebar() {
        return lebar;
    }

    public void setLebar(Long lebar) {
        this.lebar = lebar;
    }

    public Long getTinggi() {
        return tinggi;
    }

    public void setTinggi(Long tinggi) {
        this.tinggi = tinggi;
    }
}
