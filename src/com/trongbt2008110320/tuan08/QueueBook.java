package com.trongbt2008110320.tuan08;

import java.util.Scanner;

public class QueueBook {
    QueueNode head;
    QueueNode tail;
    String nhaSanXuat;
    String loai;
    double gia;
    int namSX;
    Scanner nhap = new Scanner(System.in);
    public QueueBook(){

    }
    public void inThongtin(){
        System.out.println("- Nhà sản xuất: "+nhaSanXuat);
        System.out.println("- Năm sản xuất: "+namSX);
        System.out.println("- Loại: "+loai);
        System.out.println("- Giá: "+gia);
        System.out.println("__________________________________");
    }
    //hàm nhập thông tin
    public void nhapTT(){
        System.out.print("- Nhà sản xuất: ");
        nhaSanXuat = nhap.nextLine();
        System.out.print("- Năm sản xuất: ");
        namSX = nhap.nextInt();
        System.out.print("- Loại: ");
        nhap.nextLine();
        loai = nhap.nextLine();
        System.out.print("- Giá: ");
        gia = nhap.nextDouble();
        nhap.nextLine();
        System.out.println("__________________________________");
    }
    
    //xuất
    public void xuat(){
        QueueNode current = head;
        if(head == null){
            System.out.println("- Danh sách rỗng.");
            return;
        }
        System.out.println("==============DANH SÁCH============");
        while(current != null){
            System.out.println("- Nhà sản xuất: "+current.nhaSanXuat);
            System.out.println("- Năm sản xuất: "+current.namSX);
            System.out.println("- Loại: "+current.loai);
            System.out.println("- Giá: "+current.gia);
            System.out.println("__________________________________");
            current = current.next;
        }
    }
    //hàm thêm cuối
    public void queuePush(){
        nhapTT();
        QueueNode newNode = new QueueNode(nhaSanXuat, namSX, loai, gia);
        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode; 
    }
    //lấy phần tử ở đầu
    public void queuePeek(){
        if(head == null){
            System.out.println("- Danh sách rỗng");
            return;
        }
        System.out.println("- Phần tử đầu của danh sách là: ");
        inThongtin();

    }
    //xóa phần tử ở đầu
    public void queuePop(){
        if(head == null){
            System.out.println("- Danh sách rỗng");
            return;
        }
        head = head.next;
        System.out.println("- Xóa thành công!");
    }

    
}
