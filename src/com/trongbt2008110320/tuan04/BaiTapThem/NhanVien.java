package com.trongbt2008110320.tuan04.BaiTapThem;

import java.util.Scanner;

public class NhanVien {
    String tenNhanVien;
    int luong;
    String diaChi;
    String boPhanLamViec;
    String ngaySinh;
    Scanner n = new Scanner(System.in);

    NhanVien(){
        //Hàm tạo mặc định
    }
     NhanVien(String ten, int l, String DC, String BP, String NS){
        tenNhanVien = ten;
        luong = l;
        diaChi = DC;
        boPhanLamViec = BP;
        ngaySinh = NS;
    }
    void inThongTin(){
        System.out.println("Tên nhân viên: "+tenNhanVien);
        System.out.printf("Lương: "+luong+" đồng\n");
        System.out.println("Địa chỉ: "+diaChi);
        System.out.println("Bộ phận làm việc: "+boPhanLamViec);
        System.out.println("Ngày sinh: "+ngaySinh);
        System.out.println("________________________________________");
    }
    void nhapThongTin(){
        System.out.print("Họ và tên: ");
        tenNhanVien = n.nextLine();
        System.out.print("Lương: ");
        luong = n.nextInt();
        n.nextLine();
        System.out.print("Địa chỉ: ");
        diaChi = n.nextLine();
        System.out.print("Bộ phận làm việc: ");
        boPhanLamViec = n.nextLine();
        System.out.print("Ngày sinh: ");
        ngaySinh = n.nextLine();
        System.out.println("________________________________________");
    }
    
}
