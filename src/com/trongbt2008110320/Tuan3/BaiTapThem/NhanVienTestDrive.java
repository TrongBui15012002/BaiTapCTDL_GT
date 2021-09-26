package com.trongbt2008110320.Tuan3.BaiTapThem;

public class NhanVienTestDrive {
    public static void main(String[] args) {
        NhanVien nhanVien;
        nhanVien = new NhanVien();
        nhanVien.tenNhanVien = "Bùi Thị Trọng";
        System.out.println("Tên nhân viên: "+nhanVien.tenNhanVien);

        System.out.println();

        nhanVien = new NhanVien("Bùi Thị Trọng", 15000000, "Bình Phước", "Văn phòng", "15/01/2002");
        nhanVien.inThongTin();

    }
    
}
