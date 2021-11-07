package com.trongbt2008110320.tuan08;

public class QueueNode {
    String nhaSanXuat;
    String loai;
    double gia;
    int namSX;
    QueueNode next;
    QueueNode(){

    }
    QueueNode(String nsx, int n, String l, double g){
        nhaSanXuat = nsx;
        loai = l;
        gia = g;
        namSX = n;
    }
}
