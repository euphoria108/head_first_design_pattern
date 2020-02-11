package Decorator

class Espresso extends Beverage {
  override val description: String = "エスプレッソ"

  override def cost(): Double = 1.99
}
