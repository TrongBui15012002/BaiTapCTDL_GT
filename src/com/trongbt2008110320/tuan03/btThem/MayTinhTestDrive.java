package com.trongbt2008110320.tuan03.btThem;

public class MayTinhTestDrive {
    public static void main(String[] args) {
        MayTinh mayTinh;
        mayTinh = new MayTinh();

        mayTinh.nhaSanXuat = "HP";
        System.out.println("Nhà sản xuất: "+mayTinh.nhaSanXuat);

        System.out.println();

        mayTinh = new MayTinh("HP", 2020, "Windows 10", "8GB", "Intel core i5", 17000000, 1);
        mayTinh.inThongTin();
        
    }
    
}
