fun main() {
    println("Gestor semanal de gastos")
}
fun registrarGasto(
    conceptos: MutableList<String>,
    categorias: MutableList<String>,
    montos: MutableList<Double>
) {
    println("\n--- NUEVO GASTO ---")

    print("Ingrese el concepto del gasto: ")
    val concepto = readln()

    println("Categorías permitidas:")
    println("1. Alimentos")
    println("2. Transporte")
    println("3. Materiales escolares")
    println("4. Entretenimiento")
    println("5. Otros")

    var categoriaSeleccionada = ""
    var categoriaValida = false

    while (!categoriaValida) {
        print("Seleccione el número de la categoría: ")
        val opcion = readln()

        when (opcion) {
            "1" -> { categoriaSeleccionada = "Alimentos"; categoriaValida = true }
            "2" -> { categoriaSeleccionada = "Transporte"; categoriaValida = true }
            "3" -> { categoriaSeleccionada = "Materiales escolares"; categoriaValida = true }
            "4" -> { categoriaSeleccionada = "Entretenimiento"; categoriaValida = true }
            "5" -> { categoriaSeleccionada = "Otros"; categoriaValida = true }
            else -> println("Opción incorrecta. Por favor, seleccione un número del 1 al 5.")
        }
    }

    var monto = 0.0
    var montoValido = false

    while (!montoValido) {
        print("Ingrese el monto del gasto: $")
        val entrada = readln().toDoubleOrNull()

        if (entrada != null && entrada > 0) {
            monto = entrada
            montoValido = true
        } else {
            println("Error: El monto debe ser un número mayor a cero.")
        }
    }

    conceptos.add(concepto)
    categorias.add(categoriaSeleccionada)
    montos.add(monto)

    println("¡Gasto registrado exitosamente!")
}