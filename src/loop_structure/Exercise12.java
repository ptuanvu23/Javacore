package loop_structure;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập so :");
        int num = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int pro = 1;
        while ((num % 10) > 0) {
            sum += (num % 10);
            pro *= (num % 10);
            num /= 10;
        }
        System.out.println("tong la:" + sum);
        System.out.println("tich la:" + pro);

    }
}
