package TH2_1.Bai3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class TheKid {
    public String name;
    public int age;
    public int[]weight;
    public TheKid(){

    }
    public TheKid(String name, int age,int weight[]){
        this.name=name;
        this.age=age;
        this.weight=weight;
    }
    public TheKid(String name,int age){
        this.name=name;
        this.age=age;
    }
    public TheKid(String name){
        this.name=name;
    }
    public String toString(){
        return name+" "+age+" "+ Arrays.toString(weight);
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(){
        this.age=age;
    }
    public void setWeight(int[]weight){
        this.weight=weight;
    }
    public void setInfo(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ten tre: ");
        this.name=sc.nextLine();
        System.out.println("Nhap so thang cua tre: ");
        this.age=Integer.parseInt(sc.nextLine());
        int[]a=new int[age];
        for(int i=0;i<age;i++) {
            System.out.println("Thang thu " + (i+1) + " : ");
            a[i]= Integer.parseInt(sc.nextLine());
        }
       setWeight(a);
    }

}
