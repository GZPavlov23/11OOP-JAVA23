public class Person {
    String name;
    int age;
    Adress adress;
    Person(String name, int age, Adress adress) {
        this.name = name;
        this.age = age;
        this.adress = adress;
    }
    void showInfo()
    {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        adress.showAdress();
    }
}
