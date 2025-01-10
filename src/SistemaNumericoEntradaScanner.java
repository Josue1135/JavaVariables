import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemaNumericoEntradaScanner {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un numero: ");
        //String numeroString = sc.nextLine();

        int numeroDecimal = 0;

        try{
            numeroDecimal =sc.nextInt(); //Integer.parseInt(numeroString);
        }catch (InputMismatchException e){
            System.out.println("Error. Ingrese un numero");
            main(args);
            System.exit(0);
        }

        System.out.println("Numero Decimal: " + numeroDecimal);

        String resultadoBinario = "Numero binario: " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);

        String resultadoOctal = "Numero Octal: " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);

        String resultadoHexadecimal = "Numero Hexadecimal: " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);


        String mensaje = resultadoBinario;
        mensaje +=  "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHexadecimal;
        System.out.println(mensaje);
    }
}
