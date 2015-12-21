package math

import org.junit._
import Assert._

/**
 * Created by LuQi on 12/20/15.
 */

class PrimeTest {
  @Test
  def testPrime(): Unit ={
    assertEquals(7, new Prime(1000).getPrime(3))
  }

}

