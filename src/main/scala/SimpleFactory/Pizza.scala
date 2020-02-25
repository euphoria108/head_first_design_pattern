package SimpleFactory

trait Pizza {
  def prepare(): Unit = {}
  def bake(): Unit = {}
  def cut(): Unit = {}
  def box(): Unit = {}
}
