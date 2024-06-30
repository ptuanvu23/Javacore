package condition_structure;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số từ 1 đến 10:");
        int num = Integer.parseInt(scanner.nextLine());
        switch (num) {
            case 1:
                System.out.println("Số:" + num + " bằng tiếng anh là: one");
                break;
            case 2:
                System.out.println("Số:" + num + " bằng tiếng anh là: two");
                break;
            case 3:
                System.out.println("Số:" + num + " bằng tiếng anh là: three");
                break;
            case 4:
                System.out.println("Số:" + num + " bằng tiếng anh là: four");
                break;
            case 5:
                System.out.println("Số:" + num + " bằng tiếng anh là: five");
                break;
            case 6:
                System.out.println("Số:" + num + " bằng tiếng anh là: six");
                break;
            case 7:
                System.out.println("Số:" + num + " bằng tiếng anh là: seven");
                break;
            case 8:
                System.out.println("Số:" + num + " bằng tiếng anh là: eight");
                break;
            case 9:
                System.out.println("Số:" + num + " bằng tiếng anh là: nine");
                break;
            case 10:
                System.out.println("Số:" + num + " bằng tiếng anh là: ten");
                break;
            default:
                System.out.println("Invalid number");
        }
    }
}
