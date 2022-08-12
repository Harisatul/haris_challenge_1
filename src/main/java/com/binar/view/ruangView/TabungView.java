package com.binar.view.ruangView;

import com.binar.entities.bangunRuang.Tabung;
import com.binar.service.volume.HitungVolume;
import com.binar.service.volume.HitungVolumeTabungImpl;
import com.binar.view.MenuView;

import java.util.Scanner;

public class TabungView {

    private Tabung tabung;
    private HitungVolume volumeTabung;

    public TabungView() {
        this.tabung = new Tabung("Tabung");
        this.volumeTabung = new HitungVolumeTabungImpl();
    }

    private Scanner scanner = new Scanner(System.in);

    public void show(){
        System.out.println("----------------------------------------------");
        System.out.println("Anda Memilih " + tabung.getNama());
        System.out.println("----------------------------------------------");
        System.out.print("Mausukkan jari-jari tabung :  ");
        Long jariJari = scanner.nextLong();
        tabung.setJariJari(jariJari);
        System.out.print("Mausukkan tinggi tabung :  ");
        Long tinggi = scanner.nextLong();
        tabung.setTinggi(tinggi);

        System.out.println("\nProcessing ....");

        System.out.println("Volume dari "+ tabung.getNama() +" adalah " + volumeTabung.hitungVolume(tabung));
        System.out.print("Ketik apa saja untuk kembali ke main menu : ");
        scanner.next();

        MenuView menuView = new MenuView();
        menuView.mainShow();
    }
}
