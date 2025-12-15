import SwiftUI

struct ContentView: View {
    var body: some View {
        Text("Hello, iOS Developer!")
            .padding()
            .font(.largeTitle)
    }
}

@main
struct MyApp: App {
    var body: some Scene {
        WindowGroup {
            ContentView()
        }
    }
}
