package pruebas

import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.stream.ActorMaterializer

import scala.concurrent.Future
import scala.util.{Success, Failure}

object Servidor extends App {

  val host = "0.0.0.0"
  val port = 9000

  implicit val system = ActorSystem("hola_mundo")
  implicit val materializer = ActorMaterializer()
  import system.dispatcher

  import akka.http.scaladsl.server.Directives._
  def route = path("hola") {
    get {
      complete("hola mundo")
    }
  }

  val respuesta: Future[Http.ServerBinding] = Http().bindAndHandle(route, host, port)

  respuesta.onComplete{
    case Success( _ )  => println(s"El servidor esta arriba, conectese a ${host}:${port}")
    case Failure( error ) => println( s"respondió mal: ${error}" )
  }



}
