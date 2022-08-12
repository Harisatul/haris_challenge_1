package com.binar.service;

import com.binar.bangundatar.PersegiPanjang;
import com.binar.service.luas.HitungLuas;
import com.binar.service.luas.HitungLuasPersegiPanjangImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HitungLuasPersegiPanjangImplTest {

    PersegiPanjang persegiPanjang;
    HitungLuas luasPersegiPanjang;

    @Before
    public void setUp() throws Exception {
        persegiPanjang = new PersegiPanjang("Persegi Panjang");
        luasPersegiPanjang = new HitungLuasPersegiPanjangImpl();
    }

    @Test
    public void hitungLuas() {
        persegiPanjang.setPanjang(4L);
        persegiPanjang.setLebar(5l);
        Object o = luasPersegiPanjang.hitungLuas(persegiPanjang);
        System.out.println(o);
        assertEquals(18l, o);
    }
}