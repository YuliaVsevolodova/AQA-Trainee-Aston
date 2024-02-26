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

        @Override
        public String toString() {
            return "Attraction{" +
                    "Название аттракциона='" + attractionsName + '\'' +
                    ", Время работа='" + workingHours + '\'' +
                    ", Стоимость=" + cost +
                    '}';
        }
    }
}
