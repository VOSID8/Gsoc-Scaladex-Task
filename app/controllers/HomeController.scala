package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import scala.concurrent.{Future, ExecutionContext}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.{Await, Future}
import scala.concurrent.duration.Duration
import scala.util.{Success, Failure}

@Singleton
class HomeController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {
  def index() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }
  def calculateSumOfEvenSquares(n: Int): Future[Int] = {
    val evenNumbersFuture = Future {
      (1 to n).filter(_ % 2 == 0) 
    }
    val squareFutures = for {
      evenNumbers <- evenNumbersFuture
    } yield {
      evenNumbers.map(x => x * x) 
    }
    squareFutures.map(_.sum)
  }

  def index2() = Action { implicit request: Request[AnyContent] =>
    val postVals = request.body.asFormUrlEncoded
    postVals.map { args =>
    val n = args("value").head.toInt
    val result = calculateSumOfEvenSquares(n)
    val result2 = Await.result(result, Duration.Inf)
    println(result2) // Block until the future completes
    if(n == 0) Ok(views.html.result0(n,result2))
    else if(n < 0) Ok(views.html.resultn(n,result2))
    else Ok(views.html.result(n,result2))
    }.getOrElse {
      BadRequest("Something went Wrong")
    }
  }
}
