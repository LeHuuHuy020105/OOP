package Chuong3_1.B3;

import java.util.Scanner;

public class NgayThang {
    private int Ngay;
    private int Thang;
    private int Nam;

    public NgayThang(int ngay, int thang, int nam) {
        Ngay = ngay;
        Thang = thang;
        Nam = nam;
    }

    public NgayThang() {
    }

    public int getNgay() {
        return Ngay;
    }

    public void setNgay(int ngay) {
        Ngay = ngay;
    }

    public int getThang() {
        return Thang;
    }

    public void setThang(int thang) {
        Thang = thang;
    }

    public int getNam() {
        return Nam;
    }

    public void setNam(int nam) {
        Nam = nam;
    }
    public void setInfo(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ngay: ");
        this.setNgay(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhap thang: ");
        this.setThang(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhap nam:");
        this.setNam(Integer.parseInt(sc.nextLine()));
    }
    @Override
    public String toString() {
        return  Ngay +
                "/" + Thang +
                "/" + Nam
                ;
    }
}
