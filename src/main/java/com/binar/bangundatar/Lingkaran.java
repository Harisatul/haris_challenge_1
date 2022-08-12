package com.binar.bangundatar;

public class Lingkaran extends BangunDatar {

    private Long jariJari;

    public Lingkaran(String nama) {
        super(nama);
    }

    public Long getJariJari() {
        return jariJari;
    }

    public void setJariJari(Long jariJari) {
        this.jariJari = jariJari;
    }
}
