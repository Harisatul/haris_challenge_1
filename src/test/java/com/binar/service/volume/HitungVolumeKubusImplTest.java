package com.binar.service.volume;

import com.binar.entities.bangunRuang.Kubus;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HitungVolumeKubusImplTest {

    Kubus kubus;
    HitungVolume volumeKubus;


    @Before
    public void setUp() throws Exception {
        this.kubus = new Kubus("kubus");
        this.volumeKubus = new HitungVolumeKubusImpl();
    }

    @Test
    public void hitungVolume() {
        kubus.setSisi(4l);
        Object o = volumeKubus.hitungVolume(kubus);
        System.out.println(o);
        assertEquals(64l, o);
    }
}