class ChecksumAccumulator{
  private var sum = 0
  def add(b: Byte): Unit = sum += b
  def checksum(): Int = ~(sum & 0xFF) + 1
}

val acc = new ChecksumAccumulator

for(i <- 0 to 100){
  println("Please enter your favorite numbers")
  val sc = new java.util.Scanner(System.in)
  acc.add(sc.nextInt.toByte)
  println(acc.checksum())
}
