package com.binar.service.volume;

import com.binar.entities.bangunRuang.Tabung;

public class HitungVolumeTabungImpl implements HitungVolume<Tabung, Double> {

    private final Double PI;

    public HitungVolumeTabungImpl() {
        PI = 3.14;
    }

    @Override
    public Double hitungVolume(Tabung bangunRuang) {
        return PI * bangunRuang.getTinggi() * Math.pow(bangunRuang.getJariJari(), 2);
    }
}
