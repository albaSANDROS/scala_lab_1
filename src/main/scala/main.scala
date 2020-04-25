import scala.annotation.tailrec
import scala.io.StdIn

object main {
/* нахождение среднего арифметического введенных значений */
 // println("Enter range of array:")
 // val range: Int = StdIn.readInt()
 // println("Enter array:")
 // val numbers: List[Int] = List.fill(range){
 //   StdIn.readInt()
 //}
 //
 //
 // def Average (list: List[Int]): Double = {
 //
 //   @tailrec
 //   def sum(list: List[Int], acc: Int): Double = {
 //     if (list.nonEmpty) {
 //       sum (list.tail, acc+list.head)
 //     }
 //     else acc
 //   }
 //   sum(list, 0)/range//numbers.length
 // }
 //
 // def Sum2(list: List[Int]): Double = {
 //   var sum = 0
 //   for (i <-  0 until (range)) //for (i <- to numbers.length - 1)
 //     sum +=list(i)
 //   sum/range
 //
 // }
 //
 // def main(args: Array[String]): Unit = {
 //
 //  println (Average (numbers))
 //  println (Sum2 (numbers))
 // }


  /* Реверс введенной строки */
   println("Enter string:")
   val text: String = StdIn.readLine()

  //@tailrec
  def reverse(s: String): String = {  // рекурсивная
    if (s.isEmpty) ""
    else reverse(s.tail) + s.head
  }


  def reverse2(s: String) : String =
    (for(i <- s.length - 1 to 0 by -1) yield s(i)).mkString // рекурсия

    def main(args: Array[String]): Unit = {
      println("Result");
      println(reverse(text))
      println(reverse2(text))
    }

}