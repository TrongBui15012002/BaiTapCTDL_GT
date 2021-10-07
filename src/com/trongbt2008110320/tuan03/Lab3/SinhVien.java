package com.trongbt2008110320.tuan03.Lab3;

import java.util.Scanner;

public class SinhVien {
    String mssv;
    String hoTen;
    int tuoi;
    String queQuan;
    Scanner n = new Scanner(System.in);

    void nhapThongTin(){
        System.out.print("+ Họ và tên sinh viên: ");
        hoTen = n.nextLine();
        System.out.print("+ MSSV: ");
        mssv = n.nextLine();
        System.out.print("+ Tuổi: ");
        tuoi = n.nextInt();
        n.nextLine();
        System.out.print("+ Quê quán: ");
        queQuan = n.nextLine();
        System.out.println("_________________________");
    }

    void inThongTin(){
        System.out.println("Họ và tên: "+hoTen);
        System.out.println("Mã số sinh viên: "+mssv);
        System.out.println("Tuổi: "+tuoi);
        System.out.println("Quê quán: "+queQuan);
        System.out.println("*************************");
    }
    
    
}
