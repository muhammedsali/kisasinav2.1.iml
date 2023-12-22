import java.util.ArrayList;
import java.util.List;

public class Bina extends Konut {//Bina, Konut soyut class'ını kalıtır ve adres özelligine sahip olur

    Bina(String address, int katSayisi) {//Yine UML'de verilenlere göre constructer olusturduk
        super(address);
        this.numberOfFloors = katSayisi;
    }

    int numberOfFloors;


    // displayinfo super ile üst sınıfın metodunu çağırır ve bu classda tanımladığımız verileri ekrana yazdırır
    @Override
    void displayInfo() {
        super.displayInfo(); // üst sınıfın metodunu çağırır
        System.out.println("Kat sayısı: " + numberOfFloors);
    }


}