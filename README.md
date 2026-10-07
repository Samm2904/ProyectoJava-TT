# Pre-Entrega para BackEnd - Java | Talento Tech

Aplicación de consola en Java para gestionar productos mediante operaciones CRUD (crear, listar, buscar, actualizar y eliminar).

## Características

- Alta de productos con validaciones.
- Listado completo de productos cargados.
- Búsqueda de producto por ID.
- Actualización de datos de productos existentes.
- Eliminación de productos.
- Manejo de errores con excepciones personalizadas.
- Carga inicial de datos de ejemplo al iniciar la app.

## Estructura del proyecto

- `Main.java`: punto de entrada y flujo principal del programa.
- `model/Producto.java`: entidad de producto.
- `service/ProductoService.java`: lógica de negocio y operaciones CRUD.
- `ui/MenuProducto.java`: interacción por consola con el usuario.
- `util/Validador.java`: validaciones y lectura segura de datos.
- `exception/`: excepciones personalizadas del dominio.

## Requisitos

- Java 17 o superior.

## Compilar y ejecutar

Desde la raíz del repositorio:

```bash
javac Main.java model/*.java service/*.java ui/*.java util/*.java exception/*.java
java Main
```

## Uso

Al ejecutar, se cargan 3 productos de prueba y se muestra un menú con opciones numeradas:

1. Agregar producto  
2. Listar productos  
3. Buscar producto por ID  
4. Actualizar producto  
5. Eliminar producto  
6. Salir

Seguir las instrucciones en pantalla para operar el catálogo.
