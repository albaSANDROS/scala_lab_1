import scala.annotation.tailrec
import scala.io.StdIn

object main {
/*
*
*  3.	Найти среднее арифметическое.
*  3.	Инвертировать строку.
*  3.	Найти сумму всех положительных чисел в коллекции.
*  3.	Реализовать функцию, которая возвращает предпоследний элемент списка.
*  3.	Преобразовать Map таким образом, чтобы ключи оригинального Map стали значениями преобразованного, и наоборот.
*
*/
  println("Enter range of List:")
  val range: Int = StdIn.readInt()
  println("Enter list:")
  val numbers: List[Int] = List.fill(range) {
    StdIn.readInt()
  }

  println("Enter 1st element (INT) for MAP function:")
  val element1: Int = StdIn.readInt();
  println("Enter 2nd element (INT) for MAP function:")
  val element2: Int = StdIn.readInt();
  println("Enter 1st key (TEXT) for MAP function:")
  val key1: String = StdIn.readLine();
  println("Enter 2nd key (TEXT) for MAP function:")
  val key2: String = StdIn.readLine();
  val map = Map [Int, String](element1 -> key1, element2 -> key2)
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


// /* Реверс введенной строки */
//  println("Enter string:")
//  val text: String = StdIn.readLine()

// def reverse(s: String): String = {  // рекурсивная
//   if (s.isEmpty) ""
//   else reverse(s.tail) + s.head
// }

// def tailReverse(str: String): String = {
//   @tailrec
//   def reverse(str: String, r: String): String =
//   {
//     str match{
//       case "" => r
//       case s => reverse(s.tail, s.head+r)
//     }
//   }
//   reverse(str, "")
// }

// def reverse2(s: String) : String =
//   (for(i <- s.length - 1 to 0 by -1) yield s(i)).mkString // рекурсия

  /* Сумма позитивных элементов List */
  def posSum(list: List[Int]): Int = {
    val positive: PartialFunction[Int, Int] = {
    case x: Int if x > 0 => x
    }
    list.collect(positive).sum
  }

  /* Нахождение предпоследнего элемента List*/
  def preLastFind(list: List[Int]): Int = {
    list.foldLeft((list.head, list.tail.head))((r, c) => (r._2, c))._1
  }

  /* Реверс ключей и значений Map*/
  def reverse[T, U](map: Map[T, U]): Map[U, T] = {
    if (map.isEmpty) Map()
    Map() ++ map.map(_.swap)
  }
    def main(args: Array[String]): Unit = {
      println("Results");
      print("Sum of positive numbers: ");
      println(posSum(numbers));
      print("Pre-last element: ");
      println(preLastFind(numbers));
      print("Map function: ");
      print(map); print(" -> "); print(reverse(map));
    }

}
