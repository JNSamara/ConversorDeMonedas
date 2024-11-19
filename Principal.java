import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultarMoneda consulta = new ConsultarMoneda();

//      Prueba de URL y recepcion de datos
//        Moneda moneda = consulta.buscarmoneda("USD", "MXN");
//        System.out.println(moneda);
//        System.out.println();

        int opcion = 0;
        while (opcion != 9){
            System.out.println( """
                 **********************************************
                Este es un coversor de monedas, Bienvenido.
                 **********************************************
                
                1) Dolar ==> Peso Mexicano
                2) Peso Mexicano ==> Dolar
                3) Dolar ==> Sol Peruano
                4) Sol Peruano ==> Dolar
                5) Dolar ==> Peso Argentino
                6) Peso Argentino ==> Dolar
                
                9) Salir
                 **********************************************
                          create by: JN Samara
                 **********************************************          
                Elijan una opcion valida.
                 **********************************************
                """);
            opcion = lectura.nextInt();
            lectura.nextLine();

            switch (opcion){
                case 1:
                    ConvertirMoneda.convertir ("USD","MXN",consulta,lectura);
                    break;
                case 2:
                    ConvertirMoneda.convertir ("MXN","USD", consulta, lectura);
                    break;
                case 3:
                    ConvertirMoneda.convertir ("USD","PEN",consulta,lectura);
                    break;
                case 4:
                    ConvertirMoneda.convertir ("PEN","USD", consulta, lectura);
                    break;
                case 5:
                    ConvertirMoneda.convertir ("USD","ARS",consulta,lectura);
                    break;
                case 6:
                    ConvertirMoneda.convertir ("ARS","USD", consulta, lectura);
                    break;
                case 9:
                    System.out.println("Finalizando el programa. \n " +
                            "Muchas gracias por ver mi proyecto.");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }
}// proyecto de JN Samara