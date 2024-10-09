package TH2_1.Bai4;

public class Main {
    public static void main(String[] args) {
        MyPoint2D point1=new MyPoint2D(5,10);
        MyPoint2D point2=new MyPoint2D(1,1);
        System.out.println(point1.distanceMahattan(point2));
    }
}
