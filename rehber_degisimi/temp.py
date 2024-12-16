# -*- coding: utf-8 -*-

import os
import pandas as pd

# Dosyanın var olup olmadığını kontrol et
dosya_yolu = "C:\\Users\\user\\OneDrive\\Masaüstü\\TELEFON.csv"

if os.path.exists(dosya_yolu):
    rehber_giris = pd.read_csv(dosya_yolu)
else:
    rehber_giris = pd.DataFrame(columns=["ISIMLER", "SOYISIMLER", "NUMARALAR"])



def rehber_ekle():
    global rehber_giris
    kisi_isim=input("kisi ismi girin: ").capitalize()
    kisi_soyisim=input("kisi soyismi girin: ").capitalize()
    numara=input("numara girin: ")
    
       
    
    yeni={"ISIMLER":[kisi_isim],
          "SOYISIMLER":[kisi_soyisim],
          "NUMARALAR":[numara]} # aldıgımız veriyi dic olarak yazdırdık
    
    yeni_data=pd.DataFrame.from_dict(yeni,orient="columns")# bu dic dataframe yaptık ekleyebilmek için
    rehber_giris=pd.concat([rehber_giris,yeni_data],ignore_index=True) # ekledik ignore_index yeni index olusumunu saglar
    rehber_giris.to_csv(dosya_yolu,index=False)# kaydetme
    print(rehber_giris)
    
    
def rehber_sil():
    global rehber_giris
    print(rehber_giris)
    silinen=input("silinecek kisinin bilgisini girin ").capitalize()
    sonuclar = rehber_giris[
       rehber_giris['ISIMLER'].str.contains(silinen) |
       rehber_giris['SOYISIMLER'].str.contains(silinen) |
       rehber_giris['NUMARALAR'].astype(str).str.contains(silinen)
   ]
    if not sonuclar.empty:
        print(sonuclar)
        if len(sonuclar.index) > 0:
            sil2 = input("Hangisini silmek istiyorsun: ").capitalize()
            son_liste = sonuclar[
                sonuclar['ISIMLER'].str.contains(sil2)|
                sonuclar['SOYISIMLER'].str.contains(sil2)|
                sonuclar['NUMARALAR'].astype(str).str.contains(sil2)
            ]
            if not son_liste.empty:
                if len(son_liste) > 1:
                    print("Birden fazla kişi bulundu. Lütfen daha spesifik bir isim girin.")
                else:
                    confirm = input("Bu kişiyi silmek istediğinize emin misiniz? (E/H): ")
                    if confirm.upper() == 'E':
                        silinen_index = son_liste.index[0]  # Seçilen kişinin indeksi
                        silinen_liste = rehber_giris.drop(silinen_index)
                        silinen_liste.to_csv(dosya_yolu, index=False)
                        print("Kişi başarıyla silindi.")
                        print(silinen_liste)
                    else:
                        print("İşlem iptal edildi.")
            else:
                print("Belirtilen kişi bulunamadı.")

        
def rehber_degisim():
    global rehber_giris
    print(rehber_giris)
    degisim = input("Değişim yapılacak kişiyi seçin: ").capitalize()
    sonuclar = rehber_giris[
        rehber_giris['ISIMLER'].str.contains(degisim) |
        rehber_giris['SOYISIMLER'].str.contains(degisim) |
        rehber_giris['NUMARALAR'].astype(str).str.contains(degisim)
    ]
    if not sonuclar.empty:
        
                print(sonuclar)
                son_liste = sonuclar
                
                if len(sonuclar.index) > 1:
                    print("Birden fazla kişi bulundu. Lütfen daha spesifik bir isim girin.")
                    degis2 = input("Hangisini değiştirmek istiyorsun: ").capitalize()
                    son_liste = sonuclar[
                    sonuclar['ISIMLER'].str.contains(degis2) |
                    sonuclar['SOYISIMLER'].str.contains(degis2) |
                    sonuclar['NUMARALAR'].astype(str).str.contains(degis2)
                    ]
                else:
                    confirm = input("Bu kişiyi değiştirmek istediğinize emin misiniz? (E/H): ")
                    if confirm.upper() == 'E':
                        secim = int(input("Neyi değiştirmek istiyorsunuz? (1-ISIMLER 2-SOYISIMLER 3-NUMARALAR): "))
                        if secim == 1:
                            yeni_isim = input("Yeni ismi girin: ").capitalize()
                            rehber_giris.loc[son_liste.index[0], 'ISIMLER'] = yeni_isim
                        elif secim == 2:
                            yeni_soyisim = input("Yeni soyismi girin: ").capitalize()
                            rehber_giris.loc[son_liste.index[0], 'SOYISIMLER'] = yeni_soyisim
                        elif secim == 3:
                            yeni_numara = input("Yeni numarayı girin: ")
                            rehber_giris.loc[son_liste.index[0], 'NUMARALAR'] = yeni_numara
                        rehber_giris.to_csv(dosya_yolu, index=False)
                        print("Kişi başarıyla değiştirildi.")
                        print(rehber_giris)
                    
         



    
def rehber_ara():
    
    global rehber_giris
    print(rehber_giris)
    ara=input("kişinin ismini seçin").capitalize()
    print(ara+" adlı kişi aranıyor...")
    
    
devam_Et=True
    
while devam_Et:      
           
    print("1)EKLEME\n"+"2)SİLME\n" +"3)DEĞİŞTİRME\n"+"4)ARAMA\n")
            
    kullanıcı_giris=int(input(print("Hangi islemi yapmak istediğinizi belirtin:\n")))
            
                
    if kullanıcı_giris==1:
                    rehber_ekle()
                    pass
    elif kullanıcı_giris==2:
                    rehber_sil()
                    pass
    elif kullanıcı_giris==3:
                rehber_degisim()
                    
    elif kullanıcı_giris==4:
                    rehber_ara()
                    pass
    else:
                 print("YANLIŞ GİRİŞ YAPTINIZ")
                 
    devam_Et_str= input("devam etmek istiyorsanız 'TRUE' yazın istemiyorsanız 'FALSE' yazın\n").capitalize()
    if devam_Et_str == 'true':
        devam_Et="False"
     
        
print("çıkış yapıldı")
    
     
