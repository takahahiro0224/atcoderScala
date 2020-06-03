// https://atcoder.jp/contests/abc169/tasks/abc169_b

import java.util.Scanner
import scala.annotation.tailrec

object Main extends App {
  val sc = new Scanner(System.in)
  val n = sc.nextInt
  val a = Seq.fill(n)(BigInt(sc.nextLong))
  val maxNum = BigInt("1000000000000000000")

  if (a.contains(BigInt(0))) {
    println(0)
  } else {
    println(loop(BigInt(1), a))
  }

  @tailrec def loop(acc: BigInt, li: Seq[BigInt]): BigInt = li match {
    case _ if (acc > maxNum) => BigInt(-1)
    case x::xs => loop(acc * x, xs)
    case _ => acc
  }
}
