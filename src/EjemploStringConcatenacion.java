public class EjemploStringConcatenacion {

    public static void main(String[] args) {
        //Creando objeto tipo String -> tipo especial
        String curso = "Programación Java"; //se crea por default
        String profesor = "Josue";

        String detalle = curso + " con el instructor " + profesor;
        System.out.println(detalle);

        int numberA = 20;
        int numberB = 50;

        /**
         *
         * asume que todo es una cadena
         */
        System.out.println(detalle + numberA + numberB);

        System.out.println(detalle + (numberA + numberB));

        System.out.println(numberA  + numberB + detalle);

        String detalle2 = curso.concat(profesor);
        String detalle3 = curso.concat(" ". concat(profesor));
        System.out.println(detalle2);
        System.out.println(detalle3);

        /**
         * String son inmutable, no cambia
         * Concat => no modifica el curso sino retorna otro String  y se le asigna a detalle2
         */

    }
}