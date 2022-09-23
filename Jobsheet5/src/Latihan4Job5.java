//created by 21343034_Rani Nabilla Putri
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Latihan4Job5 {
    public static void main(String[] args){
        BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));

        String a, b;
        float angka1, angka2, jumlah;
        System.out.println("Program Penjumlahan Dua Buah Bilangan");

        try {
            System.out.print("Masukkan angka pertama: ");
            a = dataIn.readLine();
            /*Data yang akan diproses aritmatika harus dikonversi dulu
              dari tipe data String ke tipe data angka yang diperlukan.
              Data yang diperoleh dari inputan kelas BufferedReader tipe datanya selalu String*/
            angka1 = Float.parseFloat(a); //konversi dari String ke float

            System.out.print("Masukkan angka kedua: ");
            b = dataIn.readLine();
            angka2 = Float.parseFloat(b); //konversi dari String ke float

            jumlah = angka1 + angka2;
            System.out.println("Jumlah: " + jumlah);
        }

        catch (IOException e){
            System.out.println("Gagal membaca keyboard");
        }
    }
}
