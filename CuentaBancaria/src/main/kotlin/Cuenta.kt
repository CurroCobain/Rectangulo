class Cuenta(numcuenta:String, saldo: Int) {
    var numcuenta = numcuenta
        get():String {
            return field
        }
        set(valor: String) {
            if (valor.length > 10) {
                println("Número de cuenta erróneo ")
            } else {
                field = valor
            }
        }
    var saldo = saldo
        get() {
            return field
        }
        set(valor: Int) {
            if (valor < 0){
                println("Saldo nulo o negativo en la cuenta ${this.numcuenta}")
                field=valor
            }else{
                field=valor
            }
        }

    fun transferencia(cuentaDestino: Cuenta, importeTransf: Int) {
        cuentaDestino.saldo += importeTransf
        this.saldo -= importeTransf
        println("la cuenta ${cuentaDestino.numcuenta} ha recibido una transferencia de la cuenta ${this.numcuenta} por importe de $importeTransf euros")
    }
    fun ingreso( importeRecibido: Int) {
        this.saldo += importeRecibido
        println("Ha recibido un ingreso en su cuenta ${this.numcuenta} por valor de $importeRecibido euros")
    }
    fun pagos(importePagado: Int) {
        this.saldo -= importePagado
        println("Ha realizado un pago con su cuenta ${this.numcuenta} por valor de $importePagado euros")
    }

    override fun toString(): String {
        return "Numero de cuenta='$numcuenta' saldo=$saldo euros"
    }
}
