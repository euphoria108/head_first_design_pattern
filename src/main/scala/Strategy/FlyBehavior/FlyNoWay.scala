package Strategy.FlyBehavior

class FlyNoWay extends FlyBehavior {
  override def fly(): Unit = {
    println("Can't fly")
  }
}
