package case_study.models.service;

import case_study.commons.ValidateServices;
import case_study.models.Villa;
import case_study.util.ReadAndWriteFileVilla;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VillaServices implements IServices{
    static List<Villa> villaList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    @Override
    public void addNew() {
        String idService = "";
        String nameService = "";
        String rentalType = "";
        String roomStandard = "";
        Double usableArea, rentalCosts, poolArea;
        int quantity, floor;

        do {
            System.out.print("Nhập id service: ");
            idService = scanner.nextLine();
        } while (!ValidateServices.validateIdServiceVilla(idService));
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
            System.out.print("Nhập diện tích hồ bơi: ");
            poolArea = Double.parseDouble(scanner.nextLine());
        } while (poolArea < 30);
        do {
            System.out.print("Nhập số tầng: ");
            floor = Integer.parseInt(scanner.nextLine());
        } while (floor < 0);

        Villa villa = new Villa(idService, nameService, usableArea, rentalCosts, quantity, rentalType,
                roomStandard, description, poolArea, floor);
        villaList.add(villa);
        ReadAndWriteFileVilla.writeFileVilla(villaList, true);
    }

    @Override
    public void show() {
        villaList = ReadAndWriteFileVilla.readFileVilla();
        for (Villa villa: villaList) {
            System.out.println(villa.showInfo());
        }
    }
}
