package Strategy

import Duck.ModelDuck
import FlyBehavior.FlyNoWay
import QuackBehavior.MuteQuack

object MiniDuckSimulator extends App {
  println("-- Strategy --")
  val modelDuck = new ModelDuck()
  modelDuck.performQuack()
  modelDuck.performFly()
}
