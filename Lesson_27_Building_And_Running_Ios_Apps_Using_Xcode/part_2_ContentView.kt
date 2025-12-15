import SwiftUI

struct ContentView: View {
    var body: some View {
        NavigationView {
            VStack {
                NavigationLink(destination: InfoView()) {
                    Text("Learn More")
                        .font(.headline)
                        .padding()
                        .background(Color.green)
                        .foregroundColor(.white)
                        .cornerRadius(10)
                }
            }
            .navigationTitle("Home")
        }
    }
}

struct InfoView: View {
    var body: some View {
        Text("Here you will learn more about our app!")
            .font(.title)
            .padding()
    }
}
