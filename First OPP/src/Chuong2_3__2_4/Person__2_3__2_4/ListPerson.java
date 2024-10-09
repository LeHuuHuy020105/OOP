package Chuong2_3__2_4.Person__2_3__2_4;

import Chuong2_3__2_4.LinePoint__2_3__2_4.Line;

import java.util.ArrayList;
import java.util.Scanner;

public class ListPerson {
    ArrayList <Person> arrayList;

    public ListPerson() {
        arrayList=new ArrayList<>();
    }

    public ListPerson(ArrayList<Person> arrayList) {
        this.arrayList = arrayList;
    }
    public void themMotnguoi(){
        Person a=new Person();
        a.setInfo();
        arrayList.add(a);
    }
    public void xoaMotnguoi(){
        System.out.println("Nhap ID nguoi muon xoa: ");
        Scanner sc=new Scanner(System.in);
        String ID=sc.nextLine();
        System.out.println(ID);
        for (int i=0;i<arrayList.size();i++){
            if(arrayList.get(i).ID.equals(ID)){
                arrayList.remove(i);
            }
        }
    }
    public void sapxepDS(){
        for (int i=0;i<arrayList.size()-1;i++){
            for (int j=1;j<arrayList.size();j++){
                if(arrayList.get(i).name.compareTo(arrayList.get(j).name) >0){
                    Person tmp=arrayList.get(i);
                    arrayList.set(i,arrayList.get(j));
                    arrayList.set(j,tmp);
                }
            }
        }
    }
    @Override
    public String toString() {
        return
                "arrayList=" + arrayList;
    }
    public static void menu(){
        System.out.println("Vui long nhap lua chon");
        System.out.println("1.Nhap them 1 nguoi");
        System.out.println("2.Xoa 1 nguoi");
        System.out.println("3.Sap xep Danh Sach");
        System.out.println("4.In DS");
        System.out.println("5.Ket thuc");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ListPerson s=new ListPerson();
        int choice;
        boolean flag=true;
        while (flag==true){
            menu();
            choice=Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    s.themMotnguoi();
                    break;
                case 2:
                    s.xoaMotnguoi();
                    break;
                case 3:
                    s.sapxepDS();
                    break;
                case 4:
                    System.out.println(s.toString());
                    break;
                case 5:
                    flag=false;
                    break;
            }
        }
    }
}
