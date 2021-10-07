package com.trongbt2008110320.tuan04.BaiTapThem;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class NhanVienTestDrive {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int soNV;
        System.out.print("Số lượng nhân viên cần nhập: ");
        soNV = n.nextInt();
        NhanVien[] DSNV = new NhanVien[soNV];
        for(int i = 0;i < DSNV.length;i++){
            DSNV[i] = new NhanVien();
            System.out.printf("Nhập thông tin nhân viên thứ %d:\n", i+1);
            DSNV[i].nhapThongTin();
        }
        System.out.println("======IN DANH SÁCH ĐÃ NHẬP======");
        for(NhanVien x : DSNV){
            x.inThongTin();
        }
        List<NhanVien> list = Arrays.asList(DSNV);
        Comparator<NhanVien> comparator = new Comparator<NhanVien>(){

            @Override
            public int compare(NhanVien o1, NhanVien o2) {

                return Integer.compare(o1.luong, o2.luong);
            }
            
        };
        list.sort(comparator);
        System.out.println("=====Thông tin nhân viên sau khi sắp xếp=====");
        for(NhanVien x : list){
            x.inThongTin();
        }
        System.out.print("Nhập tên nhân viên muốn xóa: ");
        for(NhanVien x :list){
            String ten = n.nextLine();
            if((x.tenNhanVien).equals(ten)){
                list.remove(x);
                System.out.println("Xóa thành công!");
                break;
            }
        }
        for(NhanVien x : list){
            x.inThongTin();
        }
        n.close();
    }
    
}
