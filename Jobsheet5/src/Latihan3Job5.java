//created by 21343034_Rani Nabilla Putri
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Latihan3Job5 {
    public static void main(String[] args){
        BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));

        String name = "", hobby = "";

        try {
            System.out.print("Nama Anda: ");
            name = dataIn.readLine();
            System.out.print("Hobi Anda: ");
            hobby = dataIn.readLine();
        }

        catch (IOException e){
            System.out.println("Gagal membaca keyboard");
        }

        System.out.println("Jadi, hobi Anda "+hobby+". Hobi yang bagus " +name+"!");
    }
}
