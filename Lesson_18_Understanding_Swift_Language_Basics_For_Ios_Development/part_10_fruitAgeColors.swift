var fruits: [String] = ["Apple", "Banana", "Cherry"]
let firstFruit = fruits[0]
print("The first fruit is \(firstFruit)")
var ages: [String: Int] = ["Alice": 30, "Bob": 25]
let aliceAge = ages["Alice"]
print("Alice's age is \(aliceAge ?? 0)") // provides a default value if nil
var colors: Set<String> = ["Red", "Green", "Blue"]
