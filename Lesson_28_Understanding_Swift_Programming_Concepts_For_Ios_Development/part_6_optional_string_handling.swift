var name: String? = "John"
name = nil // Now, name doesn’t hold any value
if let unwrappedName = name {
    print("Hello, \(unwrappedName)")
} else {
    print("Name is nil")
}
