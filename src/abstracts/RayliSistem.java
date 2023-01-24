package abstracts;


import java.util.List;

public abstract class RayliSistem extends UlasimArac  {

    private Boolean kuplajliMi;
    private String goaSeviyesi;
    private Integer maksimumKullanilanGuc;

    public RayliSistem(Double ucret, Integer kapasite, Integer maksimumHiz, String marka, List<String> hatGuzergah, Boolean kuplajliMi, String goaSeviyesi) {
        super(ucret, kapasite, maksimumHiz, marka, hatGuzergah);
        this.ulasimTipi = "Raylı Sistemler";
        this.kuplajliMi = kuplajliMi;
        this.goaSeviyesi = goaSeviyesi;
    }

    public Boolean getKuplajliMi() {
        return kuplajliMi;
    }

    public void setKuplajliMi(Boolean kuplajliMi) {
        this.kuplajliMi = kuplajliMi;
    }

    public String getGoaSeviyesi() {
        return goaSeviyesi;
    }

    public void setGoaSeviyesi(String goaSeviyesi) {
        this.goaSeviyesi = goaSeviyesi;
    }

    public Integer getMaksimumKullanilanGuc() {
        return maksimumKullanilanGuc;
    }

    public void setMaksimumKullanilanGuc(Integer maksimumKullanilanGuc) {
        this.maksimumKullanilanGuc = maksimumKullanilanGuc;
    }

    @Override
    public String toString() {
        return "RayliSistem{" +
                "kuplajliMi=" + kuplajliMi +
                ", goaSeviyesi='" + goaSeviyesi + '\'' +
                ", maksimumKullanilanGuc=" + maksimumKullanilanGuc +
                "} " + super.toString();
    }
}
