public class PrimitivosEnteros {
    public static void main(String[] args){
        byte numeroByte = -128; //Byte usa entre -128 a < 128+
        System.out.println("numero Byte impreso :  " + numeroByte);
        System.out.println("tipo byte corresponde a byte a : " + Byte.BYTES);
        System.out.println("tipo byte corresponde en bites a : " + Byte.SIZE);
        System.out.println("valor máximo de un byte : " + Byte.MAX_VALUE);
        System.out.println("valor mínimo de un byte : " + Byte.MIN_VALUE);

        short numeroShort = 30000;
        System.out.println("numeroShort impreso :  " + numeroShort);
        System.out.println("tipo short corresponde a byte a : " + Short.BYTES);
        System.out.println("tipo short corresponde en bites a : " + Short.SIZE);
        System.out.println("valor máximo de un short : " + Short.MAX_VALUE);
        System.out.println("valor mínimo de un Short : " + Short.MIN_VALUE);

        int numeroEntero = 2147483647;
        System.out.println("numero Int impreso :  " + numeroEntero);
        System.out.println("tipo int corresponde a byte a : " + Integer.BYTES);
        System.out.println("tipo int corresponde en bites a : " + Integer.SIZE);
        System.out.println("valor máximo de un int : " + Integer.MAX_VALUE);
        System.out.println("valor mínimo de un int : " + Integer.MIN_VALUE);

        /**Superentero por defecto es tipo Integer (Entero) por eso se debe indicar que ya no es entero, sino del tipo long (64 bits)*/
        long numeroLong = 9223372036854775807L;
        System.out.println("numero Long impreso :  " + numeroLong);
        System.out.println("tipo LONG corresponde a byte a : " + Long.BYTES);
        System.out.println("tipo LONG corresponde en bites a : " + Long.SIZE);
        System.out.println("valor máximo de un LONG : " + Long.MAX_VALUE);
        System.out.println("valor mínimo de un LONG : " + Long.MIN_VALUE);

        //Definir una variable flexible => Soportada desde JDK >= 10
        var numeroVar = 127;
        var numeroVar2 = 30000;
        var numeroVar3 = 2147483647;
        var numeroVar4 = 2147483648L;
        var numeroVar5 = 21474836495555555555555F;
        //var siempre va a ser un entero, pero depende de la variable por default

    }
}
