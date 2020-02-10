package Strategy.Duck

import Strategy.FlyBehavior.FlyBehavior
import Strategy.QuackBehavior.QuackBehavior

trait Duck {
  var flyBehavior: FlyBehavior
  var quackBehavior: QuackBehavior

  def display()

  def swim() : Unit = {
    println("すべてのカモは浮かびます。")
  }

  def performQuack(): Unit = {
    this.quackBehavior.quack()
  }

  def performFly(): Unit = {
    this.flyBehavior.fly()
  }

  def setQuackBehavior(quackBehavior: QuackBehavior): Unit = {
    this.quackBehavior = quackBehavior
  }

  def setFlyBehavior(flyBehavior: FlyBehavior): Unit = {
    this.flyBehavior = flyBehavior
  }
}
