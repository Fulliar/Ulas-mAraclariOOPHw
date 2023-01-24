package entities;

import abstracts.DenizUlasimi;

import java.util.List;

public class DenizTaksi extends DenizUlasimi {

    Boolean status = false;

    public DenizTaksi(Double ucret, Integer kapasite, Integer maksimumHiz, String marka, List<String> hatGuzergah) {
        super(ucret, kapasite, maksimumHiz, marka, hatGuzergah);
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
    public void tasitBilgileriGoster() {
        System.out.println("Araç Kapasitesi : " + getKapasite() +
                            ", Araç markası : " + getMarka() +
                            ", Araç Maksimum Hızı : " + getMaksimumHiz() +
                            " ,Ulaşım Tipi : " + getUlasimTipi() +
                            " ,YakitTipi : " + getYakitTipi());
    }

    @Override
    public void sefereBasla() {
        if(!getHatGuzergah().isEmpty()) {
            System.out.println("Deniz Taksi seferine başlanmıştır.");
            System.out.println("Ziyaret edilecek, iskeleler : \n" + getHatGuzergah());
            status = true;
        }else {
            System.out.println("Hatta güzergah tanımlayınız.");
        }
    }

    @Override
    public String toString() {
        return "DenizTaksi{} " + super.toString();
    }
}
