package loop_structure;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhâp vão só nguxên n: ");
        int n = scanner.nextInt();
        int a = 1;
        while (a <= n) {
            System.out.print(a + "  ");
            a = 2 * a + 1;
        }
    }
}
