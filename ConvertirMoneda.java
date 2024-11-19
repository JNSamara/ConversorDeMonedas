import java.util.Scanner;

public class ConvertirMoneda {
    public static void convertir(String monedaBase, String monedaTarget, ConsultarMoneda consulta, Scanner lectura){
        double cantidad;
        double cantidadResultado;

        Moneda moneda = consulta.buscarmoneda(monedaBase, monedaTarget);
        System.out.println(moneda.base_code());
        System.out.println(moneda.target_code());
        System.out.println(moneda.conversion_rate());
        System.out.println("la tasa de conversion para hoy es: "+ monedaBase+" = " + moneda.conversion_rate()+" "+monedaTarget);
        System.out.println("Ingrese la cantidad a consultar \n");
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadResultado = cantidad * moneda.conversion_rate();
        System.out.println(cantidad+" "+monedaBase+" = "+cantidadResultado+" "+ moneda.target_code());
    }
}
