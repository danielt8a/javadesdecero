public class Hola2 {
    public static void main(String args[]){

        // Con la palabra reservada final es como creamos una constante

        final int noCambia = 9;

        int a = 8, b = 10, r = 3;

        r = a + b;

        System.out.println(r);
        System.out.println("El valor de mi constante noCambia es: " + noCambia);

    }
}