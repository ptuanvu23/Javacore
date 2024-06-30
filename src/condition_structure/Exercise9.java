package condition_structure;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhâp môt ky tu chu cai: ");
        char character = scanner.nextLine().charAt(0);
        if ((character >= 'A' && character <= 'Z') || (character >= 'a' && character <= 'z')) {
            if (character >= 'a' && character <= 'z') {
                character -= 32;
            } else {
                character += 32;
            }
            System.out.println("Kv tu sau khi dà doi: " + character);
        } else {
            System.out.println("Ban dà nhâp sai. Häy nhâp môt ky tu chü cái.");

        }
    }
}

