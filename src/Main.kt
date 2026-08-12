fun main() {
    println("Gestor semanal de gastos")
}

fun calcularTotal(montos: List<Double>) {
    println("\n--- TOTAL DE GASTOS ---")

    if (montos.isEmpty()) {
        println("No hay gastos registrados para calcular.")
    } else {
        var total = 0.0
        for (monto in montos) {
            total += monto
        }
        println("El monto total gastado en la semana es: $$total")
    }
}



