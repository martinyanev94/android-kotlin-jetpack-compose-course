struct ContentView: View {
    @State private var message = "Hello, World!"

    var body: some View {
        VStack {
            Text(message)
                .font(.largeTitle)
                .padding()

            Button(action: {
                message = "Hello, iOS Developer!"
            }) {
                Text("Click Me")
                    .font(.title2)
                    .padding()
                    .background(Color.blue)
                    .foregroundColor(.white)
                    .cornerRadius(10)
            }
        }
    }
}
