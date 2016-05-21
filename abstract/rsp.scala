//Rock Scissors Paper => rsp
import scala.util.Random

val ARRAY_LENGTH = 256
val numArray  = new Array[Int](ARRAY_LENGTH)
var r = new Random

def toHand(numHand: Int):String = {
  numHand match{
	  case 1 => "rock"
	  case 2 => "scissors"
	  case 3 => "paper"
	  case _ => "null"
	}
}

def rsp_comp(YH: Int, pcHand: Int):String = {
  var showResult:String = "0"
  if(YH == pcHand)
    showResult = "draw"
	else if(YH % 3 == ((pcHand + 1 )% 3))
    showResult = "Ops.... you Lose"
	else if(((YH + 1 ) % 3)== pcHand % 3)
    showResult = "You win!!!"
 
  showResult
}

//begin from here↓↓↓
for(x <- 1 to 33)
  println("")

for(i <- 0 to ARRAY_LENGTH - 1){
  numArray(i) = r.nextInt(3) + 1
/* ---you can use tricks---
 
  if(i % 5 == 0)
    println(toHand(numArray(i)))
  else
    print(toHand(numArray(i)) + ": ")

*/
}

val sc = new java.util.Scanner(System.in) 
for(i <- 0 to ARRAY_LENGTH - 1){
  println( i + " times")
  print("rock scissors paper! 1,2,3!")
  var yourhand = sc.nextInt.toByte
  if(yourhand == 99){
	  println("Good Bye")
	  exit()
	}
  if(toHand(yourhand) != "null"){
    println("yourhand: " + toHand(yourhand))
    println("pchand  : " + toHand(numArray(i))) 
    print("--------------                                       ")
	  println(rsp_comp(yourhand, numArray(i)))
 }
  else
	  println("NoGame")
	println("******************************************************")
}
