import java.io.File;
import java.util.Random;
import java.util.Scanner;

public class Procesar_Notas {
    public static void main(String[] args) {
        String notasIn [][] = leerArchivo_Matriz("NotasIn.csv", 10, 3);
        String notasOut [][] = procesarNotas_Matriz(notasIn, 3);
        for (int i = 0; i < notasOut.length; i++) {
            for (int j = 0; j < notasOut[0].length; j++) {
                System.out.print(notasOut[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public static void persistirResultados(String nombreArchivoOut, String notasIn [][], String notasOut [][]){
    }
    public static String [][] procesarNotas_Matriz(String datosNotas[][], int n){
        String datosOut[][] = new String[datosNotas.length][n];
        Random ale = new Random();
        for (int i = 0; i < datosNotas.length; i++) {
            double promedio = (Double.valueOf(datosNotas[i][1]) + Double.valueOf(datosNotas[i][2])) / 2;
            double suple = (promedio < 6.5) ? ale.nextDouble(10) : 0 ;
            String estado = (promedio >= 6.5) ? "Aprobado" : (suple >= 6.5) ? "Aprobado": "ReProbado" ;
            datosOut[i][0] = String.format("%.2f", promedio); 
            datosOut[i][1] = String.format("%.2f", suple); 
            datosOut[i][2] = estado; 
        }
        return datosOut;
    }
    public static String [][] leerArchivo_Matriz(String nombreArchivo, int m, int n){
        String datos[][] = new String[m][n];
        try {
            Scanner fin = new Scanner(new File(nombreArchivo));
            fin.nextLine();
            int i = 0;
            while(fin.hasNext()){
                String notas[] = fin.nextLine().split(";");
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
