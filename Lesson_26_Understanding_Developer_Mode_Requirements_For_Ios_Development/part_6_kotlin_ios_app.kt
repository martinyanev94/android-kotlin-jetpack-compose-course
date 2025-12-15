kotlin {
    ios {
        binaries {
            framework {
                baseName = "shared"
            }
        }
    }
    sourceSets {
        val iosMain by getting {
            dependencies {
                // Add necessary dependencies here
            }
        }
    }
}
fun greet(): String {
    return "Hello, Kotlin!"
}
import SwiftUI
import shared

struct ContentView: View {
    var body: some View {
        Text(Greeting().greet())
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
