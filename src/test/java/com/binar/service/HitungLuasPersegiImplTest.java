package com.binar.service;

import com.binar.bangundatar.Persegi;
import com.binar.service.luas.HitungLuas;
import com.binar.service.luas.HitungLuasPersegiImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HitungLuasPersegiImplTest {

    HitungLuas hitungLuasPersegi;
    Persegi persegi;


    @Before
    public void setUp() throws Exception {
        hitungLuasPersegi = new HitungLuasPersegiImpl();
        persegi = new Persegi("Persegi");
    }

    @Test
    public void testHitungLuas() {
        persegi.setSisi(4L);
        Object o = hitungLuasPersegi.hitungLuas(persegi);
        System.out.println(o);
        Assert.assertEquals(16L, o);

    }
}