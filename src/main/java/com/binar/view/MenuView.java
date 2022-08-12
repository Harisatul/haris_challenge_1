package com.binar.view;


import com.binar.view.bidangview.BidangView;
import com.binar.view.ruangView.RuangView;

import java.util.Scanner;

public class MenuView {

    private BidangView bidangView ;
    private RuangView ruangView;

    public MenuView() {
        this.bidangView = new BidangView();
        this.ruangView = new RuangView();
    }

    public void mainShow(){

        Scanner scanner = new Scanner(System.in);

        mainMenuShow();
        System.out.print("Masukkan Pilihan : ");
        int pilihan = scanner.nextInt();

        switch (pilihan){
            case 1  :
                bidangView.show();
                break;
            case 2  :
               ruangView.show();
               break;
            case 0 :
                System.out.println("terimakasih, Sampai jumpa...");
                System.exit(0);
                break;
            default: throw new IllegalArgumentException("test");

        }


    }



    public void mainMenuShow(){
        System.out.println("----------------------------------------------");
        System.out.println("Kalkulator Penghitung Luas dan Volume");
        System.out.println("----------------------------------------------");

        System.out.println("--Menu--");
        System.out.println("1. Hitung Luas Bidang Bangun Datar");
        System.out.println("2. Hitung Volume Bidang Bangun Ruang");
        System.out.println("0. Tutup Aplikasi");
    }






}
