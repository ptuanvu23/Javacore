package loop_structure;

import java.util.Scanner;

import static java.lang.Math.abs;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhâp vão só nguxên n: ");
        int n = scanner.nextInt();
        int a = 1;
        while (abs(a) <= n) {
            if (a < 0) {
                System.out.print(a + "  ");
                a = 2 * abs(a) + 1;
                continue;
            }
            System.out.print(a + "  ");
            a = -(2 * abs(a) + 1);
        }
    }
}
