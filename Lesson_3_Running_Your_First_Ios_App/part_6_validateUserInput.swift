func isValidUserInput(_ input: String) -> Bool {
    let trimmedInput = input.trimmingCharacters(in: .whitespacesAndNewlines)
    return !trimmedInput.isEmpty
}
