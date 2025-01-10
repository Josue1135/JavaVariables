/**
 * String son inmutable, no cambia
 * Concat => no modifica el curso sino retorna otro String  y se le asigna a detalle2
 */

public class EjemploStringInmutable {

    public static void main(String[] args) {
        //Creando objeto tipo String -> tipo especial
        String curso = "Programación Java"; //se crea por default
        String profesor = "Josue";


        //Concatena, pero en el objeto curso al objeto profesor
        //concat retorna una instancia o nuevo objeto; no altera ni modifica a curso
        //por eso creamos un objeto resultado
        String resultado = curso.concat(profesor);
        System.out.println("curso = " +curso);
        System.out.println("Resultado = " +resultado); //nueva instancia nuevo objeto resultado
        System.out.println(curso == resultado);

        //Transfor=> para transformar , convertir una String
        String resultado2 = curso.transform(c -> {
            return c + " con "  + profesor;
        });
        System.out.println("curso = " +curso);
        System.out.println("Resultado = " +resultado2);

        String resultado3 = resultado2.replace("a", "A");
        System.out.println("Resultado 3 =" +resultado3);
    }
}