package Chuong2_3__2_4.LinePoint__2_3__2_4;

import java.util.Arrays;
import java.util.Scanner;

public class SetofLine {
    public Line[] arr_line;
    public SetofLine() {
        arr_line= new Line[0];
    }

    public Line[] getArr_line() {
        return arr_line;
    }

    public void setArr_line(Line[] arr_line) {
        this.arr_line = arr_line;
    }

    public void themMotDuongThang(){
        Line a=new Line();
        a.setInfo();
       this.arr_line= Arrays.copyOf(this.arr_line,this.arr_line.length +1);
       this.arr_line[this.arr_line.length-1]=a;
    }
    public void nhapNDuongThang(int n){
        this.arr_line=Arrays.copyOf(this.arr_line,n);
        for(int i=0;i<n;i++){
            Line a=new Line();
            a.setInfo();
            arr_line[i]=a;
        }
    }
    public void themNDuongThang(int n){
        int dodai=this.arr_line.length;
        this.arr_line=Arrays.copyOf(this.arr_line,this.arr_line.length+n);
        for(int i=0;i<n;i++){
            Line a=new Line();
            a.setInfo();
            this.arr_line[dodai+i]=a;
        }
    }
    public void hoanVi(Line a, Line b){
        Line tmp=a;
        a=b;
        b=tmp;
    }

    public void sapXeptangdan(){
        for(int i=0;i<arr_line.length-1;i++){
            for (int j=1;j<arr_line.length;j++){
                if(arr_line[i].length()>arr_line[j].length()){
                    Line tmp=this.arr_line[i];
                    this.arr_line[i]=this.arr_line[j];
                    this.arr_line[j]=tmp;
//                    hoanVi(arr_line[i],arr_line[j]);
                }
            }
        }
    }
    public static void hoanVi(int i,int j, Line[]arr_line){
        Line tmp=arr_line[i];
        arr_line[i]=arr_line[j];
        arr_line[j]=tmp;
    }
    public void sapXepgiamdan(){
        for(int i=0;i<arr_line.length-1;i++){
            for (int j=1;j<arr_line.length;j++){
                if(arr_line[i].length()<arr_line[j].length()){
                    hoanVi(i,j,arr_line);
                }
            }
        }
    }
    public double getMaxlength(){
        double max=0;
        for (int i=0;i<arr_line.length;i++){
            if(arr_line[i].length()>max){
                max=arr_line[i].length();
            }
        }
        return max;
    }
    public void xoaPTArray(){
        int vitri;
        System.out.println("Nhap vi tri:");
        Scanner sc=new Scanner(System.in);
        vitri=Integer.parseInt(sc.nextLine());
        for(int i=vitri-1;i<arr_line.length-1;i++){
            arr_line[i]=arr_line[i+1];
        }
        arr_line=Arrays.copyOf(arr_line,arr_line.length);
    }
    @Override
    public String toString() {
        return
                "arr_line=" + Arrays.toString(arr_line)
                ;
    }
    public static void menu(){
        System.out.println("Vui long nhap lua chon cua ban");
        System.out.println("0.Sap Xep Mang Tang Dan");
        System.out.println("1.Sap Xep mang Giam Dan");
        System.out.println("2.Nhap Them 1 Line");
        System.out.println("3.Lay Duong Thang Dai Nhat");
        System.out.println("4.Xoa PT 1 Vi Tri");
        System.out.println("5.In mang");
        System.out.println("6.Ket thuc");
    }
    public static void main(String[] args) {
        SetofLine s=new SetofLine();
        boolean tmp=true;
        int choice;
        Scanner sc=new Scanner(System.in);
        while(tmp==true){
            SetofLine.menu();
            choice=Integer.parseInt(sc.nextLine());
            switch (choice){
                case 0:
                    s.sapXeptangdan();
                    break;
                case 1:
                    s.sapXepgiamdan();
                    break;
                case 2:
                    s.themMotDuongThang();
                    break;
                case 3:
                    System.out.println(s.getMaxlength());
                    break;
                case 4:
                    s.xoaPTArray();
                    break;
                case 5:
                    System.out.println(s.toString());
                    break;
                case 6:
                    tmp=false;
                    break;
            }
        }
    }
}
