package Chuong2_3__2_4.Bai6NC;

import java.util.Arrays;
import java.util.Scanner;

public class TheBook {
    public String name;
    public double price;
    public int qtylnStock;
    public TheAuthor[] authors;
    public int numOfAuthors;

    public TheBook() {
        authors=new TheAuthor[0];
    }

    public TheBook(String name) {
        this.name = name;
    }

    public TheBook(String name, TheAuthor[] authors) {
        this.name = name;
        this.authors = authors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQtylnStock() {
        return qtylnStock;
    }

    public void setQtylnStock(int qtylnStock) {
        this.qtylnStock = qtylnStock;
    }

    public TheAuthor[] getAuthors() {
        return authors;
    }

    public void setAuthors(TheAuthor[] authors) {
        this.authors = authors;
    }

    public int getNumOfAuthors() {
        return numOfAuthors;
    }

    public void setNumOfAuthors(int numOfAuthors) {
        this.numOfAuthors = numOfAuthors;
    }
    public void addAuthor(int numOfAuthors){
        this.authors=Arrays.copyOf(this.authors,numOfAuthors);
        for (int i=0;i<numOfAuthors;i++){
            TheAuthor a=new TheAuthor();
            a.setInfo();
            authors[i]=a;
        }
    }
    public void setInfo(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ten cuon sach: ");
        setName(sc.nextLine());
        System.out.println("Nhap gia cuon sach: ");
        setPrice(Double.parseDouble(sc.nextLine()));
        System.out.println("Nhap so luong cuon sach: " );
        setQtylnStock(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhap so luong tac gia: ");
        int num=Integer.parseInt(sc.nextLine());
        setNumOfAuthors(num);
        addAuthor(num);
    }
    @Override
    public String toString() {
        return "TheBook [" +
                name + " ; " +
                "price=" + price +
                " ; qtylnStock=" + qtylnStock +
                "; authors=" + Arrays.toString(authors) +
                "; numOfAuthors=" + numOfAuthors +
                ']';
    }

}
