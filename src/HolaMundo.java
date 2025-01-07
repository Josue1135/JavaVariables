public class HolaMundo {

    public static void main(String[] args) {
        String mensaje = "Hola Mundos";
        System.out.println(mensaje.toUpperCase());
        int numero = 20;
        System.out.println("Mi edad en valor entero o int: " + numero);
        Integer numerose = 3;
        System.out.println("Valor Integer numero: "+numerose);
        float numbers = 3.14185f;
        System.out.println("Valor Float numero: "+numbers);

        int edad = 15;

        if(edad < 18){
            System.out.println("Mi edad es menor de 18");
        }else{
            System.out.println("Mi edad es mayor de 18");
        }

        //Nueva forma de crear variables
        var nombreVariable = 20;
        System.out.println("Nombre del variable: "+nombreVariable);

        //REGLAS PARA DEFINIR VARIABLES
        String nombre;
        nombre = "Josue";
        //nt valorVariable = 20;

        if(numero < 10){
            //System.out.println("Nombre: "+nombre);
            nombre = "Moroni";
        }//else{
           // System.out.println("Desconocido");
        //}
        System.out.println("nombre: "+nombre);
    }
}

