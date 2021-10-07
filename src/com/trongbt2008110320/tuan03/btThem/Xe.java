package com.trongbt2008110320.tuan03.btThem;

public class Xe {
    String tenChuXe;
    String hangSanXuat;
    String dong;
    String giayPhep;
    double dungTichXang;

    Xe(){
        //Hàm tạo mặc định
    }
    Xe(String ten, String hang, String d, String gp, double DTX){
        tenChuXe = ten;
        hangSanXuat = hang;
        dong = d;
        giayPhep = gp;
        dungTichXang = DTX;
    }
    void inThongTin(){
        System.out.println("Tên chủ xe: "+tenChuXe);
        System.out.println("Hãng sản xuất: "+hangSanXuat);
        System.out.println("Dòng: "+dong);
        System.out.println("Giấy phép: "+giayPhep);
        System.out.printf("dung tích xăng: %.2f lít", dungTichXang);
    }
    
}
