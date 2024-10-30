import java.util.Scanner;

public class ArrayRataNilai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        int[] nilaiMhs = new int[jumlahMahasiswa];

        double total = 0;
        double totalLulus = 0;
        double totalTidakLulus = 0;
        double rata2;
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = sc.nextInt();

            if (nilaiMhs[i] > 70) {
                jumlahLulus++;
                totalLulus += nilaiMhs[i];
            } else {
                jumlahTidakLulus++;
                totalTidakLulus += nilaiMhs[i];
            }
        }

        rata2 = total / jumlahMahasiswa;
        double rata2Lulus = jumlahLulus == 0 ? 0 : totalLulus / jumlahLulus;
        double rata2TidakLulus = jumlahTidakLulus == 0 ? 0 : totalTidakLulus / jumlahTidakLulus;

        System.out.println("Jumlah mahasiswa yang lulus: " + jumlahLulus);
        System.out.println("Rata-rata nilai lulus = " + rata2Lulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus: " + jumlahTidakLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rata2TidakLulus);
    }
}