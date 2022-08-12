package com.binar.view.bidangview;



import com.binar.view.MenuView;



import java.util.Scanner;

public class BidangView {


    private PersegiView persegiView ;
    private LingkaranView lingkaranView;
    private PersegiPanjangView persegiPanjangView;
    private SegitigaView segitigaView;

    public BidangView() {
        this.persegiView = new PersegiView();
        this.lingkaranView = new LingkaranView();
        this.persegiPanjangView = new PersegiPanjangView();
        this.segitigaView = new SegitigaView();
    }

    public void show(){
        bidangMenuShow();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Pilihan : ");
        int pilihan = scanner.nextInt();

        switch (pilihan){
            case 1  :
                persegiView.show();
                break;
            case 2  :
                lingkaranView.show();
                break;
            case 3 :
                segitigaView.show();
                break;
            case 4 :
                persegiPanjangView.show();
                break;
            case 0 :
                MenuView menuView = new MenuView();
                menuView.mainShow();
                break;
            default: throw new IllegalArgumentException("test");

        }


    }


    public void bidangMenuShow(){
        System.out.println("----------------------------------------------");
        System.out.println("Pilih bidang yang akan dihitung               ");
        System.out.println("----------------------------------------------");
        System.out.println("1. Persegi");
        System.out.println("2. Lingkaran");
        System.out.println("3. Segitiga");
        System.out.println("4. Persegi Panjang");
        System.out.println("0. Kembali ke menu sebelumnya");
    }

}
