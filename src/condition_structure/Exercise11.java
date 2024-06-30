package condition_structure;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap ngay:");
        int day = scanner.nextInt();
        if (day < 1 || day > 31) {
            System.out.println("Ngäy không hop Lê");
            return;
        }
        System.out.print("nhap thang:");
        int month = scanner.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("thang không hop Lê");
            return;
        }
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day == 31) {
                System.out.println("Ngày không hop lê");
                return;

            }
        }
        System.out.print("Nhâp näm: ");
        int year = scanner.nextInt();
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        if (month == 2) {
            if (isLeapYear) {
                if (day > 29) {
                    System.out.println("Ngay khong hop le");
                    return;
                } else {
                    if (day > 28) {
                        System.out.println("Ngay khong hop le");
                        return;
                    }
                }
            }
        }
        System.out.println("Ngay hop lê!!");
        int nextDay = day;
        int nextMonth = month;
        int nextYear = year;
        nextDay++;
        if (nextDay > 31 || (month == 2 && nextDay > (isLeapYear ? 29 : 28)) || ((month == 4 || month == 6 || month == 9 || month == 11) && nextDay > 30)) {
            nextDay = 1;
            nextMonth++;
        }
        if (nextMonth > 12) {
            nextMonth = 1;
            nextYear++;
        }
        System.out.printf("Ngay ke tiep: %d/%d/%d", nextDay, nextMonth, nextYear);
        int previousDay = day;
        int previousMonth = month;
        int previousYear = year;

        previousDay--;
        if (previousDay < 1) {
            previousMonth--;
            if (previousMonth < 1) {
                previousMonth = 12;
                previousYear--;
            }
        }
        if (previousMonth == 4 || previousMonth == 6 || previousMonth == 9 || previousMonth == 11) {
            previousDay = 30;
        } else if (previousMonth == 2) {
            if (isLeapYear) {
                previousDay = 29;
            } else {
                previousDay = 28;
            }
        } else {
            previousDay = 31;
        }
        System.out.println();
        System.out.printf("Ngay truo do: %d/%d/%d",previousDay,previousMonth,previousYear);
    }

}
