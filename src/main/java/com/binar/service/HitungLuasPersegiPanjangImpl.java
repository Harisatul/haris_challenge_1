package com.binar.service;

import com.binar.bangundatar.PersegiPanjang;

public class HitungLuasPersegiPanjangImpl implements HitungLuas<PersegiPanjang, Long>{

    @Override
    public Long hitungLuas(PersegiPanjang bangunDatar) {
        return (bangunDatar.getPanjang() + bangunDatar.getLebar() )  * 2;
    }
}
