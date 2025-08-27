
public class Producto {
  private String codigo;
  private String nombre;
  private double precio;
  private int cantidad;

  public Producto(String codigo, String nombre, double precio, int cantidad) {
    this.codigo = codigo;
    this.nombre = nombre;
    this.precio = precio;
    this.cantidad = cantidad;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void dispensar() {
    System.out.println("Dispensando " + nombre);
  }

}