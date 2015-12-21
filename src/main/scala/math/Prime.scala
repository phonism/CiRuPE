package math

class Prime(maxNum: Int) {

  var prime: Array[Int] = new Array[Int](maxNum)
  var check: Array[Boolean] = new Array[Boolean](maxNum)
  var cnt = 0
  Prime()

  def Prime(): Unit = {
    for (i <- 2 until maxNum) {
      if (!check(i)) {
        prime(cnt) = i
        cnt += 1
      }
      for (j <- i + i until maxNum by i) {
        check(j) = true
      }
    }
  }

  def toArray: Array[Int] = prime

  def getPrime(idx: Int): Int = prime(idx)

}
