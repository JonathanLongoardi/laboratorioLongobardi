import java.util.HashMap;

public class Pruebas {

    public static void main(String[] args) {
        HashMap<String, Integer> ejemplo = new HashMap<>() ;

        ejemplo.put ("a",1);

        HashMap<String, Integer> libros = new HashMap<>();

        libros.put("equiscuatro", 1);


        Libreria l1 = new Libreria("Martin", libros);
        Libreria l2 = new Libreria();

        /*l1.agregarVenta("equis2", 100);*/

        l1.agregarVenta("equiscuatro", 60);
        l1.agregarVenta("equiscuatro", 23);

        l1.imprimirVentas();

    }



}
