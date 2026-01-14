
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class FIles1 {
    public static void main(String[] args) {
        //FLUJO DE SALIDA, OUPUT, ESCRITURA, PERSISTENCIA
        //Formatter nomVariable = new Formatter(new File("nombreArch.txt"));
        try {
            Formatter arcOut = new Formatter(new File("Saludo.csv"));
            arcOut.format("%s;%d", "Hola mundo", 10);
            arcOut.close();
            Scanner arcIn = new Scanner(new File("Saludo.txt"));
            Scanner arcInNotas = new Scanner(new File("datos.csv"));
            System.out.println(arcInNotas.nextLine());
            System.out.println(arcInNotas.nextLine());
        } catch (Exception e) {
            System.out.println("Error");
        }
        
        
    }
}
