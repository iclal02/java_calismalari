public class parayatırma extends Kullanici{

    private int tutar;

    parayatırma(String TcNo,String Sifre,String DogumGunu,int Tutar){
        super(TcNo, Sifre, DogumGunu);
        this.tutar=Tutar;
    }
    public static void yatır(int Tutar){
        bakiye+=Tutar;
    }
}