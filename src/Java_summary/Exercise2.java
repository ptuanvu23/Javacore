package Java_summary;
import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {
        System.out.print("Nhập số a:");
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập số b:");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Tổng 2 số là:"+ (a + b));
        System.out.println("Hiệu 2 số là:"+ (a - b));
        System.out.println("Tích 2 số là:"+ (a * b));
        System.out.println("Thương 2 số là:"+ (a / b));
    }
}
