package case_study.models.service;

import case_study.models.Room;
import case_study.util.ReadAndWriteFileRoom;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RoomServices implements IServices {
    static List<Room> roomList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    @Override
    public void addNew() {
        System.out.print("Nhập id service: ");
        String idService = scanner.nextLine();
        System.out.print("Nhập tên service: ");
        String nameService = scanner.nextLine();
        System.out.print("Nhập diện tích sử dụng: ");
        Double usableArea = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập chi phí thuê: ");
        Double rentalCosts = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập số lượng người tối đa: ");
        int quantity = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập kiểu thuê: ");
        String rentalType = scanner.nextLine();
        System.out.print("Nhập dịch vụ miễm phí đi kèm: ");
        String freeServiceIncluded = scanner.nextLine();
        Room room = new Room(idService, nameService, usableArea, rentalCosts, quantity, rentalType, freeServiceIncluded);
        roomList.add(room);
        ReadAndWriteFileRoom.writeFileRoom(roomList,true);
    }

    @Override
    public void show() {
        List<Room> roomList = ReadAndWriteFileRoom.readFileHouse();
        for (Room room : roomList) {
            System.out.println(room.showInfo());
        }
    }
}
