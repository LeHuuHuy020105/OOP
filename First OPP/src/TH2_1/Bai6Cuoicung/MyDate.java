package TH2_1.Bai6cuoicung;

public class MyDate {
    private int day;
    private int month;
    private int year;
    private static String[] arrDay = new String[]{"Sunday","Monday","Tuesday","Wednesday", "Thursday","Friday","Saturday"};
    private static String[] arrMonth = new String[]{"Jan","Feb","Mar","Apr", "May","Jun", "Jul","Aug","Sep","Oct","Nov","Dec"};
    private static int[] arrDaysOfMonth = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
    public MyDate(){

    }
    public MyDate(int day,int month,int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }
    public boolean xetnamNhuan(int year){
        if((year%4==0 && year%100!=0) || (year%400==0)){
            return true;
        }
        return false;
    }
    public void truocMotngay(){
        if(month==2 && xetnamNhuan(year)==true){
            arrDaysOfMonth[month-1]=29;
        }
        if(day==1){
            if(month==1){
                year=year-1;
                month=12;
                day=arrDaysOfMonth[month-1];
            }
            else{
                month--;
                day=arrDaysOfMonth[month-1];
            }
        }
        else{
            day--;
        }
    }
    public void sau1Ngay(){
        if(month==2 && xetnamNhuan(year)==true){
            arrDaysOfMonth[month-1]=29;
        }
        if(day==arrDaysOfMonth[month-1]){
            day=1;
            month++;
            if(month>12){
                month=12;
                year++;
            }
        }
        else {
            day++;
        }
    }
    public void soNgaytrongthang(){
        if(month==2 && xetnamNhuan(year)==true){
            arrDaysOfMonth[month-1]=29;
        }
        System.out.println("Số ngày trong tháng: "+arrDaysOfMonth[month-1]);
    }
    public void ToString(){
        System.out.println(day+" "+month+" "+year);
    }
}
