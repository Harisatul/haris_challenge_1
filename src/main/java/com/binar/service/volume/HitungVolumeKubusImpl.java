package com.binar.service.volume;

import com.binar.entities.bangunRuang.Kubus;

public class HitungVolumeKubusImpl implements HitungVolume<Kubus, Long> {

    @Override
    public Long hitungVolume(Kubus bangunRuang) {
        return (long) Math.pow(bangunRuang.getSisi(), 3);
    }
}
