public class App {
  public static void main(String[] args) throws Exception {
    System.out.println("Hola, Bienvenido!");

    Maquina maquina = new Maquina(0);

    Producto producto1 = new Producto("A1", "Galletas", 1.5, 10);
    Producto producto2 = new Producto("B2", "Chocolates", 2.0, 5);
    Producto producto3 = new Producto("C3", "Gaseosas", 1.0, 8);

    maquina.cargarProducto(producto1);
    maquina.cargarProducto(producto2);
    maquina.cargarProducto(producto3);

    Persona persona1 = new Persona("Juan", 10.0);

    maquina.mostrarProductos();
    maquina.seleccionarProducto("A1", persona1);

    maquina.insertarDinero(2.0);

    persona1.recibirProducto(producto1);

    System.out.println("Gracias por su compra. ¡Hasta luego!");

  }
}
