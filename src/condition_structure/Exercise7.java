package condition_structure;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập thâm niên công tác(tháng):");
        int tnct = scanner.nextInt();
        double luongCanBan = 650000.0;
        double heSoLuong;
        if (tnct < 12) {
            heSoLuong = 1.92;
        } else if (tnct < 36) {
            heSoLuong = 2.34;
        } else if (tnct < 60) {
            heSoLuong = 3.0;
        } else {
            heSoLuong = 4.5;
        }
        double luong = heSoLuong * luongCanBan;
        System.out.println("Luong cüa nhân viên là: $" + luong);
    }
}

