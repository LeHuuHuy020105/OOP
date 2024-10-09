package Chuong3_1.B2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HRManager ql=new HRManager();
        boolean flag=true;
        int choice;
        while (flag){
            HRManager.menu();
            choice=Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    ql.themMotnv();
                    break;
                case 2:
                    ql.loaiMotnv();
                    break;
                case 3:
                    ql.timkiemNV();
                    break;
                case 4:
                    ql.sapXep();
                    break;
                case 5:
                    System.out.println(ql.toString());
                    break;
                case 6:
                    flag=false;
                    break;
            }
        }
    }

}
