package Observer.Subject

import Observer.Observer.Observer

trait Subject {
  def registerObserver(observer: Observer)
  def removeObserver(observer: Observer)
  def notifyObservers()
}
