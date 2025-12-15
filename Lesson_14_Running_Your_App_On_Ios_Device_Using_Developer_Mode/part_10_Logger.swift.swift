import os.log

struct Logger {
    static let subsystem = "com.example.myApp"
    static let category = "AppLog"
    
    static func log(message: String) {
        os_log("%{public}@", log: OSLog(subsystem: subsystem, category: category), type: .info, message)
    }
}

// Usage in your app
Logger.log(message: "App started successfully.")
