package upeu.edu.pe.calculadoraterminal
fun main() {
    while (true) {
        println("\nCalculadora en Kotlin")
        println("Seleccione una operación:")
        println("1. Suma")
        println("2. Resta")
        println("3. Multiplicación")
        println("4. División")
        println("5. Salir")
        print("Ingrese su opción: ")

        when (readLine()?.toIntOrNull()) {
            1 -> calcular('+')
            2 -> calcular('-')
            3 -> calcular('*')
            4 -> calcular('/')
            5 -> {
                println("Saliendo...")
                return
            }
            else -> println("Opción inválida, intente de nuevo.")
        }
    }
}

fun calcular(operador: Char) {
    print("Ingrese el primer número: ")
    val num1 = readLine()?.toDoubleOrNull()
    print("Ingrese el segundo número: ")
    val num2 = readLine()?.toDoubleOrNull()

    if (num1 == null || num2 == null) {
        println("Error: Entrada inválida.")
        return
    }

    val resultado = when (operador) {
        '+' -> num1 + num2
        '-' -> num1 - num2
        '*' -> num1 * num2
        '/' -> if (num2 != 0.0) num1 / num2 else "Error: División por cero"
        else -> "Operador no válido"
    }

    println("Resultado: $resultado")
}