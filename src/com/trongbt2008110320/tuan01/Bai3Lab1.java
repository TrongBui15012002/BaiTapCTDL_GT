package com.trongbt2008110320.tuan01;

import java.util.Scanner;

public class Bai3Lab1 {
    public static void main(String[] args) {
        double delta;
        int a, b, c;
        Scanner heSo = new Scanner(System.in);
        System.out.print("Nhập a = ");
        a = heSo.nextInt();
        System.out.print("Nhập b = ");
        b = heSo.nextInt();
        System.out.print("Nhập c = ");
        c = heSo.nextInt();
        delta = Math.pow(b, 2) - 4*a*c;
        System.out.printf("Delta = %.2f", delta);
        heSo.close();
    }
    
}
