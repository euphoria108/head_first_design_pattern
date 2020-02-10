package Strategy.QuackBehavior

class Squeak extends QuackBehavior {
  override def quack(): Unit = {
    println("squeak!")
  }
}
