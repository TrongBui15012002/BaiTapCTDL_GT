package com.trongbt2008110320.kiemtragiuaki;

import java.util.Scanner;

public class Apple {
    int ma;
    double khoiLuong;
    String mauSac;
    Scanner nhap = new Scanner(System.in);
    //hàm tạo
    Apple(){

    }
    Apple(int m, double kl, String ms){
        ma = m;
        khoiLuong = kl;
        mauSac = ms;
    }
    void nhapThongTin(){
        System.out.print("+ Nhập mã của táo: ");
        ma = nhap.nextInt();
        System.out.print("+ Nhập khối lượng(kilogam): ");
        khoiLuong = nhap.nextDouble();
        System.out.print("+ Nhập màu sắc: ");
        nhap.nextLine();
        mauSac = nhap.nextLine();
        System.out.println("____________________________-");
    }
    void inThongTin(){
        System.out.println("- Mã: "+ma);
        System.out.println("- Khối lượng: "+khoiLuong+" kg");
        System.out.println("- Màu sắc: "+mauSac);
        System.out.println("____________________________-");
    }

    
}
