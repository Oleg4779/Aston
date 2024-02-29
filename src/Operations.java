import java.io.*;

public class Operations {
    public static void write(File file, AppData appData) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))){
            StringBuilder header = new StringBuilder();
            for(String headerData : appData.getHeader()) {
                header.append(headerData).append(";");
            }
            writer.write(header.toString());
            writer.newLine();

            for(int[] row : appData.getData()) {
                StringBuilder dataLine = new StringBuilder();
                for(int data : row) {
                    dataLine.append(data).append(";");
                }

                writer.write(dataLine.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static AppData read(File file) {
        AppData appData = new AppData();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
            String header = reader.readLine();
            String[] headerValues = header.split(";");
            appData.setHeader(headerValues);

            String data;
            int index = 0;
            while((data = reader.readLine()) != null) {
                String[] dataValues = data.split(";");
                int[] row = new int[dataValues.length];
                for(int i = 0; i < dataValues.length; i++) {
                    row[i] = Integer.parseInt(dataValues[i]);
                }
                appData.getData()[index] = row;
                index++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return appData;
    }

}
