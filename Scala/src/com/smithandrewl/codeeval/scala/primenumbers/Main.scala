package com.smithandrewl.codeeval.scala.primenumbers

object Main extends App {

  val source = scala.io.Source.fromFile(args(0))
  val lines  = source.getLines().filter(_.length > 0)

  def isPrime(num: Int): Boolean = {
    for(i <- 2 until num) {
      if (num % i == 0) return false
    }

    true
  }

  def primes(num: Int): IndexedSeq[Int] = {
    for {
      current <- 2 until num
      if isPrime(current)
    } yield current
  }

  val numbers = lines.map(_.toInt)

  numbers.map(primes(_).mkString(",")).foreach(println)
}
