import javax.swing.*;

public class SistemaNumerico {

    public static void main(String[] args){
        /**
         * Convertir el 500 en diferentes tipos numéricos
         */
        String numeroString = JOptionPane.showInputDialog(null, "Ingresa un numero");
        int numeroDecimal = 0;
        try{
            numeroDecimal = Integer.parseInt(numeroString);
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error. Ingrese un numero");
            main(args);
            System.exit(0);
        }

        System.out.println("Numero Decimal: " + numeroDecimal);

        String resultadoBinario = "Numero binario: " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println("Resultado Binario: " + resultadoBinario);

        int numeroBinario = 0b111110100;
        //0b para que interprete que es un numero binario
        System.out.println("Numero Binario: " + numeroBinario);

        String resultadoOctal = "Numero Octal: " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);

        System.out.println(resultadoOctal);

        int numeroOctal = 0764;
        System.out.println("Numero Octal: " + numeroOctal);

        String resultadoHexadecimal = "Numero Hexadecimal: " + numeroDecimal  + "= " + Integer.toHexString(numeroDecimal);
        System.out.println(resultadoHexadecimal);

        int numeroHexadecimal = 0x1f4;
        System.out.println("Numero Hexadecimal = " + numeroHexadecimal);

        String mensaje = resultadoBinario;
        mensaje +=  "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHexadecimal;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
