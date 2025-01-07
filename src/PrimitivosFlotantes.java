public class PrimitivosFlotantes
{
    /**
     * Punto flotante: Notación científica para trabajar y operar.
     * Permite almacenar números muy grandes.
     * La memoria es limitada.
     */
    static float varFlotante;

    public static void main(String[] args){
        float numeroFloat = 1;
        float numeroFloat2 = 1.0f;
        float numeroFloat3 = 2.12e3f; //sería igual a 2120
        float numeroFloat4 = 1.5e4f; //15000f (e4 exponente a la 10, 4 veces se corre la coma)
        float numeroFloat5 = 1.5e-2f; //es igual 0.015
        float numeroFloat6 = 1.5e-10f; //es igual a 0.00000000015

        System.out.println(numeroFloat);
        System.out.println(numeroFloat2);
        System.out.println(numeroFloat3);
        System.out.println(numeroFloat4);
        System.out.println(numeroFloat5);
        System.out.println(numeroFloat6);

        System.out.println("NUMERO FLOTANTES: " + numeroFloat);
        System.out.println("FLOAT corresponde en bytes a: " + Float.BYTES);
        System.out.println("FLOAT corresponde en bites a: " + Float.SIZE);
        System.out.println("MÁXIMO VALOR por FLOAT: " + Float.MAX_VALUE);
        System.out.println("MÍNIMO VALOR por FLOAT: " + Float.MIN_VALUE);

        double numeroDouble = 3.4028235E39;

        System.out.println("numero DOUBLE: "+ numeroDouble);
        System.out.println("DOUBLE corresponde en bytes a: " + Double.BYTES);
        System.out.println("DOUBLE corresponde en bites a: " + Double.SIZE);
        System.out.println("MÁXIMO VALOR por DOUBLE: " + Double.MAX_VALUE);
        System.out.println("MÍNIMO VALOR por DOUBLE: " + Double.MIN_VALUE);

        //var varFlotante = 3.1416;
        System.out.println("VARIABLE => VALOR POR DEFAULT: "+ varFlotante);
    }
}
