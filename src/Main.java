import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] header = {"Value1", "Value2", "Value3"};
        int[][] data = {
                {100, 200, 123},
                {300, 400, 500}
        };

        AppData appData = new AppData(header, data);
        appData.save("data.csv");

        AppData loadedData = new AppData(new String[0], new int[0][0]);
        loadedData.load("data.csv");

        for (int[] row : loadedData.data) {
            System.out.println(Arrays.toString(row));
        }
    }
}
