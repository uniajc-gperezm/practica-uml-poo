import java.util.HashMap;
import java.util.Map;

public class Maquina {
    Map<String, Producto> inventario = new HashMap<>();
    private double dineroIngresado; 

    public Maquina(double dineroIngresado) {
        this.dineroIngresado = dineroIngresado;
    }

    public void cargarProducto(Producto producto) {
        inventario.put(producto.getNombre(), producto);
    }

    public mostrarProductos(){
        for (Producto producto : inventario.values()) {
            System.out.println("Producto: " + producto.getNombre() + ", Precio: " + producto.getPrecio() + ", Cantidad: " + producto.getCantidad());
        }

    }

    public void seleccionarProducto(String nombreProducto, Persona persona) {
        Producto producto = inventario.get(nombreProducto);
        if (producto != null && producto.getCantidad() > 0) {
            if (persona.getDinero() >= producto.getPrecio()) {
                persona.setDinero(persona.getDinero() - producto.getPrecio());
                dineroIngresado += producto.getPrecio();
                producto.setCantidad(producto.getCantidad() - 1);
                System.out.println("Has comprado: " + producto.getNombre());
            } else {
                System.out.println("No tienes suficiente dinero.");
            }
        } else {
            System.out.println("Producto no disponible.");
        }
    }
}
