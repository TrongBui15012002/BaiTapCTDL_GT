package com.trongbt2008110320.Tuan3.BaiTapThem;

public class CowTestDrive {
    public static void main(String[] args) {
        Cow cow;
        cow = new Cow();

        cow.canNang = 15.1;
        System.out.println("Cân nặng: "+cow.canNang);

        System.out.println();

        cow = new Cow(11.1, "Nâu", "Đực");
        cow.inThongTin();

    }
    
}
