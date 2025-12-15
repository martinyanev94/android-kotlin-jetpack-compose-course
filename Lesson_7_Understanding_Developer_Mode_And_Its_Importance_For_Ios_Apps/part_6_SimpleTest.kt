import org.junit.Test
import org.junit.Assert.assertEquals

class SimpleTest {
    @Test
    fun addition_isCorrect() {
        val sum = add(2, 3)
        assertEquals(5, sum) // Test if the sum equals 5
    }

    fun add(a: Int, b: Int): Int {
        return a + b
    }
}
