package abstracts;

import enums.EKaraYakiti;

import java.util.List;

public abstract class KaraUlasimi extends UlasimArac {

    EKaraYakiti yakitTipi;

    public KaraUlasimi(Double ucret, Integer kapasite, Integer maksimumHiz, String marka, List<String> hatGuzergah, EKaraYakiti yakitTipi) {
        super(ucret, kapasite, maksimumHiz, marka, hatGuzergah);
        this.ulasimTipi = "Kara Ulaşımı";
        this.yakitTipi = yakitTipi;
    }

    public EKaraYakiti getYakitTipi() {
        return yakitTipi;
    }

    public void setYakitTipi(EKaraYakiti yakitTipi) {
        this.yakitTipi = yakitTipi;
    }

    @Override
    public String toString() {
        return "KaraUlasimi{" +
                "yakitTipi=" + yakitTipi +
                "} " + super.toString();
    }
}
