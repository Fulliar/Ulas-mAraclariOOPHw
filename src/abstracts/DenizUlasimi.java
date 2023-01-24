package abstracts;

import java.util.List;

public abstract class DenizUlasimi extends UlasimArac {
    String yakitTipi;

    public DenizUlasimi(Double ucret, Integer kapasite, Integer maksimumHiz, String marka, List<String> hatGuzergah) {
        super(ucret, kapasite, maksimumHiz, marka, hatGuzergah);
        this.ulasimTipi = "Deniz Ulaşımı";
        this.yakitTipi = "Deniz aracı yakıtı";
    }

    public String getYakitTipi() {
        return yakitTipi;
    }

    public void setYakitTipi(String yakitTipi) {
        this.yakitTipi = yakitTipi;
    }

    @Override
    public String toString() {
        return "DenizUlasimi{" +
                "yakitTipi='" + yakitTipi + '\'' +
                "} " + super.toString();
    }
}
