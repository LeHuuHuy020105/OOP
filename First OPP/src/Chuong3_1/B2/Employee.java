package Chuong3_1.B2;

import java.util.Scanner;

public class Employee extends Person{
    private String vitri;
    private double mucluong;
    private String ngaylamviec;

    public Employee() {

    }

    public Employee(String vitri, int mucluong, String ngaylamviec) {
        this.vitri = vitri;
        this.mucluong = mucluong;
        this.ngaylamviec = ngaylamviec;
    }

    public String getVitri() {
        return vitri;
    }

    public void setVitri(String vitri) {
        this.vitri = vitri;
    }

    public double getMucluong() {
        return mucluong;
    }

    public void setMucluong(Double mucluong) {
        this.mucluong = mucluong;
    }

    public String getNgaylamviec() {
        return ngaylamviec;
    }

    public void setNgaylamviec(String ngaylamviec) {
        this.ngaylamviec = ngaylamviec;
    }

    public double tienLuong(){
        return mucluong+mucluong*0.1;
    }
    public void setInfo(){
        super.setInfo();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vi tri: ");
        setVitri(sc.nextLine());
        System.out.println("Nhap muc luong: ");
        setMucluong(Double.parseDouble(sc.nextLine()));
        System.out.println("Nhap ngay lam viec: ");
        setNgaylamviec(sc.nextLine());
    }
    @Override
    public String toString() {
        return super.toString()+"Employee{" +
                "vitri='" + vitri + '\'' +
                ", luong=" + mucluong +
                ", ngaylamviec='" + ngaylamviec + '\'' +
                '}';
    }
}
