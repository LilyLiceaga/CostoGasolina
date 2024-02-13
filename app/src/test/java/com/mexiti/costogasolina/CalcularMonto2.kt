package com.mexiti.costogasolina

import org.junit.Assert.assertEquals
import org.junit.Test
import java.text.NumberFormat

class CalcularMonto2 {

    @Test
    fun calcularMonto22_35_40L(){
        val precio = 22.35
        val cantLitros = 40.0
        val darPropina = false
        val propina = 0.0

        val montoEsperado = NumberFormat.getCurrencyInstance().format(894)
        val montoActual = calcularMonto(precio, cantLitros, darPropina, propina)

        assertEquals(montoEsperado, montoActual)
    }
}
