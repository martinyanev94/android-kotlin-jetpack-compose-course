import SwiftUI

struct ContentView: View {
    @State private var greeting = "Welcome to My App!"

    var body: some View {
        VStack {
            Text(greeting)
                .font(.largeTitle)
                .padding()

            Button("Say Hello") {
                greeting = "Hello, dear user!"
            }
            .padding()
            .background(Color.blue)
            .foregroundColor(.white)
            .cornerRadius(10)
        }
    }
}
