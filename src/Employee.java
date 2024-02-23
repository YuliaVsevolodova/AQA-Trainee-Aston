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

    public void info() {
        System.out.println("ФИО: " + name);
        System.out.println("Должность: " + position);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + telephoneNumber);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
        System.out.println("-----------------");
    }

    public static void main(String[] args) {
        Employee[] employeeInfo = new Employee[5];
        employeeInfo[0] = new Employee("Иванов Иван Иванович", "Юрист", "Ivanov@gmail.com", "+37529598554", 750.50, 30);
        employeeInfo[1] = new Employee("Сидоров Григорий Григорьевич", "Повар", "Sodorovgr@gmail.com", "+37529333333", 500.25, 55);
        employeeInfo[2] = new Employee("Караулова Юлия Антоновна", "Бухгалтер", "yuliKaraulova@gmail.com", "+375336851569", 900.05, 29);
        employeeInfo[3] = new Employee("Щукин Павел Андреевич", "Слесарь", "pavel99@gmail.com", "+375255104444", 300.50, 48);
        employeeInfo[4] = new Employee("Морозова Ольга Николаевна", "Кадровик", "morozova111@gmail.com", "+375339994585", 750.80, 33);

        for (Employee list : employeeInfo) {
            list.info();
        }
    }
}