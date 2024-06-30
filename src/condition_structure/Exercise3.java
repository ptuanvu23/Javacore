package condition_structure;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhâp sô thú nhât (a) : ");
        int a = scanner.nextInt();
        System.out.print("Nhâp sö thú hai (b): ");
        int b = scanner.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Sau khi dao giá tri:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
