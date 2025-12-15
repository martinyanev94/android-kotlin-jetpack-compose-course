let url = URL(string: "https://api.example.com/data")!
let task = URLSession.shared.dataTask(with: url) { data, response, error in
    guard let data = data, error == nil else {
        print("Error fetching data: \(String(describing: error))")
        return
    }
    
    do {
        let json = try JSONSerialization.jsonObject(with: data, options: [])
        print("Fetched JSON: \(json)")
    } catch {
        print("Error parsing JSON: \(error)")
    }
}

task.resume()
