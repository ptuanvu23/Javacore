package loop_structure;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhâp vão só nguxên n: ");
        int n = scanner.nextInt();
        if (n < 1) {
            return;
        }
        int prev = 0;
        int next = 1;
        while (prev< n) {
            System.out.print(prev + " ");
            int sum = prev + next;
            prev = next;
            next = sum;
        }
    }
}


