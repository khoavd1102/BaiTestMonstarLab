//        0 đến 50	    1678 đ
//        51 đến 100	1734 đ
//        101 đến 200	2014 đ
//        201 đến 300	2536 đ
//        301 đến 400	2834 đ
//        Trên 401	2927 đ


import java.util.Scanner;

public class TinhTienDien {
    public static void main(String[] args) {
        float tienDien = 0;
        float tienBac1 = 50 * 1678;
        float tienBac2 = tienBac1 + 50 * 1734;
        float tienBac3 = tienBac2 + 100 * 2014;
        float tienBac4 = tienBac3 + 100 * 2536;
        float tienBac5 = tienBac4 + 100 * 2834;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số điện: ");
        int soDien = Integer.parseInt(scanner.nextLine());
        if (soDien < 0) {
            System.out.println("Số điện không hợp lệ");
        } else {
            if (soDien <= 50) {
                tienDien = soDien * 1678;
            } else if (51 >= soDien && soDien <= 100) {
                tienDien = tienBac1 + (soDien - 50) * 1734;
            } else if (101 >= soDien && soDien <= 200) {
                tienDien = tienBac2 + (soDien - 100) * 2014;
            } else if (201 >= soDien && soDien <= 300) {
                tienDien = tienBac3 + (soDien - 200) * 2536;
            } else if (301 >= soDien && soDien <= 400) {
                tienDien = tienBac4 + (soDien - 300) * 2834;
            } else if (401 >= soDien) {
                tienDien = tienBac5 + (soDien - 400) * 2927;
            }

            System.out.println("Số tiền điện là: " + tienDien);
        }
    }
}
