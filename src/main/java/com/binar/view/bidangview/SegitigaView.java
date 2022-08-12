package com.binar.view.bidangview;

import com.binar.entities.bangundatar.Segitiga;
import com.binar.service.luas.HitungLuas;
import com.binar.service.luas.HitungLuasSegitigaImpl;
import com.binar.view.MenuView;

import java.util.Scanner;

public class SegitigaView {

    private Segitiga segitiga;
    private HitungLuas luasSegitiga;

    public SegitigaView() {
        this.segitiga = new Segitiga("Segitiga");
        this.luasSegitiga = new HitungLuasSegitigaImpl();
    }

    private Scanner scanner = new Scanner(System.in);

    public void show(){
        System.out.println("----------------------------------------------");
        System.out.println("Anda Memilih " + segitiga.getNama());
        System.out.println("----------------------------------------------");
        System.out.print("Mausukkan alas :  ");
        Long alas = scanner.nextLong();
        segitiga.setAlas(alas);
        System.out.print("Mausukkan tinggi :  ");
        Long tinggi = scanner.nextLong();
        segitiga.setTinggi(tinggi);
        System.out.println("\nProcessing ....");

        System.out.println("Luas dari persegi panjang adalah " + luasSegitiga.hitungLuas(segitiga));
        System.out.print("Ketik apa saja untuk kembali ke main menu : ");
        scanner.next();
        MenuView menuView = new MenuView();
        menuView.mainShow();
    }
}
