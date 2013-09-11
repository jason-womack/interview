package com.placeable.interview

import scala.annotation.tailrec

object CapitalCheck {

  def capitalCheck1(letters: Array[Char]): Boolean = {
    @tailrec def capitalCheck1Internal(letters: Array[Char], acc: Boolean): Boolean = {
      if (!acc || letters.isEmpty)
        acc
      else
        capitalCheck1Internal(letters.tail, acc && isUpper(letters.head) )
    }
    capitalCheck1Internal(letters, true)
  }

  def capitalCheck2(letters: Array[Char]): Boolean = !letters.exists(isLower)

  def capitalCheck3(letters: Array[Char]): Boolean = letters.dropWhile(isUpper).isEmpty

  def capitalCheck4(letters: Array[Char]): Boolean = letters.filter(isLower).isEmpty

  def capitalCheck5(letters: Array[Char]): Boolean = letters.indexWhere(isLower) < 0

  def capitalCheck6(letters: Array[Char]): Boolean = letters.find(isLower) == None

  def capitalCheck7(letters: Array[Char]): Boolean = letters.foldLeft(true)(_ && isUpper(_))

  def capitalCheck8(letters: Array[Char]): Boolean = letters.foldRight(true)(isUpper(_) && _)


  private val isUpper: (Char => Boolean) = (c: Char) => c.toInt > 64 && c.toInt < 91
  private val isLower: (Char => Boolean) = !isUpper(_)
}
