public class Car {
    String brand;
    String model;
    Engine engine;

    Car(String brand, String model, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
    }
    void showCarInfo() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
        this.engine.showEngineInfo();
    }
}
