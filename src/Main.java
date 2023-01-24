import entities.*;
import enums.EKaraYakiti;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Kart istanbulKart = new Kart();
        istanbulKart.bakiyeYukle(100);
        istanbulKart.bakiyeGoster();

        List<String> otobus1Hat = new ArrayList<>();
        otobus1Hat.add("Hacıosman");
        otobus1Hat.add("İstek");
        otobus1Hat.add("Tarabya");

        Otobus otobus1 = new Otobus(15.0,150,120,"Karsan", otobus1Hat, EKaraYakiti.Gaz);
        otobus1.ode(istanbulKart);
        otobus1.sefereBasla();
        otobus1.ode(istanbulKart);
        otobus1.tasitBilgileriGoster();
        otobus1.bakimYap();

        System.out.println("=======================================================================================");

        List<String> liman1Hat = new ArrayList<>();
        liman1Hat.add("Aşiyan");
        liman1Hat.add("Üsküdar");

        DenizTaksi denizTaksi1 = new DenizTaksi(65.0,10,400,"Bıdı bıdı", liman1Hat);
        denizTaksi1.ode(istanbulKart);
        denizTaksi1.sefereBasla();
        denizTaksi1.ode(istanbulKart);
        denizTaksi1.tasitBilgileriGoster();
        denizTaksi1.bakimYap();

        System.out.println("=======================================================================================");

        liman1Hat.add("Kadıköy");
        liman1Hat.add("Beşiktaş");
        Vapur vapur1 = new Vapur(25.0,250,300,"teknecik",liman1Hat);
        vapur1.ode(istanbulKart);
        vapur1.sefereBasla();
        vapur1.ode(istanbulKart);
        istanbulKart.bakiyeYukle(1000);
        vapur1.ode(istanbulKart);
        vapur1.tasitBilgileriGoster();
        vapur1.bakimYap();

        System.out.println("=======================================================================================");

        List<String> istasyonList1 = new ArrayList<>();
        Metro metro1 = new Metro(15.0,500,80,"CRRC",istasyonList1,true,"GOA4");
        metro1.sefereBasla();
        System.out.println("=======================================================================================");

        istasyonList1.add("Hacıosman");
        istasyonList1.add("Derbent");
        istasyonList1.add("Darüşafaka");
        istasyonList1.add("Atatürk Oto Sanayi");


        metro1.setHatGuzergah(istasyonList1);
        metro1.sefereBasla();
        metro1.ode(istanbulKart);
        metro1.tasitBilgileriGoster();
        metro1.bakimYap();

        System.out.println("=======================================================================================");

        istasyonList1.add("4.Levent");
        istasyonList1.add("Levent");
        Tramvay tramvay1 = new Tramvay(25.0,300,50,"Rotem",istasyonList1,false,"GOA0");
        tramvay1.ode(istanbulKart);
        tramvay1.sefereBasla();
        tramvay1.ode(istanbulKart);
        tramvay1.tasitBilgileriGoster();
        tramvay1.bakimYap();

    }
}
