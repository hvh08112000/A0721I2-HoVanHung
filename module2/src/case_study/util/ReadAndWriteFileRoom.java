package case_study.util;

import case_study.models.Room;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFileRoom {
    final static String ROOM_PATH = "src\\case_study\\data\\Room.csv";
    public static void writeFileRoom(List<Room> roomList, boolean append) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(ROOM_PATH, append));
            for (Room room : roomList) {
                writer.write(room.getInfoToCSV());
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Lỗi ghi file!");
        }
    }

    public static List<Room> readFileHouse() {
        List<Room> roomList = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(ROOM_PATH));
            String line = null;
            String[] array = null;
            while ((line = reader.readLine()) != null) {
                array = line.split(",");
                Room room = new Room(array[0], array[1], Double.parseDouble(array[2]), Double.parseDouble(array[3]),
                        Integer.parseInt(array[4]), array[5], array[6]);
                roomList.add(room);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Lỗi đọc file!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return roomList;
    }
}
