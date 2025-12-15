let myButton = UIButton(type: .system)
myButton.setTitle("Press Me", for: .normal)
myButton.translatesAutoresizingMaskIntoConstraints = false
view.addSubview(myButton)

NSLayoutConstraint.activate([
    myButton.centerXAnchor.constraint(equalTo: view.centerXAnchor),
    myButton.centerYAnchor.constraint(equalTo: view.centerYAnchor)
])
