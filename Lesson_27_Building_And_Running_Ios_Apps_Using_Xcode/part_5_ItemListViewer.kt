import SwiftUI
import Combine

class ItemViewModel: ObservableObject {
    @Published var items: [Item] = []

    func fetchItems() {
        // Simulate a network call using DispatchQueue
        DispatchQueue.main.asyncAfter(deadline: .now() + 2.0) {
            self.items = getItems() // Assume getItems() fetches remote data
        }
    }
}

struct ItemListView: View {
    @ObservedObject var viewModel = ItemViewModel()

    var body: some View {
        List(viewModel.items, id: \.id) { item in
            VStack(alignment: .leading) {
                Text(item.name)
                    .font(.headline)
                Text(item.description)
                    .font(.subheadline)
            }
        }
        .onAppear {
            viewModel.fetchItems()
        }
    }
}
