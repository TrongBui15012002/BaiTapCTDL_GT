package com.trongbt2008110320.kiemtragiuaki;

import java.util.ArrayList;
import java.util.Scanner;

public class AppleTestDrive {
    static Scanner n = new Scanner(System.in);
    static ArrayList<Apple> khoTao = new ArrayList<>();
    static int chon;
    public static void main(String[] args) {
        khoTao.add(new Apple(1000, 1.5, "Đỏ" ));
        khoTao.add(new Apple(1001, 1, "Xanh"));
        do{
        System.out.println("==========MENU==========");
        System.out.println(">>1. Nhập thêm táo vào kho.");
        System.out.println(">>2. Tìm táo trong kho theo màu.");
        System.out.println(">>3. In danh sách táo trong kho.");
        System.out.println(">>4. KẾT THÚC.");
        System.out.print("- Nhập vào sự lựa chọn(1->4): ");
        chon = n.nextInt();
        switch(chon){
            case 1:
                nhap();
                break;
            case 2:
                tim();
                break;
            case 3:
                inDanhSachTao();
                break;
            case 4: 
                System.out.println("- Kết thúc!");
                return;
            default:
                System.out.println("- Lựa chọn không hợp lệ!");
        }
        System.out.print("- Quay lại MENU(1:yes/0:no): ");
        chon = n.nextInt();
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        }  while(chon == 1);

    }
    static void nhap(){
        do{
        System.out.println("- Nhập thông tin của táo:");
        Apple apple = new Apple();
        apple.nhapThongTin();
        khoTao.add(apple);
        System.out.print("- Bạn có muốn nhập thêm không(1:yes/0:no): ");
        chon = n.nextInt();
        } while(chon == 1);
    }
    static void tim(){
        System.out.print("- Nhập màu sắc táo cần tìm: ");
        n.nextLine();
        String mau = n.nextLine();
        for(Apple x : khoTao){
            if((x.mauSac).equals(mau)){
                System.out.println("-----DANH SÁCH TÁO CẦN TÌM-----");
                x.inThongTin();
            }
        }
    }
    static void inDanhSachTao(){
        System.out.println("=====DANH SÁCH TÁO TRONG KHO=====");
        for(Apple x : khoTao){
            x.inThongTin();
        }
    }
    
}
