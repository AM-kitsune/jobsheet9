import java.util.Scanner;

public class SearchNilai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah Nilai >:3 : ");
        int jumlah = sc.nextInt();
        int[] arrNilai = new int[jumlah];
        
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukan Nilai Mahasiswa ke- " + (i+1) + "kakak :3 : ");
            arrNilai[i] = sc.nextInt();
        }
        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();
        int hasil = -1;
        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i + 1;
                break;
            }
        }

        if (hasil != -1) {
            System.out.println("Nilai " + key + " ketemu di indeks ke-" + hasil );
        } else {
            System.out.println("Nilai " + key + " tidak ditemukan");
        }
    }
}
