class Main{
    public static void main(String[] args) {
        Student student = new Student();
        student.setAge(30);
        student.setName("ivancho");
        System.out.println("ime " + student.getName());
        System.out.println("Godini " + student.getAge());
    }
}
