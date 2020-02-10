package Strategy.QuackBehavior

class MuteQuack extends QuackBehavior {
  override def quack(): Unit = {
    println("...")
  }
}
