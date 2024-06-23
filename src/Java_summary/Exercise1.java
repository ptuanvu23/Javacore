package Java_summary;

import java.time.Year;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        System.out.print("Nhập năm sinh:");
        Scanner scanner = new Scanner(System.in);
        Integer year = Integer.valueOf(scanner.nextLine());
        System.out.printf("Số tuổi là: %d", Year.now().getValue() - year.intValue());

    }
}
