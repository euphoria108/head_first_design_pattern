package Decorator

class Soy(beverageObj: Beverage) extends CondimentDecorator {
  val beverage: Beverage = beverageObj

  override def getDescription(): String = {
    return beverage.getDescription() + "、豆乳"
  }

  override def cost(): Double = {
    return .15 + beverage.cost()
  }

}
