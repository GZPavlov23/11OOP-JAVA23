class Main{
    public static void main(String[] args) {
        Adress adress = new Adress("Burgas","Aleksandrovska",10);
       Person person1 = new Person("Maria", 20, adress);
        person1.showInfo();
    }
}