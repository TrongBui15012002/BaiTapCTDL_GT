package com.trongbt2008110320.tuan03.Lab3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SinhVienTestDrive {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        int n;
        System.out.print("Nhập số lượng sinh viên: ");
        n = nhap.nextInt();
        SinhVien[] DSSV= new SinhVien[n];
        for(int i = 0;i < DSSV.length;i++){
            DSSV[i] = new SinhVien();
            System.out.printf("Nhập thông tin sinh viên thứ %d:\n", i+1);
            DSSV[i].nhapThongTin();
        }
        System.out.println("======IN DANH SÁCH ĐÃ NHẬP======");
        for(int i = 0;i < DSSV.length;i++){
            
            DSSV[i].inThongTin();
        }
        List<SinhVien> list = Arrays.asList(DSSV);

        Comparator<SinhVien> comparator = new Comparator<SinhVien>(){
    
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
    
                return Integer.compare(o1.tuoi, o2.tuoi);
            }
                
        };
    
        list.sort(comparator);

        System.out.println("======IN DANH SÁCH SAU SẮP XẾP======");
        for(int i = 0;i < DSSV.length;i++){
            
            DSSV[i].inThongTin();
        }
        nhap.close();
    }  
}
