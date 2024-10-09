package Chuong3_1.B3;

import java.util.Scanner;

public class Vang {
    private int loaivang;
    public static double bangGiavang[][];

    public Vang() {
    }

    public Vang(int loaivang) {
        this.loaivang = loaivang;
    }

    public int getLoaivang() {
        return loaivang;
    }

    public void setLoaivang(int loaivang) {
        this.loaivang = loaivang;
    }

    public static double[][] getBangGiavang() {
        return bangGiavang;
    }

    public static void setBangGiavang(double[][] bangGiavang) {
        Vang.bangGiavang = bangGiavang;
    }
    public static void setBangGiavang(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Gia vang 9999 thu vao: ");
        bangGiavang[0][0]=Integer.parseInt(sc.nextLine());
        System.out.println("Gia vang 9999 ban ra: ");
        bangGiavang[0][1]=Integer.parseInt(sc.nextLine());
        System.out.println("Gia vang 24k thu vao: ");
        bangGiavang[1][0]=Integer.parseInt(sc.nextLine());
        System.out.println("Gia vang 24k ban ra: ");
        bangGiavang[1][1]=Integer.parseInt(sc.nextLine());
        System.out.println("Gia vang 18k thu vao: ");
        bangGiavang[2][0]=Integer.parseInt(sc.nextLine());
        System.out.println("Gia vang 18k ban ra: ");
        bangGiavang[2][1]=Integer.parseInt(sc.nextLine());
    }
    public static void printBangGiavang(){
        System.out.println("Loai Vang \tThu Vao \tBan ra");
        System.out.println("Vang 9999 \t"+bangGiavang[0][0]+"\t \t \t"+bangGiavang[0][1]);
        System.out.println("Vang 24k \t"+bangGiavang[1][0]+"\t \t \t"+bangGiavang[1][1]);
        System.out.println("Vang 18k \t"+bangGiavang[2][0]+"\t \t \t"+bangGiavang[2][1]);
    }
    @Override
    public String toString() {
        return "Vang{" +
                "loaivang='" + loaivang + '\'' +
                '}';
    }
}
