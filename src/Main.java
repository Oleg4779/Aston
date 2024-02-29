import java.io.File;

public class Main {
    public static void main(String[] args) {

        String[] header = {"Value 1", "Value 2", "Value 3"};
        int[][] data = {{100, 200, 123}, {300, 400, 500}};

        AppData appData = new AppData(header, data);

        File file = new File("file.csv");
        Operations.write(file, appData);

        AppData appData1 = Operations.read(file);
        System.out.println(appData1.toString());
    }
}
