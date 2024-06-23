package Java_summary;

import java.math.BigDecimal;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm:");
        String productName = scanner.nextLine();
        System.out.print("Nhập số lượng:");
        int quantity = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập đơn giá:");
        String productPrice = String.valueOf(scanner.nextLine());
        System.out.println("Tên sản phẩm là:" + productName);
        System.out.println("Tiền:" + BigDecimal.valueOf(quantity * Double.parseDouble(productPrice)) + "$");
        System.out.println("Thuế giá trị gia tăng:" + BigDecimal.valueOf(quantity * Double.parseDouble(productPrice) * 0.1) + "$");
    }
}
