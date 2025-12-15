let addClosure = { (a: Int, b: Int) -> Int in
    return a + b
}

let sum = addClosure(10, 20)
print("The sum from closure is \(sum)")
