package ni.com.palindroma;
import ni.com.palindroma.utilidades.Oracion;

/**
 * Hello world!
 *
 */
public class App 
{


    public static void main(String[] args) {
        Oracion averiguaOracion = new  Oracion("Se laminan animales");
        String mensajeResultado = averiguaOracion.getResultado();
        System.out.println(mensajeResultado);
    }


}
