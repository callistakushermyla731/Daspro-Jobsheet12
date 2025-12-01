import java.util.Scanner;
public class tugas3RekapPenjualanCafe5 {
    static Scanner sc = new Scanner(System.in);

    static String[] menu = {"Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan"};

    static void inputData(int[][] penjualan) {
        System.out.println("===== INPUT DATA PENJUALAN CAFE =====");
        for(int i = 0; i < penjualan.length; i++) {
            System.out.println("\nInput penjualan untuk menu: " + menu[i]);
            for(int j = 0; j < penjualan.length; j++) {
                System.out.print("Hari ke-" + (j+1) + ": ");
                penjualan[i][j] = sc.nextInt();
            }
        }
    }

    static void tampilData(int[][] penjualan) {
        System.out.println("\n===== TABEL PENJUALAN 5 MENU DALAM 7 HARI =====");
        System.out.printf("%-15s", "Menu");

        for(int h = 1; h <= 7; h++) {
            System.out.printf("Hari-%d\t", h);
        }
        System.out.println();

        for(int i = 0; i < penjualan.length; i++) {
            System.out.printf("%-15s", menu[i]);
            for(int j = 0; j < penjualan.length; j++) {
                System.out.printf("%d\t", penjualan[i][j]);
            }
            System.out.println();
        }
    }

    static void menuTertinggi(int[][] penjualan) {
        int maxTotal = 0;
        int maxMenu = 0;

        for(int i = 0; i < penjualan.length; i++) {
            int total = 0;
            for(int j = 0; j < penjualan.length; j++) {
                total += penjualan[i][j];
            }

            if (total > maxTotal) {
                maxTotal = total;
                maxMenu = i;
            }
        }

        System.out.println("\n===== MENU DENGAN TOTAL PENJUALAN TERTINGGI =====");
        System.out.println("Menu   : " + menu[maxMenu]);
        System.out.println("Total  : " + maxTotal);
    }

    static void rataMenu(int[][] penjualan) {
        System.out.println("\n===== RATA-RATA PENJUALAN SETIAP MENU =====");
        for(int i = 0; i < penjualan.length; i++) {
            double total = 0;
            for(int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }
            double rata = total / penjualan[i].length;
            System.out.printf("%-15s : %.2f\n", menu[i], rata);
        }
    }

    public static void main(String[] args) {
        int[][] data = new int[5][7];

        inputData(data);
        tampilData(data);
        menuTertinggi(data);
        rataMenu(data);
    }
}
