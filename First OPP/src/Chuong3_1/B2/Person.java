package Chuong3_1.B2;

import Chuong2_3__2_4.Person__2_3__2_4.Birthplace;

import java.util.Scanner;

public class Person {
    public String ID;
    public String name;
    public String Birthday;
    public Birthplace diachi;
    public Person(){
        diachi=new Birthplace();
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return Birthday;
    }

    public void setBirthday(String birthday) {
        Birthday = birthday;
    }

    public Birthplace getDiachi() {
        return diachi;
    }

    public void setDiachi(Birthplace diachi) {
        this.diachi = diachi;
    }

    public void setInfo(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ID:");
        setID(sc.nextLine());
        System.out.println("Nhap ho va ten: ");
        setName(sc.nextLine());
        System.out.println("Nhap nam sinh:");
        setBirthday(sc.nextLine());
        System.out.println("_Nhap dia chi_");
        this.diachi.setInfo();
    }

    @Override
    public String toString() {
        return
                "[ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", Birthday='" + Birthday + '\'' +
                ", diachi=" + diachi +
                ']';
    }

    public static void main(String[] args) {
        Person huy=new Person();
        huy.setInfo();
        System.out.println(huy);
    }
}
