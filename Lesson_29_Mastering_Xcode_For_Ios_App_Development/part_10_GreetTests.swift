import XCTest
@testable import YourAppName

class YourAppNameTests: XCTestCase {
    
    func testGreet() {
        let expectedOutput = "Hello, World!"
        let actualOutput = greet()
        XCTAssertEqual(expectedOutput, actualOutput)
    }
}
