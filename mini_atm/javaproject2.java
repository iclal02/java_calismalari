import java.util.Scanner;

public class javaproject2{

    
        public static void main(String[] args){
        
        Scanner input=new Scanner(System.in);
        
  
        System.out.println("T.C. giriniz: ");
        String girisTc=input.nextLine();

        System.out.println("şifre giriniz:");
        String girisSifre=input.nextLine();

        System.out.println("dogum günü girin: ");
        String girisDg=input.nextLine();


        while(Kullanici.dogruMu(girisTc,girisSifre)){


        System.out.println("Yapmak istediğiniz işlemi belirtin: \n");
        System.out.println("---------------------------------------");
        System.out.println("1-PARA TRANSFERİ\n2-ÖDEMELER\n3-PARA YATIRMA\n4-PARA ÇEKME\n5-ŞİFRE DEĞİŞTİRME\n");
        int secim=input.nextInt();

        switch (secim) {
            case 1:
                System.out.println("transfer edilecek miktarı yazın:");     
                int miktar=input.nextInt();
                paratransferi.paratransferet(miktar);
                System.out.println("işleminiz gerçekleşmiştir kalan tutar: " +Kullanici.bakiye());
                break;
            
            case 2:
                System.out.println("ödeme yapılacak yeri seçin\n1-kredi\n2-kart ekstresi:");
                int sec=input.nextInt();
                if(sec==1) {
                    System.out.println("kaç tl ödenecek: ");
                    int tutar=input.nextInt();
                    odemeler.kredi(tutar);
                }
                else if(sec==2){
                    System.out.println("kaç tl ödenecek: ");
                    int tutar=input.nextInt();
                    odemeler.kartekstre(tutar);
                }
                System.out.println("işleminiz gerçekleşmiştir kalan tutar: " +Kullanici.bakiye());
                break;
        
            case 3:
                System.out.println("yatırmak istediğiniz tutarı girin: ");
                int yatırılacak=input.nextInt();
                parayatırma.yatır(yatırılacak);
                System.out.println("işleminiz gerçekleşmiştir kalan tutar: " +Kullanici.bakiye());
                break;

            case 4:
                System.out.println("cekmek istediğiniz tutarı girin: ");
                int cekilecek=input.nextInt();
                paracekme.cekme(cekilecek);
                System.out.println("işleminiz gerçekleşmiştir kalan tutar: " +Kullanici.bakiye());
                break;

            case 5: 
                sifredegistirme.degistir();
                break;


            default:
                System.out.println("yanlış seçim yaptınız.");
                break;
        }
        System.out.println("İYİ GÜNLER :) ");
        break;
        
    }

    }
}

