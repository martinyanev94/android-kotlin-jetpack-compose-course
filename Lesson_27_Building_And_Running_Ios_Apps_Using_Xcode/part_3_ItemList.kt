data class Item(val id: Int, val name: String, val description: String)

fun getItems(): List<Item> {
    return listOf(
        Item(1, "Item One", "This is the first item"),
        Item(2, "Item Two", "This is the second item"),
        Item(3, "Item Three", "This is the third item")
    )
}
import SwiftUI

struct ItemListView: View {
    let items: [Item]

    var body: some View {
        List(items, id: \.id) { item in
            VStack(alignment: .leading) {
                Text(item.name)
                    .font(.headline)
                Text(item.description)
                    .font(.subheadline)
            }
        }
    }
}
