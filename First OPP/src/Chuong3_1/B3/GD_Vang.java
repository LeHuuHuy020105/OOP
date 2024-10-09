package Chuong3_1.B3;

import java.util.Scanner;

public class GD_Vang extends Giaodich{
    private Vang VangGD;
    private int loaiGD;
    public GD_Vang(){
        VangGD=new Vang();
    }
    public GD_Vang(Vang vangGD, int loaiGD) {
        VangGD = vangGD;
        this.loaiGD = loaiGD;
    }

    public GD_Vang(String magiaodich, NgayThang ngaygiaodich, double dongia, double thanhtien, Vang vangGD, int loaiGD) {
        super(magiaodich, ngaygiaodich, dongia, thanhtien);
        VangGD = vangGD;
        this.loaiGD = loaiGD;
    }

    public Vang getVangGD() {
        return VangGD;
    }

    public void setVangGD(Vang vangGD) {
        VangGD = vangGD;
    }

    public int getLoaiGD() {
        return loaiGD;
    }

    public void setLoaiGD(int loaiGD) {
        this.loaiGD = loaiGD;
    }

    public void setInfo(){
        super.setInfo();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap loai giao dich: ");
        System.out.println("Thu:0 - Ban:1");
        this.setLoaiGD(Integer.parseInt(sc.nextLine()));
        System.out.println("Loai Vang: ");
        System.out.println("0.Vang 9999");
        System.out.println("1.Vang 24k");
        System.out.println("2.Vang 18k");
        int loaiVang=Integer.parseInt(sc.nextLine());
        super.setDongia(Vang.bangGiavang[loaiVang][this.getLoaiGD()]);
    }
    public void thucHienGD(){
        super.setThanhtien(super.getSoluong()*super.getDongia());
        System.out.println(this.toString());
    }
}
