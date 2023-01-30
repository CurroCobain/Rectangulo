
fun main(args: Array<String>) {
    val pieza1 = Producto("muelle", 0, 1.5)
    val pieza2 = Producto("Tijeras", 0, 2.5)
    pieza1.resumen()
    pieza1.pedirNombre()
    pieza1.pedirPrecio()
    pieza1.resumen()
    pieza2.resumen()
    pieza2.pedirNombre()
    pieza2.pedirPrecio()
    pieza2.resumen()

    val inventario = Inventario(mutableListOf(pieza2,pieza1))
    inventario.muestraInventario()
    pieza1.igual(pieza2)
}




