class Main {
    public static void main(String[] args) {
        Department department1 = new Department("IT", "Burgas");
        Employee employee1 = new Employee("Ivan", 2500, department1);
        employee1.showInfo();
    }
}
