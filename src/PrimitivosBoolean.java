public class PrimitivosBoolean {
    public static void main(String[] args) {
        boolean datoLogico = true; //Boolean.FALSE.booleanValue();
        System.out.println("Datos Bool: "+datoLogico);

        double valor = 93258.147e-3; //93.258147
        float valorFloat = 93.258147e2f; //9325.8147

        datoLogico = valor > valorFloat;
        System.out.println(valor);
        System.out.println(valorFloat);
        System.out.println("Datos Bool: "+datoLogico);

        boolean esIGual = 3-2 == 1;
        System.out.println("Es igual: "+esIGual);

    }
}
