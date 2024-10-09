package TH2_1.Bai1;

public class Circle {
    public double radius;
    public String color;
    public Circle(){
        this.radius=0;
        color=null;
    }
    public Circle(double radius, String color){
        this.radius=radius;
        this.color=color;
    }
    public Circle(double radius){
        this.radius=radius;
    }
    public String getColor(){
        return color;
    }
    public double getRadius(){
        return radius;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void setRadius(){
        this.radius=radius;
    }
    public double getArea(){
        return Math.PI * Math.pow(radius,2);
    }
    public double getP(){
        return 2*Math.PI*radius;
    }
    public String toString(){
        return "Circle created: radius= "+radius+" color= "+color;
    }
}
