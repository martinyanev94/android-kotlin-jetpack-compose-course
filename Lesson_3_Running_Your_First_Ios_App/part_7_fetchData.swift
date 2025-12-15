func fetchData() {
    do {
        let data = try fetchDataFromDatabase()
        print("Data fetched successfully: \(data)")
    } catch {
        print("An error occurred while fetching data: \(error.localizedDescription)")
    }
}
