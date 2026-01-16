import java.io.File;
import java.util.Formatter;
import java.util.Random;
import java.util.Scanner;
public class Files2 {
    public static void main(String[] args) {
        Random r = new Random();
        String nombres [] = {"Jonathan", "Rosa", "Adrian", "Maria"};
        String apellidos [] = {"Suarez", "Velez", "Carrion", "Montaño"};
        try {
            Formatter arcOut = new Formatter(new File("registroNotas.csv"));
            arcOut.format("%s;%s;%s;\n", "Nom Apel","NB1","NB2");
            for (int i = 0; i < 1000000; i++) {
                arcOut.format("%s;%d;%d;\n", nombres[r.nextInt(3)] + " " + apellidos[r.nextInt(3)]
                                         , r.nextInt(10), r.nextInt(10));
            }
            arcOut.close();
            Scanner archivoNotasEntrada = new Scanner(new File("registroNotas.csv"));
            Formatter arcNotasSalida = new Formatter(new File("RegistoNotasFinales.csv"));
            arcNotasSalida.format("%s;%s;%s;%s;%s;\n", "Nom Apel","NB1","NB2","PROM","EST");
            archivoNotasEntrada.nextLine();
            while(archivoNotasEntrada.hasNext()){
                String linea = archivoNotasEntrada.nextLine();
                String notas [] = linea.split(";");
                int nb1 = Integer.parseInt(notas[1]);
                int nb2 = Integer.parseInt(notas[2]);
                double promedio = (nb1 + nb2) / 2;
                String estado = (promedio >= 7) ? "Aprobado" : "Reprobado" ;
                arcNotasSalida.format("%s;%s;%s;%.2f;%s;\n",notas[0],notas[1],notas[2],promedio,estado);
            }
            arcNotasSalida.close();
        } catch (Exception e) {
            System.out.println("ERROR");
        }
        
    }
}
