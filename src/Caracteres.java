public class Caracteres {
    public static void main(String[] args) {
        char caracter = '\u0040';
        char decimal = 64;
        System.out.println("Carácter: "+caracter);
        System.out.println("Decimal: "+decimal);
        System.out.println("Decimal = carácter: "+(decimal == caracter));
        char simbolo = '@';
        System.out.println("Simbolo: "+simbolo);
        System.out.println("Simbolo = caracter: "+ (simbolo == caracter));

        System.out.println("Char: " + caracter);
        System.out.println("Char corresponde en byte a : " + Character.BYTES);
        System.out.println("Char corresponde a bites a: " + Character.SIZE);
        System.out.println("Char minimo valor: " + Character.MIN_VALUE);
        System.out.println("Char maximo valor: " + Character.MAX_VALUE);
    }
}
