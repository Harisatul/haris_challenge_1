package com.binar.entities.bangunRuang;

public class Tabung extends BangunRuang{

    private Long jariJari;
    private Long tinggi;

    public Tabung(String nama) {
        super(nama);
    }

    public Long getJariJari() {
        return jariJari;
    }

    public void setJariJari(Long jariJari) {
        this.jariJari = jariJari;
    }

    public Long getTinggi() {
        return tinggi;
    }

    public void setTinggi(Long tinggi) {
        this.tinggi = tinggi;
    }
}
