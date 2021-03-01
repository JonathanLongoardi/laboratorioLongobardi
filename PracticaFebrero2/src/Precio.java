import java.util.HashMap;
import java.util.Map;

public class Precio {
    private HashMap<String, Integer> precios;

    public Integer importeTotal (HashMap<String,Integer> compra){
        Integer total=0;
        for(Map.Entry<String,Integer> articulo : compra.entrySet()){
            Integer precioLibro = precios.get(articulo.getKey());
            Integer precioParcial = precioLibro * articulo.getValue();
            total = total + precioParcial;
        }
        return total;
    }
}
