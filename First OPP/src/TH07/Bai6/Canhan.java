package TH07.Bai6;

public class Canhan {
    public String dinhdanh;
    public String ho;
    public String tenlot;
    public String tenchinh;
    public String diachi;
    public int ngaysinh;
    public  Canhan(){

    }
    public Canhan(String dinhdanh, String ho,String tenlot,String tenchinh,String diachi,int ngaysinh){
        this.dinhdanh=dinhdanh;
        this.tenchinh=tenchinh;
        this.tenlot=tenlot;
        this.diachi=diachi;
        this.ngaysinh=ngaysinh;
    }

    public String getDinhdanh() {
        return dinhdanh;
    }

    public void setDinhdanh(String dinhdanh) {
        this.dinhdanh = dinhdanh;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTenlot() {
        return tenlot;
    }

    public void setTenlot(String tenlot) {
        this.tenlot = tenlot;
    }

    public String getTenchinh() {
        return tenchinh;
    }

    public void setTenchinh(String tenchinh) {
        this.tenchinh = tenchinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public int getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(int ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getho(){
        return ho;
    }
    public String getten(){
        return tenchinh;
    }
    public String boKTdaucuoi(String s){
        return s.trim();
    }
    public void tachHoTen(String name){
        name=boKTdaucuoi(name);
        String[] arr= name.split(" ");
        setHo(arr[0]);
        setTenchinh(arr[arr.length-1]);
    }
    private String noiTen(String[] arr) {
        String kq = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != "") {
                kq += arr[i] + " ";
            }
        }
        kq=boKTdaucuoi(kq);
        return kq;
    }
    public String chuanHoahoten(String name){
        name=boKTdaucuoi(name);
        String[] arr=name.split(" ");
        String kq="";
        for(int i=0;i< arr.length;i++) {
            if (arr[i]!=""){
                arr[i] = (arr[i].substring(0, 1)).toUpperCase() + arr[i].substring(1);
                kq+=arr[i]+" ";
            }
            continue;
        }
        kq=boKTdaucuoi(kq);
        return kq;
    }
    public void taoTentat(String name){
        name=chuanHoahoten(name);
        String[] arr=name.split(" ");
        int soluongkt=0;
        for(int i=0;i< arr.length;i++){
            soluongkt+=arr[i].length();
        }
        System.out.println(soluongkt);
        if(soluongkt>18){
            arr[arr.length-2]=arr[arr.length-2].substring(0,1);
        }
        System.out.println(noiTen(arr));

    }
    @Override
    public String toString() {
        return "Canhan{" +
                "dinhdanh='" + dinhdanh + '\'' +
                ", ho='" + ho + '\'' +
                ", tenlot='" + tenlot + '\'' +
                ", tenchinh='" + tenchinh + '\'' +
                ", diachi='" + diachi + '\'' +
                ", ngaysinh=" + ngaysinh +
                '}';
    }
}
