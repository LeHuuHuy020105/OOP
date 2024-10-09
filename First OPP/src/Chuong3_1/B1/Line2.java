package Chuong3_1.B1;

import java.util.Scanner;

public class Line2 extends MyPoint2D {
    private String name;
    public MyPoint2D pEnd;
    public Line2(){

    }
    public Line2(String name, MyPoint2D pEnd,int x,int y){
        super(x,y);
        this.pEnd=pEnd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MyPoint2D getpEnd() {
        return pEnd;
    }

    public void setpEnd(MyPoint2D pEnd) {
        this.pEnd = pEnd;
    }
    public double getLength() {
        return this.distanceEuclid(super.x,super.y);
    }
    public void setInfo(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap diem bat dau: ");
        super.setInfo();
        System.out.println("Nhap diem ket thuc: ");
        MyPoint2D tmp=new MyPoint2D();
        tmp.setInfo();
        this.setpEnd(tmp);
        System.out.println("Nhap ten duong thang: ");
        this.setName(sc.nextLine());
    }
}
