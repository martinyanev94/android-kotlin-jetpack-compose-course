import android.util.Log

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "onCreate: Application started")
        // fetch data
        fetchData()
    }

    private fun fetchData() {
        Log.d(TAG, "fetchData: Fetching data from API")
        // Call your ApiService here
    }
}
