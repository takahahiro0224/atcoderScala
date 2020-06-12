package abc167

import java.util.Scanner
// 深さ優先探索
object abc169_c extends App {
  val sc = new Scanner(System.in)
  val bookNum, algorithmNum, understanding = sc.nextInt
  case class Book(price: Int, skills: Seq[Int])
  val Books = Seq.fill(bookNum)(Book(sc.nextInt, Seq.fill(algorithmNum)(sc.nextInt)))
  //println(Books)


}
