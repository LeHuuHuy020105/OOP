package Chuong2_3__2_4.Bai6NC;

import java.util.Scanner;

public class TheAuthor {
    public String name;
    public String email;
    public char gender;

    public TheAuthor() {
    }

    public TheAuthor(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
    public void setInfo(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ten tac gia: ");
        setName(sc.nextLine());
        System.out.println("Nhap email tac gia: ");
        setEmail(sc.nextLine());
        System.out.println("Nhap gioi tinh tac gia: ");
        setGender(sc.nextLine().charAt(0));
    }
    @Override
    public String toString() {
        return "[ " +
                name + " ] " +
                email + ';' +
                " gender=" + gender +
                " ]";
    }
}
