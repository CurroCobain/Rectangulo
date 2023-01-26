class Alumno(dni: String, edad: Int){
    var dni=dni
        get():String{
            return field
        }
        set(valor:String){
            if (valor.length == 9)
                field=valor
        }
    var edad=edad
        get():Int{
            return field
        }
        set(valor:Int){
            if (valor >= 0)
                field=valor
        }
    var nota1=-1
        get():Int{
            return field
        }
        set(valor:Int){
            if (valor >=0 && valor <= 10)
                field=valor
        }
    var nota2= -1
        get():Int{
            return field
        }
        set(valor:Int){
            if (valor >=0 && valor <= 10)
                field=valor
        }
    var nota3= -1
        get():Int{
            return field
        }
        set(valor:Int){
            if (valor >=0 && valor <= 10)
                field=valor
        }
    fun notafinal():Int{
        if (nota1==-1 || nota2==-1 || nota3==-1){
            return -1
        }else{
            return(nota1+nota2+nota3)/3
        }
    }

    override fun toString(): String {
        return "Alumno(dni='$dni', edad=$edad, nota1=$nota1, nota2=$nota2, nota3=$nota3)"
    }
    fun InformeAlumno(){
        println("${toString()} nota media ${notafinal()}")
    }

}