
class carta(numero: Int, palo: Char) {
    var numero=numero
        get():Int{
           return field
        }
        set(valor:Int){
            if (valor in 1..13)
                field=valor
        }
    var palo=palo
        get(): Char{
            return field
        }
        set(valor:Char){
            when (valor){
                'c','d','p','t'->field=valor
            }
        }
    constructor(otra: carta): this(otra.numero, otra.palo){
    }
    override fun toString(): String{
        var palomostrar=""
        when (palo){
            'c'-> palomostrar="corazones"
            't'-> palomostrar="tréboles"
            'd'-> palomostrar="diamantes"
            'p'-> palomostrar="picas"
        }
        var numeromostrar=""
        when(numero){
            in 2..10-> numeromostrar=numero.toString()
            1->numeromostrar="As"
            11->numeromostrar="Jota"
            12->numeromostrar="Dama"
            13->numeromostrar="Rey"
        }
        return "La carta $numeromostrar de $palomostrar"
    }
    fun comparaCartas(otra: carta) {
        if (this.numero > otra.numero) {
            println("La carta mayor es: ${ this.toString()}")

        } else if(this.numero==otra.numero){
            if (this.palo > otra.palo){
                println("La carta mayor es: ${this.toString()}")
            }else if(this.palo==otra.palo){
                println("Las cartas son iguales ")
            }else{
                println("La carta mayor es:${otra.toString()}")
            }
        } else {
            println("La carta mayor es: ${otra.toString()} ")
        }
    }
}