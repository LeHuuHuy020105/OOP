package TH2_1.Bai5;

import java.util.Scanner;

public class Phanso2 {
    private int tuso;
    private int mauso;

    public Phanso2() {

    }

    public Phanso2(int tuso, int mauso) {
        this.tuso = tuso;
        this.mauso = mauso;
    }

    public int getMauso() {
        return mauso;
    }

    public int getTuso() {
        return tuso;
    }

    public void setTuso(int tuso) {
        this.tuso = tuso;
    }

    public void setMauso(int mauso) {
        this.mauso = mauso;
    }
    int timUCLN(int a, int b){
        int i=0;
        int ucln=0;
        while (i<=a && i<=b){
            if(a%i==0 && b%i==0){
                ucln=i;
            }
            i++;
        }
        return ucln;
    }
    public void rutGon(){
        int ucln=timUCLN(tuso,mauso);
        this.tuso=this.tuso/ucln;
        this.mauso=this.mauso/ucln;
    }
    public Phanso2 Cong(Phanso2 ps2){
        int tuso=this.tuso* ps2.mauso+ ps2.tuso*this.mauso;
        int mauso=this.mauso* ps2.mauso;
        Phanso2 ps3=new Phanso2(tuso,mauso);
        ps3.rutGon();
        return ps3;
    }
    public void CongPs(Phanso2 ps2) {
        this.tuso = this.tuso * ps2.mauso + ps2.tuso * this.mauso;
        this.mauso = this.mauso * ps2.mauso;
    }
    @Override
    public String toString() {
        return "Phanso2{" +
                "tuso=" + tuso +
                ", mauso=" + mauso +
                '}';
    }
    public void setInfo(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap phan so");
        this.setTuso(Integer.parseInt(sc.nextLine()));
        this.setMauso(Integer.parseInt(sc.nextLine()));
        this.rutGon();
    }
}