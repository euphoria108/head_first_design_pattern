package Strategy.Duck

import Strategy.FlyBehavior.{FlyBehavior, FlyNoWay}
import Strategy.QuackBehavior.{MuteQuack, QuackBehavior}

class ModelDuck extends Duck {
  override var flyBehavior: FlyBehavior = new FlyNoWay()
  override var quackBehavior: QuackBehavior = new MuteQuack

  override def display(): Unit = {
    println("模型のカモです")
  }
}
