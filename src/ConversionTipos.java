import java.sql.SQLOutput;

public class ConversionTipos {
    public static void main(String[] args) {


        /**
         * Conversiones tipo String a un tipoPrimitivo
         */
        String numeroStr = "50";
        int numerInt = Integer.parseInt(numeroStr);
        System.out.println("Numero: " + numerInt);

        String numeroStr2 = "2010.152525";
        double realNum = Double.parseDouble(numeroStr2);
        System.out.println("Real: " + realNum);

        String numeroStr3 = "2342.322564e-3";
        double realNum2 = Double.parseDouble(numeroStr3);
        System.out.println("Real: " + realNum2);

        String logicoCadena = "true";
        boolean logicoCadenaBool = Boolean.parseBoolean(logicoCadena);
        System.out.println("LogicoCadena: " + logicoCadenaBool);

        /**
         * Conversion de tipo primitivo a String
         */
        int otroNumeroInt = 100;
        System.out.println("otroNumeroInt: " + otroNumeroInt);

        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr: " + otroNumeroStr);

        otroNumeroStr = String.valueOf(otroNumeroInt + 10);
        System.out.println("otroNumeroStr: " + otroNumeroStr);

        double otroRealDouble = 125.125;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr: " + otroRealStr);

        /**
         * Convertimos un float en un String
         */
        otroRealStr = String.valueOf(1.23456f);
        System.out.println("otroRealStr: " + otroRealStr);

        /**
         * Conversion: Primitivos a Primitivos => Solo a números reales incluye: int, float, double, char
         * Para tener en cuenta: Se debe convertir a los tipos de datos que soporten el valor
         * porque si no existiría la posibilidad de perdida de datos.
         *
         * Un carácter también se puede convertir, ya que está mapeado en la tabla unicode en un valor numérico.
         */

        int i = 10000;
        short s = (short) i;
        System.out.println("s = " + s);
        long l = i;
        System.out.println("l = " + l);
        //No arroja error porque está dentro del valor soportado
        //VER CLASE PRIMITIVOS ENTEROS
        char c = (char)i;
        System.out.println("b = " + c);
        float f = (float)i;
        System.out.println("f = " + f);



    }
}

