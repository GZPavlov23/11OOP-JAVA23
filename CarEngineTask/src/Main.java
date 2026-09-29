public class Main {
    public static void main(String[] args) {
        Engine engine1 = new Engine("Petrol", 150);
        Car car1 = new Car("Toyota", "Corolla", engine1);
        car1.showCarInfo();
    }
}