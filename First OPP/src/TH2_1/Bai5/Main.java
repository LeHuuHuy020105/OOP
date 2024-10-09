package TH2_1.Bai5;

public class Main {
    public static void main(String[] args) {
        Phanso2 ps1=new Phanso2();
        ps1.setInfo();
        Phanso2 ps2=new Phanso2();
        ps2.setInfo();
        Phanso2 ps3=ps1.Cong(ps2);
        System.out.println(ps3);
    }
}
