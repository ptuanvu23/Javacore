package loop_structure;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhâp vão só nguxên n: ");
        int n = scanner.nextInt();
        double sum = 1.0;
        int i = 1;
        int fact =1;
        while (i <= n) {
            for (int j = 1; j <= 2*i-1; j++) {
                fact *=j;
            }
            sum += 1.0 / fact;
            i++;
        }
        System.out.println("Tổng S = " + sum);
    }
}
