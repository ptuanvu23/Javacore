package condition_structure;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap môt sô nguxên duong x: ");
        int x = scanner.nextInt();
        double squareRoot = Math.sqrt(x);
        if (squareRoot % 1 == 0) {
            System.out.println(x + " là sô chinh phuong");
        } else {
            System.out.println(x + "khong phai la so chinh phuong");
        }
    }
}
