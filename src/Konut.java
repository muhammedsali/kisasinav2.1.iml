public abstract class Konut {
    String address;

    Konut(String address) {//UMLde yazdigi gibi Konutun string olan constructerını verdik
        this.address = address;
    }


    void displayInfo() {//Displayinfoyla adresi yazdırdık ve bunu Polymorphism mantıgıyla kullanıcaz
        System.out.println("Adres: " + address);
    }
}