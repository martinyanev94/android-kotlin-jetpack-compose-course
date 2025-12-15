class MainActivity : AppCompatActivity() {
    private var count = 0
    private lateinit var countTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        countTextView = findViewById(R.id.countTextView)
        findViewById<Button>(R.id.incrementButton).setOnClickListener {
            count++
            countTextView.text = count.toString()
        }
    }
}
