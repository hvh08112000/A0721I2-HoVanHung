package case_study.util;

import case_study.models.Villa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFileVilla {
    final static String VILLA_PATH = "src\\case_study\\data\\Villa.csv";
    public static void writeFileVilla(List<Villa> villaList, boolean append) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(VILLA_PATH, append));
            for (Villa villa : villaList) {
                writer.write(villa.getInfoToCSV());
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Lỗi ghi file!");
        }
    }

    public static List<Villa> readFileVilla() {
        List<Villa> villaList = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(VILLA_PATH));
            String line = null;
            String[] array = null;
            while ((line = reader.readLine()) != null) {
                array = line.split(",");
                Villa villa = new Villa(array[0], array[1], Double.parseDouble(array[2]), Double.parseDouble(array[3]),
                        Integer.parseInt(array[4]), array[5], array[6], array[7], Double.parseDouble(array[8]), Integer.parseInt(array[9]));
                villaList.add(villa);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Lỗi đọc file!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return villaList;
    }
}
