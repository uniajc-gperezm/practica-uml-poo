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

  public void mostrarProductos() {
    System.out.println("Productos disponibles:");
    for (Producto producto : inventario.values()) {
      System.out.println("- " + producto.getNombre());
    }
  }

  public void seleccionarProducto(String codigo, Persona persona) {

    // Lógica para seleccionar un producto
    System.out.println("Producto seleccionado.");
  }

  public void insertarDinero(double cantidad) {
    dineroIngresado += cantidad;
    System.out.println("Dinero ingresado: " + dineroIngresado);
  }
}