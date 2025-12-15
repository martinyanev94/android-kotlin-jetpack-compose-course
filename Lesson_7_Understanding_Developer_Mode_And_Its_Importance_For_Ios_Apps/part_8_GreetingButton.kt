import androidx.compose.material.Text
import androidx.compose.material.Button

@Composable
fun Greeting(name: String) {
    Button(onClick = { /* Do something */ }) {
        Text(text = "Hello, $name!")
    }
}
