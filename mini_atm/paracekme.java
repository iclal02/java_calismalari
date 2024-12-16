public class paracekme extends Kullanici{

    private int tutar;

     paracekme(String TcNo,String Sifre,String DogumGunu,int Tutar){
        super(TcNo, Sifre, DogumGunu);
        this.tutar=Tutar;
    }

    public static void cekme(int Tutar){
        bakiye-=Tutar;
    }
}