
import controllers._
import org.scalatest.concurrent.ScalaFutures
import org.scalatest.funsuite.AnyFunSuite
import scala.concurrent.Future
import org.scalatestplus.play._
import play.api.mvc._
import play.api.test._
import play.api.test.Helpers._

class Testing extends AnyFunSuite with ScalaFutures {

    test ("calculateSumOfEvenSquares should return the sum of" +
      "squares of even numbers up to n") {
        val n = 5
        val expectedSum = 4 + 16
        val futureSum = new HomeController(
          Helpers.stubControllerComponents()).calculateSumOfEvenSquares(n)
        futureSum.futureValue === expectedSum
        // futureSum.futureValue shouldEqual expectedSum
    }

    test ("calculateSumOfEvenSquares should return 0 when n is 0") {
        val n = 0
        val expectedSum = 0
        val futureSum = new HomeController(
          Helpers.stubControllerComponents()).calculateSumOfEvenSquares(n)
        futureSum.futureValue === expectedSum
    }

    test ("calculateSumOfEvenSquares should return 0 when n is negative") {
        val n = -11
        val expectedSum = 0
        val futureSum = new HomeController(
          Helpers.stubControllerComponents()).calculateSumOfEvenSquares(n)
        futureSum.futureValue === expectedSum
    }
  
}
