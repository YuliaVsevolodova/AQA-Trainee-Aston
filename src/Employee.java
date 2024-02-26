public class Employee {
    private String name;
    private String position;
    private String email;
    private String telephoneNumber;
    private double salary;
    private int age;

    public Employee(String name, String position, String email, String telephoneNumber, double salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.telephoneNumber = telephoneNumber;
        this.salary = salary;
        this.age = age;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "ФИО='" + name + '\'' +
                ", Должность='" + position + '\'' +
                ", email='" + email + '\'' +
                ", Телефон='" + telephoneNumber + '\'' +
                ", Зарплата=" + salary +
                ", Возраст=" + age +
                '}';
    }
}