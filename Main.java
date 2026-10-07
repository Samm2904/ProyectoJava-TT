import exception.ProductoNoEncontradoException;
import exception.StockInsuficienteException;
import java.util.Scanner;
import model.Producto;
import service.ProductoService;
import ui.MenuProducto;
import util.Validador;

public class Main {
    public static void main(String[] args) {
        ProductoService service = new ProductoService();
        Scanner sc = new Scanner(System.in);
        MenuProducto menu = new MenuProducto(sc, service);
        cargarDatosDePrueba(service);
        int opcion;

        do {
            menu.mostrarMenu();
            opcion = Validador.leerEntero(sc, "Elija una opción: ");

            try {
                switch (opcion) {
                    case 1 -> menu.agregarProducto();
                    case 2 -> menu.listarProductos();
                    case 3 -> menu.buscarProducto();
                    case 4 -> menu.actualizarProducto();
                    case 5 -> menu.eliminarProducto();
                    case 6 -> System.out.println("Nos vemos.");
                    default -> System.out.println("Opción inválida. Elija un número del 1 al 6.\n\r");
                }
            } catch (ProductoNoEncontradoException | StockInsuficienteException e) {
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

        } while (opcion != 6);

        sc.close();

    }

    private static void cargarDatosDePrueba(ProductoService service) {
        service.guardar(new Producto("Taza de cerámica 'Espresso'", 9000, 10, "Bazar"));
        service.guardar(new Producto("Cardigan 'Folklore'", 55000, 2, "Ropa"));
        service.guardar(new Producto("Vinilo 'Midnights' Jade Grey de Taylor Swift", 50000, 15, "Música"));
        System.out.println("Se cargaron 3 productos.\n");
    }
}