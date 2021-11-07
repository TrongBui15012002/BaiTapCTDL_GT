package com.trongbt2008110320.tuan08;

import java.util.Scanner;

public class StackStudentTestDrive {
    public static void main(String[] args) {
        int chon;
        Scanner nhap = new Scanner(System.in);
        StackStudent stackStudent = new StackStudent();
        do{
            System.out.println("========MENU========");
            System.out.println(">>1. Thêm thông tin vào cuối danh sách.");
            System.out.println(">>2. Xóa thông tin ở cuối danh sách.");
            System.out.println(">>3. Xem thông tin ở cuối danh sách.");
            System.out.println(">>4. Xuất danh sách.");
            System.out.println(">>5. Kết thúc.");
            System.out.print("- Nhập vào lựa chọn(1->5): ");
            chon = nhap.nextInt();
            switch(chon){
                case 1:
                    stackStudent.stackPush();
                    break;
                case 2:
                    stackStudent.stackPop();
                    break;
                case 3:
                    stackStudent.stackPeek();
                    break;
                case 4:
                    stackStudent.xuat();
                    break;
                case 5: 
                    System.out.println("- KẾT THÚC!!");
                    return;
                default:
                    System.out.println("- Lựa chọn không hợp lệ.");
            }
            System.out.print("- Quay lại menu (1:yes/0:no): ");
            chon = nhap.nextInt();
        } while(chon == 1);
        nhap.close();
    }
    
    
}
