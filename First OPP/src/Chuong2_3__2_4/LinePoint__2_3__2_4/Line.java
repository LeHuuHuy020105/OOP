package Chuong2_3__2_4.LinePoint__2_3__2_4;

//import javax.xml.transform.Source;

public class Line {
    private MyPoint2D pBegin;
    private MyPoint2D pEnd;
    public Line(){
        pBegin=new MyPoint2D();
        pEnd=new MyPoint2D();
    }
    public Line(MyPoint2D p1, MyPoint2D p2) {

    }
    public Line(int x1, int y1,int x2,int y2){

    }

    public MyPoint2D getpBegin() {
        return pBegin;
    }

    public void setpBegin(MyPoint2D pBegin) {
        this.pBegin = pBegin;
    }

    public MyPoint2D getpEnd() {
        return pEnd;
    }

    public void setpEnd(MyPoint2D pEnd) {
        this.pEnd = pEnd;
    }

    @Override
    public String toString() {
        return
                "[ pBegin=(" + pBegin +
                "), pEnd=(" + pEnd +
                ')'+", Do dai= "+this.length()+" ]";
    }
    public void setInfo(){
        pBegin.setInfo();
        pEnd.setInfo();
    }
    public double length(){
        return this.pBegin.distanceEuclid(pEnd);
    }

    public static void main(String[] args) {
        Line a=new Line();
        a.setInfo();
//        System.out.println(a.length());
        System.out.println(a.toString());
    }
}
