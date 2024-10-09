package Chuong2_3__2_4.LinePoint__2_3__2_4;

public class MyTriangle {
    private MyPoint2D Vertice1;
    private MyPoint2D Vertice2;
    private MyPoint2D Vertice3;
    public MyTriangle(){
        Vertice1=new MyPoint2D();
        Vertice2=new MyPoint2D();
        Vertice3=new MyPoint2D();
    }
    public MyTriangle(int x1,int y1,int x2,int y2){

    }
    public MyTriangle(MyPoint2D Vertice1, MyPoint2D Vertice2, MyPoint2D Vertice3){

    }
    public  double getPerimeter(){
        return Vertice1.distanceEuclid(Vertice2)+Vertice1.distanceEuclid(Vertice3)+Vertice2.distanceEuclid(Vertice3);
    }
    public void setInfo(){
        Vertice1.setInfo();
        Vertice2.setInfo();
        Vertice3.setInfo();
    }

    public static void main(String[] args) {
        MyTriangle s=new MyTriangle();
        s.setInfo();
        System.out.println(s.getPerimeter());

    }
}
