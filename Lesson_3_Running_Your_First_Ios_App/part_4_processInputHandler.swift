func processInput(input: String) -> String {
    let processed = input.trimmingCharacters(in: .whitespacesAndNewlines)
    return processed.isEmpty ? "No input provided" : "Input is: \(processed)"
}
