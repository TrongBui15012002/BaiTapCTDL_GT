package com.trongbt2008110320.kiemtragiuaki;

import java.util.Scanner;

public class Node {
    int ma;
    double khoiLuong;
    String mauSac;
    Node next;
    Scanner nhap = new Scanner(System.in);

    Node(){

    }

    Node(int m, double kl, String ms){
        ma = m;
        khoiLuong = kl;
        mauSac = ms;
    }
    // void nhapThongtin(){
    //     System.out.print("- Nhập mã của táo: ");
    //     ma = nhap.nextInt();
    //     System.out.print("- Nhập khối lượng của táo: ");
    //     khoiLuong = nhap.nextDouble();
    //     System.out.print("- Nhập màu sắc của táo: ");
    //     nhap.nextLine();
    //     mauSac = nhap.nextLine();
    //     System.out.println("___________________________");

    public void nhapThongtin() {
    }

    // }
    // void inThongTin(){
    //     System.out.println("- Mã: "+ma);
    //     System.out.println("- Khối lượng: "+khoiLuong);
    //     System.out.println("- Màu sắc: "+mauSac);
    //     System.out.println("___________________________");
    // }
}
