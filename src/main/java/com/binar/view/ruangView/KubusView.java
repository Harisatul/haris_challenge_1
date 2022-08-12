package com.binar.view.ruangView;

import com.binar.entities.bangunRuang.Kubus;
import com.binar.service.volume.HitungVolume;
import com.binar.service.volume.HitungVolumeKubusImpl;
import com.binar.view.MenuView;

import java.util.Scanner;

public class KubusView {

    private Kubus kubus;
    private HitungVolume volumeKubus;

    public KubusView() {
        this.kubus = new Kubus("Kubus");
        this.volumeKubus = new HitungVolumeKubusImpl();
    }

    private Scanner scanner = new Scanner(System.in);

    public void show(){
        System.out.println("----------------------------------------------");
        System.out.println("Anda Memilih " + kubus.getNama());
        System.out.println("----------------------------------------------");
        System.out.print("Mausukkan sisi :  ");
        Long sisi = scanner.nextLong();
        kubus.setSisi(sisi);
        System.out.println("\nProcessing ....");

        System.out.println("Volume dari " +  kubus.getNama() +" adalah " + volumeKubus.hitungVolume(kubus));
        System.out.print("Ketik apa saja untuk kembali ke main menu : ");
        scanner.next();

        MenuView menuView = new MenuView();
        menuView.mainShow();
    }
}
