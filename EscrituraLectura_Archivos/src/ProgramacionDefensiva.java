import java.util.InputMismatchException;
import java.util.Scanner;
public class ProgramacionDefensiva {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int n1, n2, respuesta;
        System.out.print("Dame 2 #: ");
        try {
            n1 = tcl.nextInt();
            n2 = tcl.nextInt();
            respuesta = n1 / n2;
            System.out.println("Respuesta = " + respuesta);
        } catch (InputMismatchException e) {
            System.out.println("ERROR DE ENTRADA");
        } catch (ArithmeticException e) {
            System.out.println("ERROR DE DIVISION PARA CERO");
        } 
    
    }
}
