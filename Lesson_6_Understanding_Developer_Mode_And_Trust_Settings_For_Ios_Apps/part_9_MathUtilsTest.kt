import org.junit.Assert.*
import org.junit.Test

class MathUtilsTest {
    @Test
    fun testAddition() {
        val result = add(2, 3)
        assertEquals(5, result)
    }

    private fun add(a: Int, b: Int): Int {
        return a + b
    }
}
