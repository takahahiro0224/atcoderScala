// https://atcoder.jp/contests/abc167/tasks/abc167_b
package abc167

import java.util.Scanner

object abc167_b extends App {
  val sc = new Scanner(System.in)
  val a,b,c,k = sc.nextInt

  val res: Long = if (a >= k) {
    k
  } else if (a + b >= k) {
    a
  } else {
    a - (k-(a+b))
  }
  println(res)
}
