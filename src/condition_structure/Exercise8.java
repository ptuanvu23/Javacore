package condition_structure;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap thang (1-12) : ");
        int month = scanner.nextInt();
        System.out.print("Nhâp nam: ");
        int year = scanner.nextInt();
        int daysInMonth;
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = 30;
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    daysInMonth = 29; // Näm nhuân
                } else {
                    daysInMonth = 28; // Näm không nhuân
                }
                break;
            default:
                daysInMonth = 31;
                break;
        }
        System.out.printf("Sô ngày trong thang %d nam %d Là %d ngày.", month, year, daysInMonth);
    }
}
