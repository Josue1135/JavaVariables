public class EjemploStringValidar {
    public static void main(String[] args) {
        String curso = null;

        boolean esNulo = curso == null;

        System.out.println("Es nulo = " + esNulo);

        /**
         * Cuando un objeto null -> a pesar de que se ejecuta métodos puede lanzar un error al ejecutar
         */
        if(esNulo) {
            curso = "Programación Java";
        }
        System.out.println(curso.toUpperCase());
        //System.out.println("Bienvenido al curso ".concat(curso));
        System.out.println("Bienvenido al curso " + curso);
    }
}
