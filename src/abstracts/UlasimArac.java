package abstracts;

import entities.Kart;
import interfaces.IBakimYap;
import interfaces.ISefereBasla;
import interfaces.ITasitBilgileriGoster;

import java.util.ArrayList;
import java.util.List;

public abstract class UlasimArac implements IBakimYap, ISefereBasla, ITasitBilgileriGoster {

    String ulasimTipi;
    Double ucret;
    Integer kapasite;
    Integer maksimumHiz;
    String marka;
    List<String> hatGuzergah;


    public UlasimArac( Double ucret, Integer kapasite, Integer maksimumHiz, String marka, List<String> hatGuzergah) {
        this.ucret = ucret;
        this.kapasite = kapasite;
        this.maksimumHiz = maksimumHiz;
        this.marka = marka;
        this.hatGuzergah = hatGuzergah;
    }

    public abstract void ode(Kart kart);

    public void bakimYap(){
        System.out.println("Araca bakım yapıldı.");
    }

    public String getUlasimTipi() {
        return ulasimTipi;
    }

    public void setUlasimTipi(String ulasimTipi) {
        this.ulasimTipi = ulasimTipi;
    }

    public Double getUcret() {
        return ucret;
    }

    public void setUcret(Double ucret) {
        this.ucret = ucret;
    }

    public Integer getKapasite() {
        return kapasite;
    }

    public void setKapasite(Integer kapasite) {
        this.kapasite = kapasite;
    }

    public Integer getMaksimumHiz() {
        return maksimumHiz;
    }

    public void setMaksimumHiz(Integer maksimumHiz) {
        this.maksimumHiz = maksimumHiz;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public List<String> getHatGuzergah() {
        return hatGuzergah;
    }

    public void setHatGuzergah(List<String> hatGuzergah) {
        this.hatGuzergah = hatGuzergah;
    }

    @Override
    public String toString() {
        return "UlasimArac{" +
                "ulasimTipi='" + ulasimTipi + '\'' +
                ", ucret=" + ucret +
                ", kapasite=" + kapasite +
                ", maksimumHiz=" + maksimumHiz +
                ", marka='" + marka + '\'' +
                ", hatGuzergah=" + hatGuzergah +
                '}';
    }
}
