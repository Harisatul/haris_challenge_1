package com.binar.service;

import com.binar.bangundatar.Lingkaran;

public class HitungLuasLingkaranImpl implements HitungLuas<Lingkaran, Double>{

    private Double PI ;

    public HitungLuasLingkaranImpl() {
        this.PI = 3.14;
    }

    public Double getPI() {
        return PI;
    }

    @Override
    public Double hitungLuas(Lingkaran bangunDatar) {
        return Math.pow(bangunDatar.getJariJari(), 2) * PI;
    }
}
