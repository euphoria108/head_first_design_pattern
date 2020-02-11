package Observer.Observer

import Observer.Subject.Subject

class CurrentConditionsDisplay(weatherDataObject: Subject) extends Observer with DisplayElement {
  private var temperature: Float = 0
  private var humidity: Float = 0

  val weatherData: Subject = weatherDataObject
  this.weatherData.registerObserver(this)

  override def update(temp: Float, humidity: Float, pressure: Float): Unit = {
    this.temperature = temp
    this.humidity = humidity
    this.display()
  }

  override def display(): Unit = {
    println(s"現在の気象状況：温度 ${this.temperature}度　湿度 ${this.humidity}%")
  }
}
