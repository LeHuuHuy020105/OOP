package Chuong3_1.B3;

public class Main {
    public static void main(String[] args) {
        System.out.println("________Bang gia vang hom nay____________");
        Vang.bangGiavang=new double[3][3];
        Vang.setBangGiavang();
        Vang.printBangGiavang();
        GD_Vang gd1=new GD_Vang();
        gd1.setInfo();
        gd1.thucHienGD();
    }
}
