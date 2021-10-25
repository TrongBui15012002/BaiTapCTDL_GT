package com.trongbt2008110320.kiemtragiuaki;

import java.util.Scanner;

public class AppleLinkedList {
    Node head = null;
    Node tail = null;
    Scanner nhap = new Scanner(System.in);
    int ma;
    double khoiLuong;
    String mauSac;
    public AppleLinkedList(){}
    public void nhapThongtin(){
        System.out.print("- Nhập mã của táo: ");
        ma = nhap.nextInt();
        System.out.print("- Nhập khối lượng của táo: ");
        khoiLuong = nhap.nextDouble();
        System.out.print("- Nhập màu sắc của táo: ");
        nhap.nextLine();
        mauSac = nhap.nextLine();
        System.out.println("___________________________");

    }
    public void inThongTin(){
        Node current = head;

        if(head == null){
            System.out.println("- DANH SÁCH RỖNG.");
        }else{
            while(current != null){
                System.out.println("- Mã: "+current.ma);
                System.out.println("- Khối lượng: "+current.khoiLuong);
                System.out.println("- Màu sắc: "+current.mauSac);
                System.out.println("___________________________");
                current = current.next;
            }
        }
    }
    public void addHead(){
        nhapThongtin();
        Node newNode = new Node(ma, khoiLuong, mauSac);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }
    public void addTail(){
        nhapThongtin();
        Node newNode = new Node(ma, khoiLuong, mauSac);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
    }
    void tim(){
        Node tam1 = head;
        System.out.print("- Nhập mã táo muốn tìm: ");
        int maTim = nhap.nextInt();
        while(tam1 != null){
            if(tam1.ma == maTim)
                System.out.println("- Táo muốn tìm: ");
                inThongTin();
            tam1 = tam1.next;
        }
        
    }
    void removeTail(){
        Node tam = head;
        if(head == null){
            System.out.println("- DANH SÁCH RỖNG");
            return;
        }
        while(tam != null){
            if(tam.next == tail){
                tail = tam;
                tail.next = null;
                return;
            }
            tam = tam.next;
        }
    }
    void themTruoc(){
        System.out.println("- Nhập mã của táo muốn thêm trước: ");
        ma = nhap.nextInt();
        tim();
        System.out.println("- Nhập tao muốn thêm: ");
        nhapThongtin();

    }

    
}
