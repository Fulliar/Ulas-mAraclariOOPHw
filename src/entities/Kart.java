package entities;

public class Kart {

    Double bakiye = 0.0;

    public void bakiyeYukle(double yuklenenBakiye){
        if(yuklenenBakiye>=0){
            bakiye = bakiye + yuklenenBakiye;
        }else {
            System.out.println("Hatalı bir giriş yaptınız.");
        }
    }
    public void bakiyeGoster(){
        System.out.println(toString());
    }

    public Double getBakiye() {
        return bakiye;
    }

    public void setBakiye(Double bakiye) {
        this.bakiye = bakiye;
    }

    @Override
    public String toString() {
        return "Kart{" +
                "bakiye=" + bakiye +
                '}';
    }
}
