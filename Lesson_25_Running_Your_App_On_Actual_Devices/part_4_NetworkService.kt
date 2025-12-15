import io.ktor.client.*
import io.ktor.client.request.*

class NetworkService {
    private val client = HttpClient()

    suspend fun fetchData(apiUrl: String): String {
        return client.get(apiUrl)
    }
}
