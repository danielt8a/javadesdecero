class Operadores {

    public static void main(String[] args){

        // Asignación
        int a = 2;

        int b;

        b = 2 + 2 + 3;

        System.out.println("El valor de la variable b es: "+b);

        // Preincremento

        int i = 0;

        ++i;

        //PostIncremento

        int c = 0; c++;

        System.out.println("El valor de la variable i es: "+i);
        System.out.println("El valor de b es: "+b);

        //Preincremento vs PostIncremento

        int x = 3;
        int y = 2;

        //Comenzamos con preIncremento

        // int z = x * ++y;

        int z = x * y++;

        System.out.println("El valor de x es: " + x);
        System.out.println("El valor de y es: " + y);
        System.out.println("El valor de z es: "+ z);

        // Nunca utilicen preincremento o postincremento dentro de una asignación:
        // Forma correcta

        // b++;
        // int c = a * b;

        // Operadores aritméticos

        /* int o = 3 + 3 * 3 - 3;

        System.out.println(o);
 */
        //Operadores lógicos
        // Y, O
        // Tabla de verdad

        

    }
    

    
}