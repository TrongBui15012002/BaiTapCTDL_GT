package com.trongbt2008110320.tuan01;

import java.util.Scanner;

public class Bai1Lab1 {
    public static void main(String[] args) {
        String hoVaTen;
        Double diemTB;
        Scanner thongTin = new Scanner(System.in);
        System.out.print("Họ và tên: ");
        hoVaTen = thongTin.nextLine();
        System.out.print("Điểm trung bình: ");
        diemTB = thongTin.nextDouble();
        System.out.printf("%s: %.2f điểm", hoVaTen, diemTB);
        thongTin.close();
    }
    
}
