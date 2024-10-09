package Chuong2_3__2_4.Bai6NC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BuyBook {
    public ArrayList<TheBook> cart;

    public BuyBook() {
        cart=new ArrayList<>();
    }

    public ArrayList<TheBook> getCart() {
        return cart;
    }
    public TheBook getBookfromList(int i){
        return cart.get(i);
    }
    public boolean addToCart(TheBook book){
       if (book==null){
           return false;
       }
       cart.add(book);
       return true;
    }
    public double tienHang(){
        int sum=0;
        for (int i=0;i<cart.size();i++){
            sum+=cart.get(i).price*cart.get(i).qtylnStock;
        }
        return sum;
    }
    public void ttMotcuonsach(TheBook book){
        System.out.println(book.toString());
    }
    public void xoaMotcuonsach(TheBook book){
        cart.remove(book);
    }
    @Override
    public String toString() {
        return "BuyBook{" +
                 cart +
                '}';
    }
    public static void menu(){
        System.out.println("_______Vui long nhap lua chon______");
        System.out.println("1.Them 1 cuon sach vao gio hang");
        System.out.println("2.Xoa 1 cuon sach trong gio hang");
        System.out.println("3.Xem thong tin 1 cuon sach");
        System.out.println("4.In Gio Hang");
        System.out.println("5.Tong Tien");
        System.out.println("6.Ket Thuc");
    }
    public static void main(String[] args) {
        BuyBook a=new BuyBook();
        Scanner sc=new Scanner(System.in);
        boolean flag=true;
        int choice;
        while (flag==true){
            menu();
            choice=Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    System.out.println("__Nhap thong tin__");
                    TheBook tmp=new TheBook();
                    tmp.setInfo();
                    a.addToCart(tmp);
                    break;
                case 2:
                    System.out.println("__Nhap thong tin__");
                    tmp=new TheBook();
                    tmp.setInfo();
                    a.xoaMotcuonsach(tmp);
                    break;
                case 3:
                    System.out.println("__Nhap thong tin__");
                    tmp=new TheBook();
                    tmp.setInfo();
                    a.ttMotcuonsach(tmp);
                    break;
                case 4:
                    System.out.println(a.toString());
                    break;
                case 5:
                    System.out.println(a.tienHang());
                    break;
                case 6:
                    flag=false;
                    break;
            }
        }
    }
}
