import java.util.ArrayList;
import java.util.List;

public class evSahibi {
    String isim;
    String soyisim;
    Bina bina;

    Daire daire;
    ArrayList<Daire> daireler;

    //UMLde yazdigi gibi evsahibi isim soyisim ve bina degerlerini alır ve bir arraylist başlatır
    public evSahibi(String isim, String soyisim, Bina Bina) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.bina = Bina; // 1-1 iliskisi oldugundan bir Evsahibi için bir bina tanımlar
        daireler = new ArrayList<Daire>();
    }


    public void displayInfo() {////displayinfoyla bu classda tanımladığımız verileri ve Ev sahibinin Binasının bilgilerini ekrana yazdırıyoruz
        System.out.print("Ev sahibi ismi: " + isim + "\nEv sahibi soyismi: " + soyisim + "\nBinasının adresi: " + bina.address + "\nBinasının kat sayısı: " + bina.numberOfFloors);
    }

    public void addApartment(Daire daire) {//Daire objecti alır ve daireler listesine ekler cünkü bir binada birden fazla daire olabilir
        daireler.add(daire);
    }


}