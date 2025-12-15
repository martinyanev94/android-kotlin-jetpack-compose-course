func fetchItems() {
    DispatchQueue.global().async {
        do {
            // Simulate a possible error
            if Bool.random() { throw NSError(domain: "", code: 0, userInfo: [NSLocalizedDescriptionKey: "Failed to fetch items"]) }
            DispatchQueue.main.async {
                self.items = getItems() // Assume this fetches remote data
            }
        } catch {
            DispatchQueue.main.async {
                print("Error: \(error.localizedDescription)")
                // Handle error, potentially by updating the UI
            }
        }
    }
}
