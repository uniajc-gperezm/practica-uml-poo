public class Persona {
  private String nombre;
  private double dinero;

  public Persona(String nombre, double dinero) {
    this.nombre = nombre;
    this.dinero = dinero;
  }

  public void recibirProducto(Producto producto) {
    System.out.println(nombre + " ha recibido el producto: " + producto.getNombre());
  }

  public void recibirCambio(double cambio) {
    dinero = dinero - cambio;
    System.out.println(nombre + " ha recibido un cambio de: " + dinero);
  }
}