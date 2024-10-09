package TH2_1.Bai4;

import java.util.Scanner;

public class MyPoint2D {
    public int x;
    public int y;
    public MyPoint2D(){

    }
    public MyPoint2D(int x,int y){
        this.x=x;
        this.y=y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y=y;
    }
    public void setX(int x){
        this.x=x;
    }
    public double distanceEuclid(int x,int y){
        return Math.sqrt(Math.pow((this.x-x),2)+Math.pow((this.y-y),2));
    }
    public double distanceEuclid(MyPoint2D point){
        return distanceEuclid(point.x, point.y);
    }
    public double distanceMahattan(int x,int y){
        return Math.abs(this.x-x)+Math.abs(this.y-y);
    }
    public double distanceMahattan(MyPoint2D point){
        return distanceMahattan(point.x, point.y);
    }
    public String toString(){
        return "Diem co toa do: " + "x= " + x+" y= " + y;
    }
    public void setInfo(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap x: ");
        setX(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhap y: ");
        setY(Integer.parseInt(sc.nextLine()));
    }
}
