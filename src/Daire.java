public class Daire extends Konut {//Daire, Konut soyut class'ını kalıtır ve adres özelligine sahip olur
    private int apartmentNumber; //daire numarası
    int daireSırası;

    //UMLde yazdigi gibi Daire constructer'ı str int int degerleri alır ve üst sınıfın yapıcı metodunu çağırır.
    Daire(String address, int daireNumarasi, int daireSırası) {
        super(address); // üst sınıfın constructerını kullanır
        this.apartmentNumber = daireNumarasi;
        this.daireSırası = daireSırası;
    }

    @Override
    void displayInfo() {//displayinfoyla bu classda tanımladığımız verileri ekrana yazdırıyoruz
        super.displayInfo(); // üst sınıfın metodunu çağırır
        System.out.println("Daire numarası: " + apartmentNumber);
    }


    int compareTo(Daire daire) {//daireleri daire numarasına göre sıralamak için compareTo kullandık UML'e göre int deger dondurdugunden -1 0 1 degerleriyle karsılastırdık
        //daha sonra bu değeri alanlara göre bir sıralama yapabilirdik ama biz yapmadık
        if (this.apartmentNumber < daire.apartmentNumber) {
            return -1;
        } else if (this.apartmentNumber == daire.apartmentNumber) {
            return 0;
        } else {
            return 1;
        }
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }
}