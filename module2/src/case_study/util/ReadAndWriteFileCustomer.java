package case_study.util;

import case_study.models.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFileCustomer {
    final static String CUSTOMER_PATH = "src\\case_study\\data\\Customer.csv";
    public static void writeFileCustomer(List<Customer> customerList, boolean append) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(CUSTOMER_PATH));
            for (Customer customer : customerList) {
                writer.write(customer.getInfoToCSV());
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Lỗi ghi file!");
        }
    }

    public static List<Customer> readFileCustomer() {
        List<Customer> customerList = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(CUSTOMER_PATH));
            String line = null;
            String[] array = null;
            while ((line = reader.readLine()) != null) {
                array = line.split(",");
                Customer customer = new Customer(array[0], array[1], array[2], array[3], array[4], array[5], array[6], array[7]);
                customerList.add(customer);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return customerList;
    }
}
