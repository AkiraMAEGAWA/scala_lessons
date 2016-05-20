//Rock Paper Scissors => rpc
import scala.util.Random

/*
object Rpc extends Enumeration{
  val rock     = 0
  val paper    = 1
  val scissors = 2
}
*/

val ARRAY_LENGTH = 256

val numArray  = new Array[Int](ARRAY_LENGTH)
val handArray = new Array[String](ARRAY_LENGTH)
var r = new Random
for(i <- 0 to ARRAY_LENGTH - 1){
  numArray(i) = r.nextInt(3)
  handArray(i) = 
    numArray(i) match{
  	  case 0 => "rock"
  	  case 1 => "paper"
      case 2 => "scissors"
    }
  if(i % 5 == 0)
		println(handArray(i))
	else
    print(handArray(i) + ": ")
}
