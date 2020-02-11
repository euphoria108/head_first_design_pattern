package Observer.Subject

import scala.collection.mutable.ListBuffer
import Observer.Observer._

class WeatherData extends Subject {
  private val observers = ListBuffer.empty[Observer]
  private var temperature: Float = 0
  private var humidity: Float = 0
  private var pressure: Float = 0

  override def registerObserver(observer: Observer): Unit = {
    this.observers.addOne(observer)
  }

  override def removeObserver(observer: Observer): Unit = {
    val i = this.observers.indexOf(observer)
    if (i >= 0) {
      this.observers.remove(i)
    }
  }

  override def notifyObservers(): Unit = {
    for (observer <- this.observers) {
      observer.update(this.temperature, this.humidity, this.pressure)
    }
  }

  def measurementsChanged(): Unit = {
    this.notifyObservers()
  }

  def setMeasurements(temperature: Float, humidity: Float, pressure: Float): Unit = {
    this.temperature = temperature
    this.humidity = humidity
    this.pressure = pressure
    this.measurementsChanged()
  }
}
