public class Runner {
    public static void main(String[] args) {
        Employee[] employeeInfo = new Employee[5];
        employeeInfo[0] = new Employee("Иванов Иван Иванович", "Юрист", "Ivanov@gmail.com", "+37529598554", 750.50, 30);
        employeeInfo[1] = new Employee("Сидоров Григорий Григорьевич", "Повар", "Sodorovgr@gmail.com", "+37529333333", 500.25, 55);
        employeeInfo[2] = new Employee("Караулова Юлия Антоновна", "Бухгалтер", "yuliKaraulova@gmail.com", "+375336851569", 900.05, 29);
        employeeInfo[3] = new Employee("Щукин Павел Андреевич", "Слесарь", "pavel99@gmail.com", "+375255104444", 300.50, 48);
        employeeInfo[4] = new Employee("Морозова Ольга Николаевна", "Кадровик", "morozova111@gmail.com", "+375339994585", 750.80, 33);

        for (Employee list : employeeInfo) {
            list.toString();
        }


        Park park = new Park("LunaPark");
        Park.Attraction attraction1 = park.new Attraction("Горки", "10:00-15:00", 15.00);
        Park.Attraction attraction2 = park.new Attraction("Машинки", "11:00-16:00", 20.50);
        Park.Attraction attraction3 = park.new Attraction("Ромашка", "12:00-17:00", 25.55);
        attraction1.toString();
        attraction2.toString();
        attraction3.toString();
    }
}