public class Park {
    private String parkName;

    public Park(String parkName) {
        this.parkName = parkName;
    }

    public class Attraction {
        private String attractionsName;
        private String workingHours;
        private double cost;

        public Attraction(String attractionsName, String workingHours, double cost) {
            this.attractionsName = attractionsName;
            this.workingHours = workingHours;
            this.cost = cost;
        }

        public void info() {
            System.out.println(parkName + "\nНазвание аттракциона: " + attractionsName);
            System.out.println("Время работы: " + workingHours);
            System.out.println("Стоимость: " + cost + " руб.");
            System.out.println("----------");
        }
    }

    public static void main(String[] args) {
        Park park = new Park("LunaPark");
        Attraction attraction1 = park.new Attraction("Горки", "10:00-15:00", 15.00);
        Attraction attraction2 = park.new Attraction("Машинки", "11:00-16:00", 20.50);
        Attraction attraction3 = park.new Attraction("Ромашка", "12:00-17:00", 25.55);
        attraction1.info();
        attraction2.info();
        attraction3.info();
    }
}
