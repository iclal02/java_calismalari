import java.util.Scanner;
import java.util.Set;

public class sifredegistirme extends Kullanici{
    
    public sifredegistirme(String TcNo,String Sifre,String DogumGunu){
        super(TcNo, Sifre, DogumGunu);
    }

    public static void degistir(){
        Scanner input=new Scanner(System.in);

        System.out.println("istedigininz sifreyi girin:");
        String yeniSifre=input.nextLine();

        if(yeniSifre.equals(getSifre())){
            System.out.println("sifre bir öncekiyle aynı olamaz:(");
        }
        else if (yeniSifre.contains(getDogumGunu())){
            System.out.println("sifre dogum tarihini içeremez.");
        }
        else { 
            System.out.println("sifre basarılı sekilde degistirilmistir");
            setSifre(yeniSifre);
        }
    }
}