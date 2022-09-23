//created by 21343034_Rani Nabilla Putri
import javax.swing.JOptionPane;

public class Latihan5Job5 {
    public static void main(String[] args){
        String name ="", hobby ="";

        name = JOptionPane.showInputDialog("Nama Anda: ");
        hobby = JOptionPane.showInputDialog("Hobi Anda: ");

        String msg = "Jadi, hobi Anda "+hobby+". "
                + "Hobi yang bagus "+name+"!";

        JOptionPane.showMessageDialog(null, msg);

        System.out.println("Jadi, hobi Anda "+hobby+". Hobi yang bagus "+name+"!");
    }
}
