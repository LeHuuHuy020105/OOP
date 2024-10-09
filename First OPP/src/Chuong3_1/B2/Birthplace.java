package Chuong3_1.B2;

import java.util.Scanner;

public class Birthplace {
    public String ward;
    public String district;
    public String province;
    public Birthplace(){

    }
    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public String toString() {
        return "Birthplace{" +
                "ward='" + ward + '\'' +
                ", district='" + district + '\'' +
                ", province='" + province + '\'' +
                '}';
    }

    public void setInfo(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap phuong:");
        this.setWard(sc.nextLine());
        System.out.println("Nhap quan:");
        this.setDistrict(sc.nextLine());
        System.out.println("Nhap tinh thanh:");
        this.setProvince(sc.nextLine());
    }
}
