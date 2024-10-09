package Chuong3_1.B1;

import java.util.ArrayList;
import java.util.Scanner;

public class Quanli {
    public ArrayList<Line2> arrayList;

    public Quanli() {
        arrayList=new ArrayList<>();
    }

    public Quanli(ArrayList<Line2> arrayList) {
        this.arrayList = arrayList;
    }
    public void addMotduongthang(){
        Line2 tmp=new Line2();
        tmp.setInfo();
        arrayList.add(tmp);
    }
    public void xoaMotduongthang(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vi tri can xoa: ");
        int vitri=Integer.parseInt(sc.nextLine());
        arrayList.remove(vitri);
    }
    public void sapXep(){
        for (int i=0;i<arrayList.size()-1;i++){
            for (int j=1;j<arrayList.size();j++){
                if(arrayList.get(i).getLength() > arrayList.get(j).getLength()){
                    Line2 tmp= arrayList.get(i);
                    arrayList.set(i,arrayList.get(j));
                    arrayList.set(j,tmp);
                }
            }
        }
    }
    public static void menu(){
        System.out.println("___Vui long nhap lua chon___");
        System.out.println("1.Them mot duong thang");
        System.out.println("2.Xoa mot duong thang");
        System.out.println("3.Sap xep mot duong thang");
        System.out.println("4.Ket thuc");
    }

    @Override
    public String toString() {
        return "Quanli{" +
                "arrayList=" + arrayList +
                '}';
    }
}
