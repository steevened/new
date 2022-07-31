public class ne {
    public static void  main(String[] args) {

        int numero = 0;


        if (numero > 0) {
            System.out.println("positivo");
        } else if (numero < 0) {
            System.out.println("negativo");
        } else {
            System.out.println("cero");
        }



        while (numero < 3) {
            System.out.println(numero);
            numero++;
        }



        do {
            System.out.println(numero);
            numero++;
        } while (numero < 3);




        for (int i = 0; i <= 3; i++) {
            System.out.println(i);
        }




        var estacion = "otoño";

        switch (estacion) {
            case "invierno":
                System.out.println("Es invierno");
                break;
            case "verano":
                System.out.println("es verano");
                break;
            case "otoño":
                System.out.println("es otoño");
                break;
            case "primavera":
                System.out.println("es primavera");
                break;
            default:
                System.out.println("Ningunna estación");
                break;

        }


    }
}
