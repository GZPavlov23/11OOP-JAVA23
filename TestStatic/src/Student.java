public class Student {
    String name;
    static String school = "IB school";
    Student(String name){
        this.name = name;
    }
    void showInfo()
    {
        System.out.println("Name: " + name);
        System.out.println("School: " + Student.school);
    }

    }
