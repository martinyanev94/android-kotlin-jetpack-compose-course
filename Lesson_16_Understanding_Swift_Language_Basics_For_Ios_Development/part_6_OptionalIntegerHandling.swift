var optionalInt: Int? // This can hold an integer or be nil
optionalInt = nil // This is perfectly valid
optionalInt = 10 // Now it holds an integer
if let value = optionalInt {
    print("The optional has a value: \(value)")
} else {
    print("The optional is nil.")
}
