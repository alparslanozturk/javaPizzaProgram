import java.util.ArrayList;

public class PizzaProgram {

    // Tüm sabitler...
    public ArrayList<Pizza> siparisler = new ArrayList<>();


    public static void main(String[] args) {

        PizzaProgram test = new PizzaProgram();

        Pizza p1 = new Pizza();
        p1.malzemeEkle("SUCUK");
        p1.servis = true;


        test.pizzaGoster(p1);
        test.siparisVer(p1);

        Pizza p2 = new Pizza();
        p2.malzemeEkle("BIBER");
        test.siparisVer(p2);

        Pizza p3 = new Pizza();
        p3.malzemeEkle("MANTAR");
        p3.tip = "CITIR";
        test.siparisVer(p3);


        test.siparisListe();
        test.siparisRapor();

    }

    public void pizzaGoster(Pizza o) {
        System.out.println("tip     : " + o.tip);
        System.out.println("boy     : " + o.boy);
        System.out.println("malzeme : " + o.malzeme.toString());
        System.out.println("servis  : " + o.servis);
        System.out.println("Tutar   : " + tutarHesapla(o) + " TL");
    }

    public Double tutarHesapla(Pizza o) {
        Integer tipFiyat = 0;
        Double boyCarpan = 1.0;
        Integer malzemeFiyat = 0;
        Integer servisFiyat = 0;
        Double tutar;

        switch (o.tip) {
            case "NORMAL":
                tipFiyat = 0;
                break;
            case "CITIR":
                tipFiyat = 2;
                break;
            case "SIMIT":
                tipFiyat = 4;
                break;
            case "SUCUK":
                tipFiyat = 5;
                break;
        }

        switch (o.boy) {
            case "KUCUK":
                boyCarpan = 1.0;
                break;
            case "ORTA":
                boyCarpan = 1.5;
                break;
            case "BUYUK":
                boyCarpan = 2.0;
                break;
            case "COKBUYUK":
                boyCarpan = 3.0;
                break;
            case "AILEBOYU":
                boyCarpan = 4.0;
                break;
        }

        for (String m : o.malzeme) {
            switch (m) {
                case "BIBER":
                    malzemeFiyat += 1;
                    break;
                case "DOMATES":
                    malzemeFiyat += 1;
                    break;
                case "MANTAR":
                    malzemeFiyat += 2;
                    break;
                case "SALAM":
                    malzemeFiyat += 2;
                    break;
                case "SOSIS":
                    malzemeFiyat += 3;
                    break;
                case "SUCUK":
                    malzemeFiyat += 3;
                    break;
                case "ZEYTIN":
                    malzemeFiyat += 1;
                    break;
            }
        }

        if (o.servis) {
            servisFiyat = 5;
        } else {
            servisFiyat = 0;
        }

        tutar = tipFiyat + (malzemeFiyat * boyCarpan) + servisFiyat;
        return tutar;
    }


    public void siparisVer(Pizza o) {
        siparisler.add(o);
        tutarHesapla(o);
    }

    public void siparisListe() {
        System.out.println("---------------------siparis listesi --------------------------------------");
        for (Pizza siparis : siparisler) {
            pizzaGoster(siparis);
            System.out.println("------------------");
        }
    }

    public void siparisRapor() {

        Integer pizzaTipNormal = 0;
        Integer pizzaTipCitir = 0;
        Integer pizzaTipSimit = 0;
        Integer pizzaTipSucuk = 0;
        Integer pizzaBoyKucuk = 0;
        Integer pizzaBoyOrta = 0;
        Integer pizzaBoyBuyuk = 0;
        Integer pizzaBoyCokBuyuk = 0;
        Integer pizzaBoyAileBoyu = 0;
        Integer pizzaMalzemeBiber = 0;
        Integer pizzaMalzemeDomates = 0;
        Integer pizzaMalzemeMantar = 0;
        Integer pizzaMalzemeSalam = 0;
        Integer pizzaMalzemeSosis = 0;
        Integer pizzaMalzemeSucuk = 0;
        Integer pizzaMalzemeZeytin = 0;
        Integer pizzaServisVar = 0;
        Integer pizzaServisYok = 0;


        for (Pizza p : siparisler) {
            if (p.tip.equals("NORMAL")) {
                pizzaTipNormal++;
            }
            if (p.tip.equals("CITIR")) {
                pizzaTipCitir++;
            }
            if (p.tip.equals("SIMIT")) {
                pizzaTipSimit++;
            }
            if (p.tip.equals("SUCUK")) {
                pizzaTipSucuk++;
            }
            if (p.boy.equals("KUCUK")) {
                pizzaBoyKucuk++;
            }
            if (p.boy.equals("ORTA")) {
                pizzaBoyOrta++;
            }
            if (p.boy.equals("BUYUK")) {
                pizzaBoyBuyuk++;
            }
            if (p.boy.equals("COKBUYUK")) {
                pizzaBoyCokBuyuk++;
            }
            if (p.boy.equals("AILEBOYU")) {
                pizzaBoyAileBoyu++;
            }
            for (String m : p.malzeme) {
                if (m.equals("BIBER")) {
                    pizzaMalzemeBiber++;
                }
                if (m.equals("DOMATES")) {
                    pizzaMalzemeDomates++;
                }
                if (m.equals("MANTAR")) {
                    pizzaMalzemeMantar++;
                }
                if (m.equals("SALAM")) {
                    pizzaMalzemeSalam++;
                }
                if (m.equals("SOSIS")) {
                    pizzaMalzemeSosis++;
                }
                if (m.equals("SUCUK")) {
                    pizzaMalzemeSucuk++;
                }
                if (m.equals("ZEYTIN")) {
                    pizzaMalzemeZeytin++;
                }
            }

            if (p.servis) {
                pizzaServisVar++;
            }
            if (p.servis) {
                pizzaServisYok++;
            }
        }

        System.out.println("pizzaTipNormal			:" + pizzaTipNormal);
        System.out.println("pizzaTipCitir			:" + pizzaTipCitir);
        System.out.println("pizzaTipSimit			:" + pizzaTipSimit);
        System.out.println("pizzaTipSucuk			:" + pizzaTipSucuk);
        System.out.println("pizzaBoyKucuk			:" + pizzaBoyKucuk);
        System.out.println("pizzaBoyOrta			:" + pizzaBoyOrta);
        System.out.println("pizzaBoyBuyuk			:" + pizzaBoyBuyuk);
        System.out.println("pizzaBoyCokBuyuk		:" + pizzaBoyCokBuyuk);
        System.out.println("pizzaBoyAileBoyu		:" + pizzaBoyAileBoyu);
        System.out.println("pizzaMalzemeBiber		:" + pizzaMalzemeBiber);
        System.out.println("pizzaMalzemeDomates	    :" + pizzaMalzemeDomates);
        System.out.println("pizzaMalzemeMantar		:" + pizzaMalzemeMantar);
        System.out.println("pizzaMalzemeSalam		:" + pizzaMalzemeSalam);
        System.out.println("pizzaMalzemeSosis		:" + pizzaMalzemeSosis);
        System.out.println("pizzaMalzemeSucuk		:" + pizzaMalzemeSucuk);
        System.out.println("pizzaMalzemeZeytin		:" + pizzaMalzemeZeytin);
        System.out.println("pizzaServisVar			:" + pizzaServisVar);
        System.out.println("pizzaServisYok			:" + pizzaServisYok);
    }

}




