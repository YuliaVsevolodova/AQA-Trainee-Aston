import java.io.*;
import java.util.Arrays;

public class AppData {
    public String[] header;
    public int[][] data;

    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    public void save(String filename) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            writer.println(String.join(";", header));
            for (int[] row : data) {
                writer.println(Arrays.toString(row).replaceAll("\\[|\\]|\\s", "").replace(",", ";"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void load(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            header = reader.readLine().split(";");
            data = reader.lines()
                    .map(line -> Arrays.stream(line.split(";"))
                            .mapToInt(Integer::parseInt)
                            .toArray())
                    .toArray(int[][]::new);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
