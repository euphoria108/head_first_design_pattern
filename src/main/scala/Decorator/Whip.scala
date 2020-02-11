package Decorator

class Whip(beverageObj: Beverage) extends CondimentDecorator {
  private val beverage: Beverage = beverageObj

  override def getDescription(): String = beverage.getDescription() + "、ホイップ"

  override def cost(): Double = .10 + beverage.cost()
}
