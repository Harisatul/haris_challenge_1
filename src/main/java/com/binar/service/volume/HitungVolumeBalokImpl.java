package com.binar.service.volume;

import com.binar.entities.bangunRuang.Balok;

public class HitungVolumeBalokImpl implements HitungVolume<Balok, Long> {

    @Override
    public Long hitungVolume(Balok bangunRuang) {
        return bangunRuang.getPanjang() * bangunRuang.getLebar() * bangunRuang.getTinggi();
    }
}
