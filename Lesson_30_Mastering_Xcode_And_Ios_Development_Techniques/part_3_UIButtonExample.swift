let button = UIButton(type: .system)
button.setTitle("Click Me", for: .normal)
button.translatesAutoresizingMaskIntoConstraints = false
view.addSubview(button)

NSLayoutConstraint.activate([
    button.centerXAnchor.constraint(equalTo: view.centerXAnchor),
    button.centerYAnchor.constraint(equalTo: view.centerYAnchor),
    button.widthAnchor.constraint(equalToConstant: 200),
    button.heightAnchor.constraint(equalToConstant: 50)
])
