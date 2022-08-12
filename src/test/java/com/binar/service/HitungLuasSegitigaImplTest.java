package com.binar.service;

import com.binar.bangundatar.Segitiga;
import com.binar.service.luas.HitungLuas;
import com.binar.service.luas.HitungLuasSegitigaImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HitungLuasSegitigaImplTest {

    HitungLuas hitungLuas;
    Segitiga segitiga;


    @Before
    public void setUp() throws Exception {
       hitungLuas = new HitungLuasSegitigaImpl();
        segitiga = new Segitiga("Segitiga");
    }

    @Test
    public void testHitungLuas() {
        segitiga.setAlas(4l);
        segitiga.setTinggi(10l);
        Object o = hitungLuas.hitungLuas(segitiga);
        Assert.assertEquals(20.0, o);
        System.out.println(o);

    }
}