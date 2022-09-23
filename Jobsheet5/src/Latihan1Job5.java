/**
 *
 * created by 21343034_Rani Nabilla Putri
 */
import java.util.Scanner;

public class Latihan1Job5 {
    public static void main(String args[]){
        Scanner in = new Scanner (System.in);

        System.out.print("Masukkan nama lengkap: ");
        String nama = in.nextLine();

        System.out.print("Masukkan NIM: ");
        int NIM = in.nextInt();

        System.out.print("Masukkan Nilai: ");
        float nilai = in.nextFloat();

        System.out.println("\nNama: " + nama +
                           "\nNIM: " + NIM +
                           "\nNilai: " + nilai);
    }
}
