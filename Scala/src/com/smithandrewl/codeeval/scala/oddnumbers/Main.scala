package com.smithandrewl.codeeval.scala.oddnumbers

/*
  CHALLENGE DESCRIPTION:

    Print the odd numbers from 1 to 99.

  INPUT SAMPLE:

    There is no input for this program.
 */
object Main extends App {
  val result = 1.to(99, 2)
  print(result.mkString("\n"))
}
