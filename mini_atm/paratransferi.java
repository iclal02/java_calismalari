
public class paratransferi extends Kullanici{

 paratransferi(String TcNo,String Sifre,String DogumGunu){
    super(TcNo, Sifre, DogumGunu);

}
public static Integer paratransferet(int miktar){
    bakiye-=miktar;
    return bakiye;
}
}