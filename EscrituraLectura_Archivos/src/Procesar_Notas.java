import java.io.File;
import java.util.Scanner;

public class Procesar_Notas {
    public static void main(String[] args) {
        String datosNotas [][] = LeerArchivo_Matriz("NotasIn.csv", 11, 6);
    }
    
    public static String [][] LeerArchivo_Matriz(String nombreArchivo, int m, int n){
        String datos[][] = new String[m][n];
        try {
            Scanner fin = new Scanner(new File(nombreArchivo));
        } catch (Exception e) {
            System.out.println("Error");
        }
        return datos;
    }
}
