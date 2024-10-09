package TH2_1.Bai2;

public class TheBook {
    public int id;
    public String name;
    public String author;
    public int numOfpage;
    public static int numberOfBooks=0;
    public TheBook(){

    }
    public  TheBook(String name,String author){
        this.name=name;
        this.author=author;
        this.id+=numberOfBooks;
        numberOfBooks++;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public int getNumOfpage(){
        return numOfpage;
    }
    public void setNumOfpage(int numOfpage){
        this.numOfpage=numOfpage;
    }
    public String toString(){
        return  "The book created id: "+id+" name: "+name+" by "+author;
    }
}
