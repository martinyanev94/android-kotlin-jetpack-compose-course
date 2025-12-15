import org.junit.Assert.assertEquals
import org.junit.Test

class CalculatorTest {

    @Test
    fun addition_isCorrect() {
        val result = add(2, 3)
        assertEquals(5, result)
    }

    private fun add(a: Int, b: Int): Int {
        return a + b
    }
}
