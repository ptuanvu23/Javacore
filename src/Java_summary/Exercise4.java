package Java_summary;

import java.math.BigDecimal;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập điểm Toán:");
        double mathPoint = Double.parseDouble((scanner.nextLine()));
        System.out.print("Nhập hs Toán:");
        double math = Double.parseDouble((scanner.nextLine()));
        System.out.print("Nhập điểm Lý:");
        double physPoint = Double.parseDouble((scanner.nextLine()));
        System.out.print("Nhập hs Lý:");
        double phys = Double.parseDouble((scanner.nextLine()));
        System.out.print("Nhập điểm Hoá:");
        double chemPoint = Double.parseDouble((scanner.nextLine()));
        System.out.print("Nhập hs Hoá:");
        double chem = Double.parseDouble((scanner.nextLine()));
        double avg = (mathPoint * math + physPoint * phys + chemPoint * chem) / (math + phys + chem);
        System.out.println("Điểm trung bình:" + BigDecimal.valueOf(avg));

    }
}
