package Decorator

class HouseBlend extends Beverage {
  override val description: String = "ハウスブレンドコーヒー"

  override def cost(): Double = .89

}
