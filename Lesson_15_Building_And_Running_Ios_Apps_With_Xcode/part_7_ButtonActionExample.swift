Button(action: {
    message = "Hello, iOS Developer!"
    print("Button was tapped! Message updated to: \(message)")
}) {
    Text("Click Me")
        .font(.title2)
        .padding()
        .background(Color.blue)
        .foregroundColor(.white)
        .cornerRadius(10)
}
