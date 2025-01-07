public class SistemaNumerico {

    public static void main(String[] args){
        /**
         * Convertir el 500 en diferentes tipos numéricos
         */

        int numeroDecimal = 500;

        System.out.println("Numero Deciman" + numeroDecimal);

        System.out.println("Numero binario" + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));

        int numeroBinario = 0b111110100; //0b para que interprete que es un numero binario
        System.out.println("Numero Binario" + numeroBinario);

        System.out.println("Numero Octal" + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal));

        int numeroOctal = 0764;
        System.out.println("Numero Octal" + numeroOctal);

    }



}
