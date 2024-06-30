package condition_structure;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhâp sô thú nhât (a) : ");
        int a = scanner.nextInt();
        System.out.print("Nhâo sô thú hai (b) : ");
        int b = scanner.nextInt();
        int max = (a > b) ? a : b;
        int min = (a < b) ? a : b;
        System.out.println("max: "+max);
        System.out.println("min: "+min);


    }
}
