package case_study.models.service;

import case_study.commons.ValidateServices;
import case_study.models.Customer;
import case_study.util.ReadAndWriteFileCustomer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerServices implements IServices{
    static List<Customer> customerList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    @Override
    public void addNew() {
        String name = "";
        String dateOfBirth = "";
        String gender = "";
        String identityCardNumber = "";
        String phoneNumber = "";
        String email = "";
        String typeOfGuest = "";
        String address = "";
        System.out.print("Nhập họ tên: ");
        name = scanner.nextLine();
        System.out.print("Nhập ngày sinh: ");
        dateOfBirth = scanner.nextLine();
        System.out.print("Nhập giới tính: ");
        gender = scanner.nextLine();
        System.out.print("Nhập số CMND: ");
        identityCardNumber = scanner.nextLine();
        System.out.print("Nhập số điện thoại: ");
        phoneNumber = scanner.nextLine();
        while (true) {
            System.out.print("Nhập email: ");
            email = scanner.nextLine();
            if (!ValidateServices.validateEmail(email)) {
                return ;
            }
        }

        System.out.print("Nhập loại khách: ");
        typeOfGuest = scanner.nextLine();
        System.out.print("Nhập địa chỉ: ");
        address = scanner.nextLine();

        Customer customer = new Customer(name, dateOfBirth, gender, identityCardNumber, phoneNumber, email, typeOfGuest, address);
        customerList.add(customer);
        ReadAndWriteFileCustomer.writeFileCustomer(customerList, true);
    }

    @Override
    public void show() {
        List<Customer> customerList = ReadAndWriteFileCustomer.readFileCustomer();
        for (Customer customer : customerList) {
            System.out.println(customer.showInfo());
        }
    }
}
