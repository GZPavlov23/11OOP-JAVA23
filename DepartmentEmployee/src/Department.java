public class Department {
    String name;
    String location;
    Department(String name, String location) {
        this.name = name;
        this.location = location;
    }
    void showDepartment() {
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
    }
}
