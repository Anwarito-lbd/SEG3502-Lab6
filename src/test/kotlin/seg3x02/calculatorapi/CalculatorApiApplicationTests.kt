package seg3x02.calculatorapi

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import seg3x02.calculatorapi.controller.CalculatorController

class CalculatorApiApplicationTests {
    private val c = CalculatorController()
    @Test fun ops() {
        assertEquals(5.0, c.add(2.0, 3.0)); assertEquals(-1.0, c.subtract(2.0, 3.0))
        assertEquals(6.0, c.multiply(2.0, 3.0)); assertEquals(2.5, c.divide(5.0, 2.0))
    }
}
