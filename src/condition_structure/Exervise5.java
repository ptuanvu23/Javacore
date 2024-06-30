package condition_structure;

import java.util.Scanner;

public class Exervise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap hê sô a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhag hê sô b: ");
        double b = scanner.nextDouble();
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh có vô sô nghiệm.");
            } else System.out.println("Phuong trinh vô nghiệm.");
        } else { // Bude 3: Nêu hê sô a khée 0
            double x = -b / a;
            System.out.println("Nghiệm của phuong trinh là x = " + x);
        }
    }
}
