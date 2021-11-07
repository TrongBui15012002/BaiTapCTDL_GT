package com.trongbt2008110320.tuan09;

import java.util.Scanner;

public class Apple {
    Node head;
    Node tail;
    int ma;
    double khoiLuong;
    String mauSac;
    Scanner n = new Scanner(System.in);

    void addHead() {
        Node newApple = new Node();
        newApple.nhap();
        if (head == null) {
            head = newApple;
            tail = newApple;
        } else {
            newApple.next = head;
            head = newApple;
        }
    }

    void addTail() {
        Node newApple = new Node();
        newApple.nhap();
        if (head == null) {
            head = newApple;
            tail = newApple;
        } else {
            tail.next = newApple;
            tail = newApple;
        }
    }

    void xuat() {
        Node current = head;
        if (head == null) {
            System.out.println("- Danh sách rỗng.");
        } else {
            while (current != null) {
                current.in();
                current = current.next;
            }
        }
    }

    void bubbleSort() {
        Node current = head;
        Node index = null;
        int tam;
        double tam1;
        String tam2;
        if (head == null) {
            System.out.println("- Danh sách rỗng.");
        } else {
            while (current != null) {
                index = current.next;
                while (index != null) {
                    if (current.khoiLuong > index.khoiLuong) {
                        // mã
                        tam = current.ma;
                        current.ma = index.ma;
                        index.ma = tam;
                        // khối lượng
                        tam1 = current.khoiLuong;
                        current.khoiLuong = index.khoiLuong;
                        index.khoiLuong = tam1;
                        // màu sắc
                        tam2 = current.mauSac;
                        current.mauSac = index.mauSac;
                        index.mauSac = tam2;

                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }

    void search(int maTim){
        Node current = head;
        while(current != null){
            if(current.ma == maTim){
                System.out.println("Táo cần tìm: ");
                current.in();
                return;
            }
            current = current.next;
        }
        System.out.println("Không có táo cần tìm.");
    }

}
