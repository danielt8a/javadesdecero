class Condicionales{
    public static void main(String[] args){
        //Condicionales se ejecutan con la palabra reservada if

        int edad = 33;

        if (edad > 0){
            if (edad < 16){
                System.out.println("Estás en la niñez");
            }else{
                if(edad > 16){
                    if (edad < 18){
                        System.out.println("Estás en la adolescencia");
                    }else {
                        if (edad > 18){
                            System.out.println("Eres mayor de edad");
                        }
                    }

                }
            }
        } 
    }
}