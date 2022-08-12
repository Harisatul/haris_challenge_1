package com.binar.view.ruangView;


import com.binar.entities.bangunRuang.Balok;
import com.binar.service.volume.HitungVolume;
import com.binar.service.volume.HitungVolumeBalokImpl;
import com.binar.view.MenuView;

import java.util.Scanner;

public class BalokView {

    private Balok balok;
    private HitungVolume luasBalok;

    public BalokView() {
        this.balok = new Balok("Balok");
        this.luasBalok = new HitungVolumeBalokImpl();
    }

    private Scanner scanner = new Scanner(System.in);

    public void show() {
        System.out.println("----------------------------------------------");
        System.out.println("Anda Memilih " + balok.getNama());
        System.out.println("----------------------------------------------");
        System.out.print("Mausukkan panjang :  ");
        Long panjang = scanner.nextLong();
        balok.setPanjang(panjang);

        System.out.print("Mausukkan lebar :  ");
        Long lebar = scanner.nextLong();
        balok.setLebar(lebar);

        System.out.print("Mausukkan tinggi :  ");
        Long tinggi = scanner.nextLong();
        balok.setTinggi(tinggi);

        System.out.println("\nProcessing ....");

//        try {
//            System.out.println(o);
//        }catch (NullPointerException e){
//            System.out.println("test");
//        }

        System.out.println("Volume dari " + balok.getNama() + " adalah " + luasBalok.hitungVolume(balok) );
        System.out.print("Ketik apa saja untuk kembali ke main menu : ");
        scanner.next();

        MenuView menuView = new MenuView();
        menuView.mainShow();
    }


}
