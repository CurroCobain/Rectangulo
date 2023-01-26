class rectangulo ( base: Int,altura:Int){
    val base:Int
    val altura:Int
    init {
        this.base=base
        this.altura=altura
    }
    //constructor():this(0,0){
     //   val base:Int
    //  val altura:Int
    //}
fun area():Int{
    return base*altura
}
    fun perimetro():Int{
       return (base+altura)*2
    }
}