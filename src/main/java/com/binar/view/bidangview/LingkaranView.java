package com.binar.view.bidangview;

import com.binar.entities.bangundatar.Lingkaran;
import com.binar.service.luas.HitungLuas;
import com.binar.service.luas.HitungLuasLingkaranImpl;

import com.binar.view.MenuView;

import java.util.Scanner;

public class LingkaranView {

    private Lingkaran lingkaran;
    private HitungLuas luasLingkaran;
    private Scanner scanner = new Scanner(System.in);

    public LingkaranView() {
        this.lingkaran = new Lingkaran("Lingkaran");
        this.luasLingkaran = new HitungLuasLingkaranImpl();
    }



    public void show(){
        System.out.println("----------------------------------------------");
        System.out.println("Anda Memilih " + lingkaran.getNama());
        System.out.println("----------------------------------------------");
        System.out.print("Mausukkan jari-jari :  ");
        long jariJari = scanner.nextLong();
        lingkaran.setJariJari(jariJari);
        System.out.println("\nProcessing ....");

        System.out.println("Luas dari "+ lingkaran.getNama() + " adalah " + luasLingkaran.hitungLuas(lingkaran));
        scanner.next();

        MenuView menuView = new MenuView();
        menuView.mainShow();
    }

}
