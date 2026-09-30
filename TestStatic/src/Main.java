class Main{
    public static void main(String[] args) {
        Student student1 = new Student("Ivan");
        Student student2 = new Student("Georgi");
        student1.showInfo();
        student2.showInfo();
        int sum = Calculator.add(5,6);
        int multi = Calculator.multiply(5,6);
        System.out.println(sum);
        System.out.println(multi);
    }
}