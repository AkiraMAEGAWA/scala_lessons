//Rock Paper Scissors => rpc
import scala.util.Random

/*
object Rsp extends Enumeration{
  val rock     = 1
  val scissors = 2
  val paper    = 3
}
*/

val ARRAY_LENGTH = 256

val numArray  = new Array[Int](ARRAY_LENGTH)
val pc_handArray = new Array[String](ARRAY_LENGTH)
var r = new Random

def rsp_comp(YourHand: Int, pcHand: Int):String = {
  var showResult:String = "0"
  if(YourHand == pcHand)
    showResult = "draw"
	else if(YourHand % 3 == ((pcHand + 1 )% 3))
    showResult = "Ops.... you Lose"
	else if(((YourHand + 1 ) % 3)== pcHand % 3)
    showResult = "You win!!!"
 //  else
//	  showResult = "Uh-huh?"

	showResult
}

for(i <- 0 to ARRAY_LENGTH - 1){
  numArray(i) = r.nextInt(3) + 1
  pc_handArray(i) = 
    numArray(i) match{
      case 1 => "rock"
      case 2 => "scissors"
      case 3 => "paper"
    }
  if(i % 5 == 0)
    println(pc_handArray(i))
  else
    print(pc_handArray(i) + ": ")
}

val sc = new java.util.Scanner(System.in) 
for(i <- 0 to ARRAY_LENGTH - 1){
  print("rock scissors paper! 1,2,3!")
  var yourhand = sc.nextInt.toByte
  if(yourhand == 35)
	  exit()
//	println("yourhand: " + transHand(yourhand)
  println("pcHand:  " + pc_handArray(i))
  println(rsp_comp(yourhand, numArray(i)))
  
 }
