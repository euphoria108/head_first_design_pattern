package Decorator

object StarbuzzCoffee extends App {
  val beverage: Beverage = new Espresso()
  println(s"${beverage.getDescription()} $$${beverage.cost()}")

  var beverage2: Beverage = new HouseBlend()
  beverage2 = new Mocha(beverage2)
  beverage2 = new Mocha(beverage2)
  beverage2 = new Whip(beverage2)
  println(s"${beverage2.getDescription()} $$${beverage2.cost()}")

  var beverage3: Beverage = new HouseBlend()
  beverage3 = new Soy(beverage3)
  beverage3 = new Mocha(beverage3)
  beverage3 = new Whip(beverage3)
  println(s"${beverage3.getDescription()} $$${beverage3.cost()}")
}
