package Decorator

trait Beverage {
  protected val description: String = "不明な飲み物"

  def getDescription(): String = this.description

  def cost(): Double
}
