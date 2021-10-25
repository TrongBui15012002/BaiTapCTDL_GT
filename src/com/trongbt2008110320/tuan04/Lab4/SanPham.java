package com.trongbt2008110320.tuan04.Lab4;

import java.util.Scanner;

public class SanPham {
    String tenSP;
    double gia;
    Scanner n = new Scanner(System.in);

    SanPham(String t, double g){
        tenSP = t;
        gia = g;
    }
    void inThongTin(){
        System.out.println("Tên sản phẩm: " + tenSP);
        System.out.println("Giá: " +gia);
        System.out.println("__________________________________");
    }
    
}
