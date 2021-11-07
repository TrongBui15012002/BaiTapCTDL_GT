package com.trongbt2008110320.tuan08;

import java.util.Scanner;

public class StackStudent {
    StackNode head;
    StackNode tail;
    String hoTen;
    int mssv;
    String lop;
    String queQuan;
    Scanner nhap = new Scanner(System.in);
    public StackStudent(){}
    public void nhapThongTinSV(){
        System.out.print("+ Nhập họ và tên sinh viên: ");
        hoTen = nhap.nextLine();
        System.out.print("+ Nhập mã số sinh viên: ");
        mssv = nhap.nextInt();
        nhap.nextLine();
        System.out.print("+ Nhập lớp của sinh viên: ");
        lop = nhap.nextLine();
        System.out.print("+ Nhập quê quán của sinh viên: ");
        queQuan = nhap.nextLine();
    }
    public void inThongTinSV(){
        System.out.println("- Họ và tên: "+hoTen);
        System.out.println("- Mã số sinh viên: "+mssv);
        System.out.println("- Lớp: "+lop);
        System.out.println("- Quê quán: "+queQuan);
        System.out.println("_____________________________________");
    }
    public void stackPush(){
        nhapThongTinSV();
        StackNode newNode = new StackNode(hoTen, mssv, lop, queQuan);
        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void stackPop(){
        StackNode tam = head;
        if(head == null){
            System.out.println("- DANH SÁCH RỖNG");
            return;
        }
        while(tam != null){
            if(tam == tail){
                head = null;
                System.out.println("- Xóa thành công");
                return;
            }
            if(tam.next == tail){
                tail = tam;
                tail.next = null;
                System.out.println("- Xóa thành công!");
                return;
            }
            tam = tam.next;
        }
    }
    public void stackPeek(){
        if(tail == null){
            System.out.println("- DANH SÁCH RỖNG!");
            return;
        }
        System.out.println("+ Thông tin sinh viên cuối là: ");
        inThongTinSV();
    }
    public void xuat(){
        StackNode current = head;
        if(head == null){
            System.out.println("- DANH SÁCH RỖNG!");
        }else{
            System.out.println("--------DANH SÁCH SINH VIÊN--------");
            while(current !=null){
                System.out.println("- Họ và tên: "+current.hoTen);
                System.out.println("- Mã số sinh viên: "+current.mssv);
                System.out.println("- Lớp: "+current.lop);
                System.out.println("- Quê quán: "+current.queQuan);
                System.out.println("_____________________________________");
                current = current.next;
        }
    }
    }
    
}
