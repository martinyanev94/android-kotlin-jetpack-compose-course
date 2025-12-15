class MainActivity : AppCompatActivity() {
    lateinit var button: Button
    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)
        textView = findViewById(R.id.textView)

        button.setOnClickListener {
            performAction()
        }
    }

    private fun performAction() {
        textView.text = "Button clicked!"
    }
}
