package Chuong3_1.B2;

import java.util.ArrayList;
import java.util.Scanner;

public class HRManager {
    ArrayList<Employee> arrayList;

    public HRManager() {
        arrayList=new ArrayList<>();
    }
    public void themMotnv(){
        Employee tmp=new Employee();
        tmp.setInfo();
        arrayList.add(tmp);
    }
    public void loaiMotnv(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ID nhan vien muon loai bo:");
        String ID=sc.nextLine();
        for (int i=0;i<arrayList.size();i++){
            if(arrayList.get(i).ID.compareTo(ID)==0){
                arrayList.remove(i);
            }
        }
    }
    public void timkiemNV(){
        Scanner sc=new Scanner(System.in); 
        System.out.println("Nhap ID nhan vien muon tim kiem:");
        String ID=sc.nextLine();
        for (int i=0;i<arrayList.size();i++){
            if(arrayList.get(i).ID.compareTo(ID)==0){
                System.out.println(arrayList.get(i).toString());
            }
        }
    }
    public void sapXep(){
        for (int i=0;i<arrayList.size()-1;i++){
            for (int j=1;j<arrayList.size();j++){
                if(arrayList.get(i).name.compareTo(arrayList.get(j).name) >0){
                    Employee tmp=arrayList.get(i);
                    arrayList.set(i,arrayList.get(j));
                    arrayList.set(j,tmp);
                }
            }
        }
    }
    public static void menu(){
        System.out.println("Vui long nhap lua chon:");
        System.out.println("1.Them 1 nhan vien");
        System.out.println("2.Loai 1 nhan vien");
        System.out.println("3.Tim kiem 1 nhan vien");
        System.out.println("4.Sap xep danh sach");
        System.out.println("5.In danh sach");
        System.out.println("6.Ket thuc");
    }
    @Override
    public String toString() {
        return "HRManager[" +
                 arrayList +
                ']';
    }
}
