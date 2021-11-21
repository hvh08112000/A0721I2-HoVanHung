package case_study.models.service;

import case_study.commons.ValidateServices;
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
        String idService = "";
        String nameService = "";
        String rentalType = "";
        Double usableArea, rentalCosts;
        int quantity;

        do {
            System.out.print("Nhập id service: ");
            idService = scanner.nextLine();
        } while (!ValidateServices.validateIdServiceRoom(idService));
        do {
            System.out.print("Nhập tên service: ");
            nameService = scanner.nextLine();
        } while (!ValidateServices.validateNameService(nameService));
        do {
            System.out.print("Nhập diện tích sử dụng: ");
            usableArea = Double.parseDouble(scanner.nextLine());
        } while (usableArea < 30);
        do {
            System.out.print("Nhập chi phí thuê: ");
            rentalCosts = Double.parseDouble(scanner.nextLine());
        } while (rentalCosts < 0);
        do {
            System.out.print("Nhập số lượng người tối đa: ");
            quantity = Integer.parseInt(scanner.nextLine());
        } while (quantity < 0 || quantity > 20);
        do {
            System.out.print("Nhập kiểu thuê: ");
            rentalType = scanner.nextLine();
        } while (ValidateServices.validateNameService(rentalType));
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
