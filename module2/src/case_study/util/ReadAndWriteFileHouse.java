package case_study.util;

import case_study.models.House;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFileHouse {
    final static String HOUSE_PATH = "src\\case_study\\data\\House.csv";
    public static void writeFileHouse(List<House> houseList, boolean append) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(HOUSE_PATH, append));
            for (House house : houseList) {
                writer.write(house.getInfoToCSV());
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Lỗi ghi file!");
        }
    }

    public static List<House> readFileHouse() {
        List<House> houseList = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(HOUSE_PATH));
            String line = null;
            String[] array = null;
            while ((line = reader.readLine()) != null) {
                array = line.split(",");
                House house = new House(array[0], array[1], Double.parseDouble(array[2]), Double.parseDouble(array[3]),
                        Integer.parseInt(array[4]), array[5], array[6], array[7], Integer.parseInt(array[8]));
                houseList.add(house);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Lỗi đọc file!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return houseList;
    }
}
