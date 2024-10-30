
import java.util.Scanner;

public class ArrayNilai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiAkhir = new int[10];
        // for (int i = 0; i < 10; i++){
        //     System.out.print("Masukan Nilai Akhir ke- " + i + " : ");
        //     nilaiAkhir[i] = sc.nextInt();
        // }

        for (int i = 0 ; i < nilaiAkhir.length; i++ ){
            System.out.print("Masukan nilai Akhir ke - "+ i + " : ");
            nilaiAkhir[i] = sc.nextInt();
        }

        for (int i = 0; i < nilaiAkhir.length; i++){
            if(nilaiAkhir[i] > 70){
            System.out.println("Mahasiswa Ke-" + i + "  Alhamdulilllah LULUS!! " );
        }else{
            System.out.println("Mahasiswa ke-" +i + "  MAAF ANDA TIDAK LULUS AOWAWOKAOWK (mangkanya Belajar)");
        }
        }
    }
}
