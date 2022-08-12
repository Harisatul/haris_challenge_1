package com.binar.view.bidangview;

import com.binar.entities.bangundatar.PersegiPanjang;
import com.binar.service.luas.HitungLuas;
import com.binar.service.luas.HitungLuasPersegiPanjangImpl;
import com.binar.view.MenuView;

import java.util.Scanner;

public class PersegiPanjangView {

    private PersegiPanjang persegiPanjang;
    private HitungLuas hitungLuas;

    public PersegiPanjangView() {
        this.persegiPanjang = new PersegiPanjang("Persegi Panjang");
        this.hitungLuas = new HitungLuasPersegiPanjangImpl();
    }

    private Scanner scanner = new Scanner(System.in);

    public void show(){
        System.out.println("----------------------------------------------");
        System.out.println("Anda Memilih " + persegiPanjang.getNama());
        System.out.println("----------------------------------------------");
        System.out.print("Mausukkan panjang :  ");
        Long panjang = scanner.nextLong();
        persegiPanjang.setPanjang(panjang);
        System.out.print("Mausukkan panjang :  ");
        Long lebar = scanner.nextLong();
        persegiPanjang.setLebar(lebar);
        System.out.println("\nProcessing ....");

        System.out.println("Luas dari persegi panjang adalah " + hitungLuas.hitungLuas(persegiPanjang));
        System.out.print("Ketik apa saja untuk kembali ke main menu : ");
        scanner.next();

        MenuView menuView = new MenuView();
        menuView.mainShow();
    }
}
