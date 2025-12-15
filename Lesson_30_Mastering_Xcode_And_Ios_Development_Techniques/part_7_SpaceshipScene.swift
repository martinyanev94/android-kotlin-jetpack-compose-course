import SpriteKit

class GameScene: SKScene {
    override func didMove(to view: SKView) {
        let sprite = SKSpriteNode(imageNamed: "Spaceship")
        sprite.position = CGPoint(x: size.width / 2, y: size.height / 2)
        addChild(sprite)
    }
}
