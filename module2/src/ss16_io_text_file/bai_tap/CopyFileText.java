package ss16_io_text_file.bai_tap;

import java.io.*;
import java.util.Scanner;

public class CopyFileText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập file source: ");
        String sourcePath = scanner.nextLine();
        System.out.println("Nhập file target: ");
        String targetPath = scanner.nextLine();
        CopyFileText copy = new CopyFileText();
        try {
            copy.copyFile(sourcePath,targetPath);
            System.out.println("Copy thành công!!!");
        } catch (IOException e) {
            System.out.println("Lỗi copy file");
        }
    }

    public void copyFile(String source, String target) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(source));
        BufferedWriter writer = new BufferedWriter(new FileWriter(target));
        String line = "";
        while ((line = reader.readLine()) != null) {
            writer.write(line);
            writer.newLine();
        }
        reader.close();
        writer.close();
    }
}
