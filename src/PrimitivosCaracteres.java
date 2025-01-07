public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter = '\u0040';
        char decimal = 64;
        System.out.println("Carácter: "+caracter);
        System.out.println("Decimal: "+decimal);
        System.out.println("Decimal = carácter: "+(decimal == caracter));
        char simbolo = '@';
        System.out.println("Simbolo: "+simbolo);
        System.out.println("Símbolo = caracter: "+ (simbolo == caracter));

        char espacio = ' ';
        char espacioUnicode = '\u0020';
        char retroceso = '\b';
        char tabulador  = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';

        System.out.println("Char: " + caracter);
        System.out.println("Char \bcorresponde en byte a" + System.lineSeparator()+ Character.BYTES);
        System.out.println("Char corresponde a bites a:" +Character.SIZE);
        System.out.println("Char \t mínimo valor :" +  Character.MIN_VALUE);
        System.out.println("Char \rmáximo valor: " + Character.MAX_VALUE);
    }
}
