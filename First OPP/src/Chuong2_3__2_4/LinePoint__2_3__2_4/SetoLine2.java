package Chuong2_3__2_4.LinePoint__2_3__2_4;

import java.util.ArrayList;
import java.util.Collections;

public class SetoLine2 {
    public ArrayList <Line> arrayList;

    public ArrayList getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList arrayList) {
        this.arrayList = arrayList;
    }

    public SetoLine2() {
        arrayList=new ArrayList();
    }
    public void nhapMotDuongThang(Line a){
        arrayList.add(a);
    }
    public void nhapNDuongThang(int n){
        for(int i=0;i<n;i++){
            Line a=new Line();
            a.setInfo();
            arrayList.add(a);
        }
    }
    public static void hoanVi(ArrayList <Line> arrayList,int i,int j){
        Line tmp=arrayList.get(i);
        arrayList.set(i,arrayList.get(j));
        arrayList.set(j,tmp);
    }
    public void sapXeptangdan(){
        for(int i=0;i<arrayList.size()-1;i++){
            for (int j=1;j<arrayList.size();j++){
                if(arrayList.get(i).length()>arrayList.get(j).length()){
                    hoanVi(arrayList,i,j);
                }
            }
        }
    }
    public void xoaPTArray(int vitri){
        arrayList.remove(vitri-1);
    }
    private boolean soSanh(MyPoint2D a, MyPoint2D b){
        if (a.x==b.x && a.y==b.y){
            return true;
        }
        return false;
    }
    public void xoaPTArray(Line a){
        for (int i=0;i<arrayList.size();i++){
            if(soSanh(arrayList.get(i).getpBegin(),a.getpBegin()) && soSanh(arrayList.get(i).getpEnd(),a.getpEnd())){
                arrayList.remove(i);
            }
        }
    }
    public void timDaiNhat(){
        double max=arrayList.get(0).length();
        for (int i=1;i<arrayList.size();i++){
            if(arrayList.get(i).length()>max){
                max=arrayList.get(i);
            }
        }
    }
    public void timNganNhat(){

    }
    public void xoatheoTen(){

    }
    public void themvaoVT(){

    }
    @Override
    public String toString() {
        return "arrayList= "+ arrayList;
    }

    public static void main(String[] args) {
        SetoLine2 s=new SetoLine2();
        s.nhapNDuongThang(3);
        s.sapXeptangdan();
        System.out.println(s.toString());
    }
}
