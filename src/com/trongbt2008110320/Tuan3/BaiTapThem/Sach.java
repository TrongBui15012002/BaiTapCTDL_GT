package com.trongbt2008110320.Tuan3.BaiTapThem;

public class Sach {
    double gia;
    String nhaXuatBan;
    int namXuatBan;
    double giaBan;
    int soLuong;
    String loai;
    Sach(){
        //Hàm tạo mặc định
    }

    Sach(String NXB, int nam, int SL, String l, double g, double GB){
        nhaXuatBan = NXB;
        namXuatBan = nam;
        soLuong = SL;
        loai = l;
        gia = g;
        giaBan = GB;
    }
    void inThongTin(){
        System.out.println("Nhà xuất bản: "+nhaXuatBan);
        System.out.println("Năm Sản Xuất: "+namXuatBan);
        System.out.println("Số lượng: "+soLuong);
        System.out.println("Loại: "+loai);
        System.out.printf("Giá: %.3f đồng\n", gia);
        System.out.printf("Giá bán: %.3f đồng", giaBan);
    }

    
}
