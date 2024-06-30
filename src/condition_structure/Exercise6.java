package condition_structure;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhâp hê sô a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhâp hê sô b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhân hê so c: ");
        double c = scanner.nextDouble();
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phuong trinh co vo so nghiem");
                } else {
                    System.out.println("Phuong trinh vô nghiêm.");
                }
            } else {
                double x = -c / b;
                System.out.println("Nghiêm cua phuong trinh la: " + x);
            }
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Vo nghiem");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Nghiêm kép cüa phuong trinh la:" + x);
            } else {
                double x1 = (-b - Math.sqrt(delta)) / (2 * a);
                double x2 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.println("Nghiêm cüa phuong trinh là x1 = " + x1 + "va x2 =" + x2);
            }


        }
    }
}
