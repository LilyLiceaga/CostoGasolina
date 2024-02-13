package com.mexiti.costogasolina

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performTextInput
import com.mexiti.costogasolina.ui.theme.CostoGasolinaTheme
import org.junit.Assert
import org.junit.Rule
import org.junit.Test
import java.text.NumberFormat

class CalcularMontoUITest {

    @get:Rule
    val composeTestRule = createComposeRule()
    @Test
    fun CalcularMonto23_94_20L(){
        composeTestRule.setContent {
            CostoGasolinaTheme {
                CostGasLayout()
            }
        }
        composeTestRule.onNodeWithText("Ingresa precio por litro de Gasolina")
            .performTextInput("23.94")
        composeTestRule.onNodeWithText("Litros")
            .performTextInput("20")

        val montoEsperado = NumberFormat.getCurrencyInstance()
            .format(478.8)
        composeTestRule.onNodeWithText("Monto Total: $montoEsperado")
            .assertExists("No se encontró ningun nodo con el texto señalado")
    }
}