fun main(args:Array<String>){
        print("Ingrese un numero: ")
        var numero:Int = readLine()!!.toInt()

    if (numero % 2 == 0) {
        println("El numero '$numero' es par")
    }
    else{
        println("El numero  '$numero'  es inpar")
    }
}