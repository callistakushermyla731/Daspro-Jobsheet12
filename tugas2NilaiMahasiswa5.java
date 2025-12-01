import java.util.Scanner;
public class tugas2NilaiMahasiswa5 {

     static void inputNilai(int[] nilai) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            nilai[i] = sc.nextInt();
        }
     }

     static void tampilNilai(int[] nilai){
        System.out.println("\nDaftar Nilai Mahasiswa:");
        for(int i = 0; i < nilai.length; i++) {
            System.out.println("Mahasiswa " + (i+1) + ": " + nilai[i]);
        }
     }

     static int hitTot(int[] nilai) {
        int total = 0;
        for(int i = 0; i < nilai.length; i++) {
            total += nilai[i];
        }
        return total;
     }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int N = sc.nextInt();

        int[] nilaiMahasiswa = new int [N];

        inputNilai(nilaiMahasiswa);
        tampilNilai(nilaiMahasiswa);

        int totalNilai = hitTot(nilaiMahasiswa);
        System.out.println("\nTotal nilai seluruh mahasiswa = " + totalNilai);
     }
}
