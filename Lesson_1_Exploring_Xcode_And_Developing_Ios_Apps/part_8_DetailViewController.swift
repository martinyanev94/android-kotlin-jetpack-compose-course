class DetailViewController: UIViewController {
    var detailMessage: String?
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Set the label based on the detailMessage
    }
}
override func prepare(for segue: UIStoryboardSegue, sender: Any?) {
    if segue.identifier == "yourSegueIdentifier" {
        if let detailVC = segue.destination as? DetailViewController {
            detailVC.detailMessage = "Data from the first screen!"
        }
    }
}
