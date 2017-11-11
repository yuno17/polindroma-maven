package ni.com.polindroma;

public class Main {

    public static void main(String[] args) {
	// write your code here
        AveriguaPalabra averiguaOracion = new AveriguaPalabra("Se laminan animales");
        String mensajeResultado = averiguaOracion.getResultado();
        System.out.println(mensajeResultado);
    }
}
