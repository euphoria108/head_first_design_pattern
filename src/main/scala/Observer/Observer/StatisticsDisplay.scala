package Observer.Observer

import Observer.Subject.Subject

import scala.collection.mutable.ListBuffer
import scala.runtime.Nothing$

class StatisticsDisplay(weatherDataObject: Subject) extends Observer with DisplayElement {
  private val temperatures = ListBuffer[Float]()
  private var maxTemperature: Float = Float.NegativeInfinity
  private var minTemperature: Float = Float.PositiveInfinity
  private var averageTemperature: Float = 0

  val weatherData: Subject = weatherDataObject
  this.weatherData.registerObserver(this)

  override def update(temp: Float, humidity: Float, pressure: Float): Unit = {
    this.temperatures.addOne(temp)

    // update maxTemperature
    if (temp > this.maxTemperature) {
      this.maxTemperature = temp
    }

    // update minTemperature
    if (temp < this.minTemperature) {
      this.minTemperature = temp
    }

    // update averageTemperature
    this.averageTemperature = this.temperatures.sum / this.temperatures.length

    // display
    this.display()
  }

  override def display(): Unit = {
    println(s"平均/最高/最低気温：$averageTemperature/$maxTemperature/$minTemperature")
  }
}
