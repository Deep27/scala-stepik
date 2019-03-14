package io.deep27soft.scalastepik._03_types._01_types

object Task extends App {

  def normalDistribution(mu: Double, sigma: Double, x: Double): Double =
    1 / (sigma * Math.sqrt(2 * Math.PI)) * Math.pow(Math.E, -(Math.pow(x - mu, 2) / 2 * Math.pow(sigma, 2)))
}
