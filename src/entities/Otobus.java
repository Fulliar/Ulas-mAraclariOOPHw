package entities;

import abstracts.KaraUlasimi;
import enums.EKaraYakiti;

import java.util.List;

public class Otobus extends KaraUlasimi {
    Boolean status = false;
    public Otobus(Double ucret, Integer kapasite, Integer maksimumHiz, String marka, List<String> hatGuzergah, EKaraYakiti yakitTipi) {
        super(ucret, kapasite, maksimumHiz, marka, hatGuzergah, yakitTipi);
    }

    @Override
    public void ode(Kart kart) {
        if(kart.getBakiye()>=getUcret()){
            if(status == true){
                kart.setBakiye(kart.bakiye-getUcret());
                System.out.println("İyi yolculuklar");
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
            System.out.println("Otobüs seferine başlanmıştır.");
            System.out.println("Ziyaret edilecek, duraklar : \n" + getHatGuzergah());
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
                " ,YakitTipi : " + getYakitTipi());
    }



    @Override
    public String toString() {
        return "Otobus{} " + super.toString();
    }
}
