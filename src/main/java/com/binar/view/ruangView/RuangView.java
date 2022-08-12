package com.binar.view.ruangView;


import com.binar.view.MenuView;

import java.util.Scanner;

public class RuangView {


    private BalokView balokView;
    private KubusView kubusView;
    private TabungView tabungView;

    public RuangView() {
        this.balokView = new BalokView();
        this.kubusView = new KubusView();
        this.tabungView = new TabungView();
    }

    public void show(){
        ruangMenuShow();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Pilihan : ");
        int pilihan = scanner.nextInt();

        switch (pilihan){
            case 1  :
                kubusView.show();
                break;
            case 2  :
                balokView.show();
                break;
            case 3 :
                tabungView.show();
                break;
            case 0 :
                MenuView menuView = new MenuView();
                menuView.mainShow();
                break;
            default: throw new IllegalArgumentException("test");

        }


    }



    public void ruangMenuShow(){
        System.out.println("----------------------------------------------");
        System.out.println("Pilih ruang yang akan dihitung               ");
        System.out.println("----------------------------------------------");
        System.out.println("1. Kubus");
        System.out.println("2. Balok");
        System.out.println("3. Tabung");
        System.out.println("0. Kembali ke menu sebelumnya");
    }

}
