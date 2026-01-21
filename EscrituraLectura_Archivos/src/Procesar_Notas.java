import java.io.File;
import java.util.Scanner;

public class Procesar_Notas {
    public static void main(String[] args) {
        String datosNotas [][] = LeerArchivo_Matriz("NotasIn.csv", 11, 3);
        
    }
    
    public static String [][] LeerArchivo_Matriz(String nombreArchivo, int m, int n){
        String datos[][] = new String[m][n];
        try {
            Scanner fin = new Scanner(new File(nombreArchivo));
            fin.nextLine();
            int i = 0;
            while(fin.hasNext()){
                String linea = fin.nextLine();
                String notas[] = linea.split(";");
                datos[i][0] = notas[0]; //Nomb. Est.
                datos[i][1] = notas[1]; //Nota1 
                datos[i][2] = notas[2]; //Nota2
                i++;
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
        return datos;
    }
}
