import XCTest

class MyAppUITests: XCTestCase {
    func testButtonTap() {
        let app = XCUIApplication()
        app.launch()
        
        let button = app.buttons["Click Me"]
        button.tap()
        
        // Assert the button does something after being tapped
        let label = app.staticTexts["Hello World"]
        XCTAssert(label.exists)
    }
}
