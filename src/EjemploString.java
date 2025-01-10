public class EjemploString {

    public static void main(String[] args) {
        //Creando objeto tipo String -> tipo especial
        String curso = "Programación Java"; //se crea por default
        String curso2 = new String("Programación Java"); //Se crea de forma explicita

        //Comparando por la instancia / referencia objeto =>
        boolean esIgual = curso == curso2;
        System.out.println("curso == curso2 = " +esIgual);
        //Comparando por el valor / atributo => equals
        esIgual = curso.equals(curso2);
        System.out.println("curso.equals(curso2) = " +esIgual);

        //Es true, pero cambié el acento en Programación y me arroja ahora falso.
        String curso3 = "Programación Java";
        esIgual = curso.equalsIgnoreCase(curso3); //Ignorando
        System.out.println("curso.equalsIgnoreCase(curso3) = " +esIgual);

        String curso4 = "Programación Java";
        esIgual = curso == curso4;
        System.out.println("curso.equalsIgnoreCase(curso3) = " +esIgual);
    }
}
