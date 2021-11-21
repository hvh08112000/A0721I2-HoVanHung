package case_study.models.service;

import case_study.commons.ValidateServices;
import case_study.models.House;
import case_study.util.ReadAndWriteFileHouse;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseServices implements IServices{
    static List<House> houseList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    @Override
    public void addNew() {
        String idService = "";
        String nameService = "";
        String rentalType = "";
        String roomStandard = "";
        Double usableArea, rentalCosts;
        int quantity, floor;

        do {
            System.out.print("Nhập id service: ");
            idService = scanner.nextLine();
        } while (!ValidateServices.validateIdServiceHouse(idService));
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
        do {
            System.out.print("Tiêu chuẩn phòng: ");
            roomStandard = scanner.nextLine();
        } while (ValidateServices.validateNameService(roomStandard));
        System.out.print("Mô tả tiện nghi khác: ");
        String description = scanner.nextLine();
        do {
            System.out.print("Nhập số tầng: ");
            floor = Integer.parseInt(scanner.nextLine());
        } while (floor < 0);

        House house = new House(idService, nameService, usableArea, rentalCosts, quantity, rentalType, roomStandard, description, floor);
        houseList.add(house);
        ReadAndWriteFileHouse.writeFileHouse(houseList, true);
    }

    @Override
    public void show() {
        List<House> houseList = ReadAndWriteFileHouse.readFileHouse();
        for (House house : houseList) {
            System.out.println(house.showInfo());
        }
    }
}
