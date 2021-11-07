package com.trongbt2008110320.tuan08;

import java.util.Scanner;

public class QueueBookTestDrive {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int chon;
        QueueBook queueBook = new QueueBook();
        do{
            System.out.println("==========MENU==========");
            System.out.println(">>1: Thêm cuối");
            System.out.println(">>2: Xóa đầu");
            System.out.println(">>3: Xem đầu");
            System.out.println(">>4: Xuất danh sách");
            System.out.println(">>5: KẾT THÚC<<");
            System.out.print("- Nhập vào sự lựa chọn(1->5): ");
            chon = n.nextInt();
            switch(chon){
                case 1:
                    queueBook.queuePush();
                    break;
                case 2:
                    queueBook.queuePop();
                    break;
                case 3: 
                    queueBook.queuePeek();;
                    break;
                case 4: 
                    queueBook.xuat();
                    break;
                case 5:
                    System.out.println("- Kết thúc!!!");
                    return;
                default: 
                    System.out.println("- Lựa chọn sai!!!");
            }
            System.out.print("- Quay lại menu(1:yes/0:no): ");
            chon = n.nextInt();
        } while(chon == 1);
        n.close();
    }
    
}
