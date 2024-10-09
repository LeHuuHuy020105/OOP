package Chuong3_1.B3;

import java.util.Scanner;

public class Giaodich {
    private String magiaodich;
    private NgayThang ngaygiaodich;
    private double dongia;
    private double soluong;
    private double thanhtien;

    public Giaodich() {
    }

    public Giaodich(String magiaodich, NgayThang ngaygiaodich, double dongia, double thanhtien) {
        this.magiaodich = magiaodich;
        this.ngaygiaodich = ngaygiaodich;
        this.dongia = dongia;
        this.thanhtien = thanhtien;
    }

    public double getSoluong() {
        return soluong;
    }

    public void setSoluong(double soluong) {
        this.soluong = soluong;
    }

    public String getMagiaodich() {
        return magiaodich;
    }

    public void setMagiaodich(String magiaodich) {
        this.magiaodich = magiaodich;
    }

    public NgayThang getNgaygiaodich() {
        return ngaygiaodich;
    }

    public void setNgaygiaodich(NgayThang ngaygiaodich) {
        this.ngaygiaodich = ngaygiaodich;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    public double getThanhtien() {
        return thanhtien;
    }

    public void setThanhtien(double thanhtien) {
        this.thanhtien = thanhtien;
    }
    public void setInfo(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Ma giao dich:");
        this.setMagiaodich(sc.nextLine());
        System.out.println("Ngay giao dich:");
        NgayThang tmp=new NgayThang();
        tmp.setInfo();
        this.setNgaygiaodich(tmp);
        System.out.println("So luong: ");
        this.setSoluong(Integer.parseInt(sc.nextLine()));
    }
    @Override
    public String toString() {
        return
                "Magiaodich='" + magiaodich +
                ", Ngaygiaodich=" + ngaygiaodich +
                ", DonGia=" + dongia + "Soluong: "+soluong+
                ", ThanhTien=" + thanhtien
                ;
    }
}
