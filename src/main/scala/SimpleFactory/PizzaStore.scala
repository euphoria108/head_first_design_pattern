package SimpleFactory

class PizzaStore(factory: SimplePizzaFactory) {
  def orderPizza(pizzaType: String): Pizza = {
    val pizza: Pizza = factory.createPizza(pizzaType)

    pizza.prepare()
    pizza.bake()
    pizza.cut()
    pizza.box()

    return pizza
  }
}
