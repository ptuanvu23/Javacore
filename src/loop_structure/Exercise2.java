package loop_structure;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhâp vão só nguxên n: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i+=2) {
            System.out.print(i + "\t");
        }
    }
}
