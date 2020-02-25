package SimpleFactory

import scala.runtime.Nothing$

class SimplePizzaFactory {
  def createPizza(pizzaType: String): Pizza = {
    pizzaType match {
      case "チーズ" => new CheesePizza()
      case "ペパロニ" => new PepperoniPizza()
      case "クラム" => new ClamPizza()
      case "野菜" => new VeggiePizza()
    }
  }
}
