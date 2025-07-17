
data class Producto(val nombre: String, val cantidad: Int, val precio: Double)


class Inventario {
    private val productos = mutableListOf<Producto>()

    fun agregarProducto(nombre: String, cantidad: Int, precio: Double) {
        val producto = Producto(nombre, cantidad, precio)
        productos.add(producto)
        println("✅ Producto agregado: $producto")
    }

    fun mostrarInventario() {
        if (productos.isEmpty()) {
            println("🚫 El inventario está vacío.")
        } else {
            println("📦 Inventario actual:")
            for (p in productos) {
                println("🔹 Nombre: ${p.nombre}, Cantidad: ${p.cantidad}, Precio: $${p.precio}")
            }
        }
    }


    fun buscarProducto(nombreBuscado: String) {
        val encontrados = productos.filter { it.nombre.equals(nombreBuscado, ignoreCase = true) }
        if (encontrados.isEmpty()) {
            println("🔍 No se encontró ningún producto con el nombre '$nombreBuscado'.")
        } else {
            println("🔍 Productos encontrados:")
            for (p in encontrados) {
                println("🔹 Nombre: ${p.nombre}, Cantidad: ${p.cantidad}, Precio: $${p.precio}")
            }
        }
    }
}


fun main() {
    val inventario = Inventario()

    while (true) {
        println("\n--- MENÚ ---")
        println("1. Agregar producto")
        println("2. Mostrar inventario")
        println("3. Buscar producto por nombre")
        println("4. Salir")
        print("Seleccione una opción: ")

        when (readLine()?.toIntOrNull()) {
            1 -> {
                print("Ingrese el nombre del producto: ")
                val nombre = readLine() ?: ""
                print("Ingrese la cantidad: ")
                val cantidad = readLine()?.toIntOrNull() ?: 0
                print("Ingrese el precio: ")
                val precio = readLine()?.toDoubleOrNull() ?: 0.0
                inventario.agregarProducto(nombre, cantidad, precio)
            }
            2 -> inventario.mostrarInventario()
            3 -> {
                print("Ingrese el nombre a buscar: ")
                val nombre = readLine() ?: ""
                inventario.buscarProducto(nombre)
            }
            4 -> {
                println("👋 ¡Hasta luego!")
                break
            }
            else -> println("❌ Opción inválida, intente de nuevo.")
        }
    }
}
