package Java_summary;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập so xe:");
        int num = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        while ((num % 10) > 0) {
            sum += (num % 10);
            num /= 10;
        }
        System.out.println("So nut la:" + sum);
    }
}
