package Decorator

class Mocha(beverageObj: Beverage) extends CondimentDecorator {
  private val beverage: Beverage = beverageObj

  override def getDescription(): String = beverage.getDescription() + "、モカ"

  override def cost(): Double = .20 + beverage.cost()
}
