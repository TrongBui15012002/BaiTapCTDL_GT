package com.trongbt2008110320.tuan03.btThem;

public class XeTestDrive {
    public static void main(String[] args) {
        Xe xe;
        xe = new Xe();
        xe.dong = "Tay ga";
        System.out.println("Dòng xe: "+xe.dong);

        System.out.println();

        xe = new Xe("Bùi Thị Trong", "HonDa", "Tay ga", "Giấy phép kinh doanh", 5.5);
        xe.inThongTin();

    }
    
}
