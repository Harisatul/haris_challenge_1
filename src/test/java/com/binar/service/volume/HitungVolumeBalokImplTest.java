package com.binar.service.volume;

import com.binar.entities.bangunRuang.Balok;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HitungVolumeBalokImplTest {

    Balok balok;
    HitungVolume volumeBalok;


    @Before
    public void setUp() throws Exception {
        this.balok = new Balok("Balok");
        this.volumeBalok = new HitungVolumeBalokImpl();
    }

    @Test
    public void hitungVolume() {
        balok.setLebar(3l);
        balok.setPanjang(4l);
        balok.setTinggi(4l);
        Object o = volumeBalok.hitungVolume(balok);
        System.out.println(o);
        assertEquals(48l,o);
    }
}