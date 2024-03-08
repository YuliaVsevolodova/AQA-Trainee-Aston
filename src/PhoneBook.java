import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<String>> directory;

    public PhoneBook() {
        directory = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
        directory.computeIfAbsent(lastName, k -> new LinkedList<>()).add(phoneNumber);
    }

    public List<String> get(String lastName) {
        return directory.getOrDefault(lastName, new LinkedList<>());
    }

    public static void main(String[] args) {
        PhoneBook directory = new PhoneBook();

        directory.add("Иванов", "5465865886");
        directory.add("Петров", "4575475788");
        directory.add("Кузнецов", "568876644");

        List<String> ivanovNumbers = directory.get("Иванов");
        List<String> petrovNumbers = directory.get("Петров");
        List<String> kuznetsovNumber = directory.get("Кузнецов");

        System.out.println("Номер телефона Иванова: " + ivanovNumbers);
        System.out.println("Номер телефона Петрова: " + petrovNumbers);
        System.out.println("Номер телефона Кузнецова: " + kuznetsovNumber);
    }
}
