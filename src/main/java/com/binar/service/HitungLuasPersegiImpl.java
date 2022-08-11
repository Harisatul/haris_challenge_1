package com.binar.service;

import com.binar.bangundatar.Persegi;


public class HitungLuasPersegiImpl implements HitungLuas<Persegi, Long>{


    @Override
    public Long hitungLuas(Persegi bangunDatar) {
        return bangunDatar.getSisi() * bangunDatar.getSisi();
    }
}
