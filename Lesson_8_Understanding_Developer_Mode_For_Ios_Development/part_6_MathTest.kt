import org.junit.Test
import kotlin.test.assertEquals

class MathTest {
    @Test
    fun testAddition() {
        val result = addNumbers(5, 5)
        assertEquals(10, result)
    }
}
