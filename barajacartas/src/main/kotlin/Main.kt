fun main(args: Array<String>) {
    val c1=carta(12,'c')
    println("${c1.toString()}")
    val c2=carta(c1)
    c2.palo='t'

    println("${c2.toString()}")

    c1.comparaCartas(c2)
    c2.numero=5
    println("${c2.toString()}")
    c1.comparaCartas(c2)

}