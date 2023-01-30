import kotlin.random.Random

class Producto(nomb: String, ser: Int, pre: Double ) {
    private var nombre= nomb
        get():String{
            return field
        }
        set(valor: String){
            if (valor is String){
                field=valor
            }else{
                println("El nombre introducido no es válido, por favor introduzca un nombre de tipo 'String'")
            }
        }
    private var serie= ser
        get():Int{
            return field
        }
        set(valor: Int){
            if (valor in 1..100000){
                field=valor
            }
        }
    private var precio= pre
        get():Double{
            return field
        }
        set(valor:Double){
            if (valor>0.0){
                field=valor
            }else{
                println("Por favor, introduzca el precio con dos decimales. ")
            }
        }
    init {
        this.serie=aleatorio()
    }
    constructor(nomb: String,pre: Double):this(nomb,0, pre){
        this.serie=aleatorio()
    }
    private fun aleatorio(): Int{
        val random= Random
        return random.nextInt (100000) +1
    }
    fun pedirNombre(){
        println("Introduzca el nombre del producto: ")
        this.nombre= readln().toString()
        while(!this.nombre.all { it.toInt() in 65..122 }){
            println("Nombre erróneo, por favor introduzca un nombre correcto: ")
            this.nombre= readln().toString()
        }
    }
    fun igual(name:Producto){
        if(this.nombre == name.nombre){
            if (this.serie == name.serie){
                if (this.precio == name.precio){
                    println("los productos son iguales ")
                }else{
                    println("los dos productos son diferentes ")
                }
            }else{
                println("los dos productos son diferentes ")
            }
        }else{
            println("los dos productos son diferentes ")
        }

    }
    fun pedirPrecio(){
        println("Introduzca el nuevo precio del producto: ")
        this.precio= readln().toDouble()
        while(this.precio<0){
            println("Precio erróneo, el precio deber ser superior a 0 ")
            this.precio= readln().toDouble()
        }
    }
    fun resumen(){
        println("""
                 INFORME DEL PRODUCTO
            -------------------------------
            Nombre: ${this.nombre}
            Número de serie: ${this.serie}
            Precio: ${this.precio}
        """.trimIndent())
    }
}