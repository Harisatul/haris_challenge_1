package com.binar.service;

import com.binar.bangundatar.Segitiga;

public class HitungLuasSegitigaImpl implements HitungLuas <Segitiga, Double>{
    @Override
    public Double hitungLuas(Segitiga bangunDatar) {
        return (double) bangunDatar.getAlas() * bangunDatar.getTinggi() / 2;
    }
}
