package com.trongbt2008110320.tuan06;

import java.util.Scanner;

public class SanPham {    String tenSP;
    double donGia;
    double giamGia;
    String thue;
    int sl;
    Scanner nhap = new Scanner(System.in);
    //HÀM TẠO SẢN PHẨM
    SanPham(){
        
    }
    //HÀM IN THÔNG TIN SẢN PHẨM
    void inThongtin(){
        System.out.println("Tên sản phẩm: "+tenSP);
        System.out.println("Đơn giá: "+donGia);
        System.out.println("Giảm giá: "+giamGia);
        System.out.println("Thuế: "+thue);
        System.out.println("===========================");
    }

    void nhapThongTin(){
        System.out.println("-Thông tin sản phẩm:");
        System.out.print("Tên sản phẩm: ");
        tenSP = nhap.nextLine();
        System.out.print("Đơn giá: ");
        donGia = nhap.nextDouble();
        System.out.print("Giảm giá: ");
        giamGia = nhap.nextDouble();
        System.out.print("Thuế: ");
        nhap.nextLine();
        thue = nhap.nextLine();
        System.out.println("__________________________");
    }
    
}
