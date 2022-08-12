package com.binar.service;

import com.binar.bangundatar.Lingkaran;
import com.binar.service.luas.HitungLuasLingkaranImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HitungLuasLingkaranTest {

    Lingkaran lingkaran;
    HitungLuasLingkaranImpl luasLingkaran;


    @Before
    public void setUp() throws Exception {
        lingkaran = new Lingkaran("Lingkaran");
        luasLingkaran =  new HitungLuasLingkaranImpl();
    }

    @Test
    public void getPI() {
        Object pi = luasLingkaran.getPI();
        Assert.assertEquals(3.14,pi);
        System.out.println(pi);
    }

    @Test
    public void testHitungLuas() {
        lingkaran.setJariJari(3l);
        Object x =  luasLingkaran.hitungLuas(lingkaran);
        System.out.println(x);
        Assert.assertEquals(28.26, x);
    }
}