package com.trongbt2008110320.tuan09;

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

    void nhap(){
        System.out.print("+ Nhập mã của táo: ");
        ma = nhap.nextInt();
        System.out.print("+ Nhập khối lượng của táo: ");
        khoiLuong = nhap.nextDouble();
        System.out.print("+ Nhập màu sắc của táo: ");
        nhap.nextLine();
        mauSac = nhap.nextLine();
    }
    void in(){
        System.out.println("- Mã của táo: "+ma);
        System.out.println("- Khối lượng của táo: "+khoiLuong);
        System.out.println("- Màu sắc của táo: "+mauSac);
        System.out.println("_____________________________________");
    }
    
}
