package case_study.models.service;

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
        System.out.print("Tiêu chuẩn phòng: ");
        String roomStandard = scanner.nextLine();
        System.out.print("Mô tả tiện nghi khác: ");
        String description = scanner.nextLine();
        System.out.print("Nhập số tầng: ");
        int floor = Integer.parseInt(scanner.nextLine());
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
