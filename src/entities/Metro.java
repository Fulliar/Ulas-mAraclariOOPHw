package entities;

import abstracts.RayliSistem;

import java.util.List;

public class Metro extends RayliSistem {
    Boolean status = false;
    public Metro(Double ucret, Integer kapasite, Integer maksimumHiz, String marka, List<String> hatGuzergah, Boolean kuplajliMi, String goaSeviyesi) {
        super(ucret, kapasite, maksimumHiz, marka, hatGuzergah, kuplajliMi, goaSeviyesi);
        this.setMaksimumKullanilanGuc(1500);
    }

    @Override
    public void ode(Kart kart) {
        if(kart.getBakiye()>=getUcret()){
            if(status == true){
                kart.setBakiye(kart.bakiye-getUcret());
                System.out.println("Metro İstanbul İyi Yolculuklar Diler, yolculuğunuz belirtilen güzergah üzerinden devam edecektir.");
                for(String i: getHatGuzergah()){
                    System.out.print(i + ", ");
                }
                kart.bakiyeGoster();
            }else{
                System.out.println("İlgili araç serviste değildir.");
            }
        }else{
            System.out.println("Yetersiz bakiye");
        }
    }

    @Override
    public void sefereBasla() {
        if (!getHatGuzergah().isEmpty()) {
            System.out.println("Metro seferine başlanmıştır.");
            System.out.println("Ziyaret edilecek, istasyonlar : \n" + getHatGuzergah());
            status = true;
        }else {
            System.out.println("Hatta güzergah tanımlayınız.");
        }
    }

    @Override
    public void tasitBilgileriGoster() {
        System.out.println("Araç Kapasitesi : " + getKapasite() +
                ", Araç markası : " + getMarka() +
                ", Araç Maksimum Hızı : " + getMaksimumHiz() +
                " ,Ulaşım Tipi : " + getUlasimTipi() +
                " ,GOA Seviyesi : " + getGoaSeviyesi() +
                " ,Maksimum Kullanılan Güç " + getMaksimumKullanilanGuc() + "V" +
                " , Kuplaj durumu" + getKuplajliMi());
    }

    @Override
    public String toString() {
        return "Metro{} " + super.toString();
    }
}
