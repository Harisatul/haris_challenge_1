package com.binar.view.bidangview;

import com.binar.entities.bangundatar.Persegi;

import com.binar.service.luas.HitungLuas;
import com.binar.service.luas.HitungLuasPersegiImpl;

import com.binar.view.MenuView;

import java.util.Scanner;

public class PersegiView {

    private HitungLuas luasPersegi;
    private Persegi persegi;

    public PersegiView() {
        this.luasPersegi = new HitungLuasPersegiImpl();
        this.persegi = new Persegi("Persegi");
    }

    private Scanner scanner = new Scanner(System.in);

    public void show(){
        System.out.println("----------------------------------------------");
        System.out.println("Anda Memilih " + persegi.getNama());
        System.out.println("----------------------------------------------");
        System.out.print("Mausukkan sisi :  ");
        long sisi = scanner.nextLong();
        persegi.setSisi(sisi);
        System.out.println("\nProcessing ....");

        System.out.println("Luas dari " + persegi.getNama() + " adalah " + luasPersegi.hitungLuas(persegi));
        System.out.print("Ketik apa saja untuk kembali ke main menu : ");
        scanner.next();

        MenuView menuView = new MenuView();
        menuView.mainShow();
    }

}
