package com.binar.bangundatar;

public class PersegiPanjang extends BangunDatar {

    private Long panjang;
    private Long lebar;

    public PersegiPanjang(String nama) {
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
}
