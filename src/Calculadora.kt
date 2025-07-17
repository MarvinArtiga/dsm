fun main(args: Array<String>) {
    print("Ingrese el primer número: ")
    var num1 = readLine()!!.toInt()

    print("Ingrese el segundo número: ")
    var num2 = readLine()!!.toInt()

    print("Ingrese la operación: 1 = suma, 2 = resta, 3 = multiplicación, 4 = división: ")
    val operation = readLine()!!.toInt()

    when (operation) {
        1 -> println("El resultado de la suma es: ${num1 + num2}")
        2 -> println("El resultado de la resta es: ${num1 - num2}")
        3 -> println("El resultado de la multiplicación es: ${num1 * num2}")
        4 -> {
            while (num2 == 0) {
                print("No se puede dividir entre cero. Ingrese otro número: ")
                num2 = readLine()!!.toInt()
            }
            println("El resultado de la división es: ${num1 / num2}")
        }
        else -> println("Opción no válida.")
    }
}
