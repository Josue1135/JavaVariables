public class EjemploStringTestRendimientoConcat {

    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;


        StringBuilder sb = new StringBuilder(a);

        long inicio = System.currentTimeMillis();

        /**
         * Repite "n" veces para ver cuanto se demora
         */
        for(int i = 0; i < 100000; i++){
            //c = c.concat(a).concat(b).concat("\n"); //500 veces => 2 ms || 1000 veces : 209 ms || 100,000 veces => 6952 ms
            //c += a + b + "\n";  //500 veces => 15ms || 1000 veces => 21 ms || 10000 veces : 86 ms || 100,000 veces => 2782 ms

            sb.append(a).append(b).append("\n");  //1000 veces: 0 ms || 10,000 veces => 2 ms || 1000 veces : 8 ms || 100,000 veces => 16 ms
        }

        long fin = System.currentTimeMillis();

        System.out.println(fin - inicio);
        System.out.println("C = " +c);
        System.out.println("sb = " +sb.toString());




    }
}