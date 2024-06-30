package loop_structure;

import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số a: ");
        int a = scanner.nextInt();

        System.out.print("Nhập số b: ");
        int b = scanner.nextInt();

        int ucln = timUcln(a, b);
        int bcnn = timBcnn(a, b);

        System.out.println("Ước số chung lớn nhất (ƯCLN) của " + a + " và " + b + " là: " + ucln);
        System.out.println("Bội số chung nhỏ nhất (BCNN) của " + a + " và " + b + " là: " + bcnn);
    }
    private static int timUcln(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    private static int timBcnn(int a, int b) {
        return (a * b) / timUcln(a, b);
    }
}

