package tr.com.ozturk;

import java.util.ArrayList;

public class Pizza {

    public String tip;
    public String boy;
    public ArrayList<String> malzeme = new ArrayList<>();
    public Boolean servis;
    public Double tutar;

    public Pizza() {
        tip = "NORMAL";
        boy = "KUCUK";
        // malzeme.add("BIBER");
        servis = false;
    }

    public void malzemeEkle(String m) {
        malzeme.add(m);
    }

}
