public class Adress {
    String city;
    String street;
    int number;
    Adress(String city, String street, int number) {
        this.city = city;
        this.street = street;
        this.number = number;
    }
    void showAdress() {
        System.out.println("City: " + this.city);
        System.out.println("Street: " + this.street);
        System.out.println("Number: " + this.number);
    }
}
