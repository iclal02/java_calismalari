public class Kullanici{

    private static String tcNo="14712345689";
    private static  String sifre="123456";
    private static  String dogumGunu="26.07.2002";
    protected static  int bakiye=10000;

    public Kullanici(String TcNo,String Sifre,String DogumGunu){
        this.tcNo=TcNo;
        this.sifre=Sifre;
        this.dogumGunu=DogumGunu;
    }

    public static boolean dogruMu(String TcNo,String Sifre){

        return (tcNo.equals(TcNo)&& sifre.equals(Sifre));

    }
    public static int bakiye(){
        return bakiye;
    }



    public String getTcNo(){
        return tcNo;
    }
    public void setTcNo(String Yeni){
        tcNo=Yeni;
    }

    public static String getSifre(){
        return sifre;
    }
    public static  void setSifre(String Yeni){
        sifre=Yeni;
        
    }
    public static String getDogumGunu(){
        return dogumGunu;
    }
    public void setDogumGunu(String Yeni){
        dogumGunu=Yeni;
    }
}