var uniqueNumbers: Set<Int> = [1, 2, 3, 2] // 2 will only be stored once
uniqueNumbers.insert(4) // Adds 4 to the set
print(uniqueNumbers) // Outputs: [2, 4, 1, 3] (order may vary)
