public class odemeler extends Kullanici{

private int tutar;


odemeler(String TcNo,String Sifre,String DogumGunu,int Tutar){
super(TcNo, Sifre,DogumGunu);
this.tutar=Tutar;
}

public static void kredi(int Tutar){
    bakiye-=Tutar;

}
public static void kartekstre(int Tutar){
    bakiye-=Tutar;
}
}