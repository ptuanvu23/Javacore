package java_summary;

import java.math.BigDecimal;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập r:");
        double r = Double.parseDouble((scanner.nextLine()));
        double chuvi = 2 * Math.PI * r;
        double dt = Math.PI * r * r;
        System.out.println("Chu vi:" + BigDecimal.valueOf(chuvi));
        System.out.println("Dien tich:" + BigDecimal.valueOf(dt));


    }
}
