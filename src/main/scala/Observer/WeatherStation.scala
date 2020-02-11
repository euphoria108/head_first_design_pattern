package Observer

import Subject.WeatherData
import Observer.{CurrentConditionsDisplay, StatisticsDisplay}

object WeatherStation extends App {
  val weatherData = new WeatherData()

  val currentConditionsDisplay = new CurrentConditionsDisplay(weatherData)
  val statisticsDisplay = new StatisticsDisplay(weatherData)

  // change weather conditions
  weatherData.setMeasurements(27, 65, 30.4f)
  weatherData.setMeasurements(28, 70, 29.2f)
  weatherData.setMeasurements(26, 90, 29.2f)
}
