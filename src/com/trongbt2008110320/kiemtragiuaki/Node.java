package com.trongbt2008110320.kiemtragiuaki;

import java.util.Scanner;

public class Node {
    int ma;
    double khoiLuong;
    String mauSac;
    Node next;
    Scanner nhap = new Scanner(System.in);

    Node(){

    }

    Node(int m, double kl, String ms){
        ma = m;
        khoiLuong = kl;
        mauSac = ms;
    }
}