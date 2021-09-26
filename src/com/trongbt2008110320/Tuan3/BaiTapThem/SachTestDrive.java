package com.trongbt2008110320.Tuan3.BaiTapThem;

public class SachTestDrive {
    public static void main(String[] args) {
        Sach sach;
        sach = new Sach();
        sach.nhaXuatBan = "Kim Đồng";
        System.out.println("Nhà xuất bản: " +sach.nhaXuatBan);
        
        System.out.println();

        sach = new Sach("Kim Đồng", 2021, 100, "Truyện tranh", 11.5, 14);
        sach.inThongTin();

    }
    
}
