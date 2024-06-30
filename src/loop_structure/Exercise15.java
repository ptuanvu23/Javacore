package loop_structure;

import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập canh: ");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1) {
                    System.out.print("*");
                } else System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("////////////////////");
        System.out.println();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == n) {
                    System.out.print("*");
                } else System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("////////////////////");
        System.out.println();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
