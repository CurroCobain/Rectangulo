class Inventario(list:MutableList<Producto>) {
    var invent=list

    fun muestraInventario() {
        for (prod in invent) {
            println(prod.resumen())
        }
    }
}