package case_study.controllers;

import case_study.models.service.HouseServices;
import case_study.models.service.RoomServices;
import case_study.models.service.VillaServices;

import java.util.Scanner;

public class MainController {
    static Scanner scanner = new Scanner(System.in);
    boolean flag = true;

    public static void main(String[] args) {
        MainController mainController = new MainController();
        mainController.displayMainMenu();
    }

    //Hiển thị menu
    public void displayMainMenu() {
        int choice = 0;
        do {
            System.out.println("==========> MAIN MENU <==========" +
                    "\n1. Add New Services" +
                    "\n2. Show Services" +
                    "\n3. Add New Customer" +
                    "\n4. Show Information of Customer" +
                    "\n5. Add New Booking" +
                    "\n6. Show Information of Employee" +
                    "\n7. Exit");
            System.out.print("Please select function: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addNewServices();
                    break;
                case 2:
                    showService();
                    break;
                case 3:
                    System.out.println("3. Add New Customer");
                    break;
                case 4:
                    System.out.println("4. Show Information of Customer");
                    break;
                case 5:
                    System.out.println("5. Add New Booking");
                    break;
                case 6:
                    System.out.println("6. Show Information of Employee");
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    flag = false;
            }
        } while (flag);
    }

    //Chức năng add new services
    public void addNewServices() {
        VillaServices villaServices = new VillaServices();
        HouseServices houseServices = new HouseServices();
        RoomServices roomServices = new RoomServices();
        int choice = 0;
        do {
            System.out.println("==========> ADD NEW SERVICES <==========" +
                    "\n1. Add New Villa" +
                    "\n2. Add New House" +
                    "\n3. Add New Room" +
                    "\n4. Back to menu" +
                    "\n5. Exit");
            System.out.print("Please select function: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("==========> ADD NEW VILLA <==========");
                    villaServices.addNew();
                    break;
                case 2:
                    System.out.println("==========> ADD NEW HOUSE <==========");
                    houseServices.addNew();
                    break;
                case 3:
                    System.out.println("==========> ADD NEW ROOM <==========");
                    roomServices.addNew();
                    break;
                case 4:
                    displayMainMenu();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    flag = false;
            }
        } while (flag);
    }

    public void showService() {
        VillaServices villaServices = new VillaServices();
        HouseServices houseServices = new HouseServices();
        RoomServices roomServices = new RoomServices();
        int choice = 0;
        do {
            System.out.println("==========> SHOW SERVICES <==========" +
                    "\n1. Show all Villa" +
                    "\n2. Show all House" +
                    "\n3. Show all Room" +
                    "\n4. Show All Name Villa Not Duplicate" +
                    "\n5. Show All Name House Not Duplicate" +
                    "\n6. Show All Name Room Not Duplicate" +
                    "\n7. Back to menu" +
                    "\n8. Exit");
            System.out.print("Please select function: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    villaServices.show();
                    break;
                case 2:
                    houseServices.show();
                    break;
                case 3:
                    roomServices.show();
                    break;
                case 4:
                    System.out.println("Show All Name Villa Not Duplicate");
                    break;
                case 5:
                    System.out.println("Show All Name House Not Duplicate");
                    break;
                case 6:
                    System.out.println("Show All Name Room Not Duplicate");
                    break;
                case 7:
                    displayMainMenu();
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    flag = false;
            }
        } while (flag);
    }
}
