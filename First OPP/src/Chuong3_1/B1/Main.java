package Chuong3_1.B1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Quanli ql=new Quanli();
        boolean flag=true;
        int choice;
        while (flag==true){
            Quanli.menu();
            choice=Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    ql.addMotduongthang();
                    break;
                case 2:
                    ql.xoaMotduongthang();
                    break;
                case 3:
                    ql.sapXep();
                    break;
                case 4:
                    System.out.println(ql.toString());
                    break;
                case 5:
                    flag=false;
                    break;
            }
        }
    }
}
