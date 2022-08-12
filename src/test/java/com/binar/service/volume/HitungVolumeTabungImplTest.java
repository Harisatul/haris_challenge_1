package com.binar.service.volume;

import com.binar.entities.bangunRuang.Tabung;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HitungVolumeTabungImplTest {

    Tabung tabung;
    HitungVolume volumeTabung;

    @Before
    public void setUp() throws Exception {
        this.tabung = new Tabung("Tabung");
        this.volumeTabung = new HitungVolumeTabungImpl();
    }

    @Test
    public void hitungVolume() {
        tabung.setTinggi(4l);
        tabung.setJariJari(6l);
        Object o = volumeTabung.hitungVolume(tabung);
        System.out.println(o);
        assertEquals(452.16 ,o);
    }
}