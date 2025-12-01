import java.util.Scanner;

public class tugas1Kubus5 {
     static int hitungLuasPermukaan(int rusuk) {
        int lp = 6 * (rusuk*rusuk);
        return lp;
    }

    static int hitungVolume(int sisi) {
        int volume = sisi * sisi* sisi;
        return volume;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sisi, rusuk, lp, vol;

        System.out.print("Masukkan panjang rusuk kubus: ");
        rusuk = sc.nextInt();

        System.out.print("Masukkan panjang sisi kubus: ");
        sisi = sc.nextInt();

        lp = 6 * (rusuk*rusuk);
        System.out.println("Luas persegi panjang adalah " + lp);
        vol = sisi * sisi* sisi;
        System.out.println("Volume balok adalah " + vol);

        sc.close();
    }
}
