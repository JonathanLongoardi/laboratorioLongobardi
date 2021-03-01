import java.util.HashMap;
import java.util.Map;

public class Libreria {

    private HashMap<String, Integer> librosVendidos;

    private String nombre;

    public Libreria() {
        this.librosVendidos = new HashMap<>();
        this.nombre = "equis";
    }
    public Libreria(String nombre){
        this.librosVendidos = new HashMap<>();
        this.nombre = nombre;
    }

    public Libreria(String nombre, HashMap<String,Integer> librosVendidos) {
        this.nombre = nombre;
        this.librosVendidos = librosVendidos;
    }

    public void agregarVenta(String nombre, Integer cantidadVendida){

        /*this.librosVendidos.put(nombre,cantidadVendida);*/
        Integer cantidadActual = librosVendidos.get(nombre);
        librosVendidos.put(nombre, cantidadVendida + cantidadActual);
    }

    public void imprimirVentas(){
        for (Map.Entry<String, Integer> Venta : librosVendidos.entrySet()){
            System.out.println("Nombre" + Venta.getKey());
            System.out.println("Cantidad" + Venta.getValue());
        }
    }


}






