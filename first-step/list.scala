val oneTwoThree = List(1, 2, 3)

for(i <- 0 to 2)
	print(List(i) + " ")
println()


val oneTwo = List(1, 2)
val threeFour = List(3, 4)
val oneTwoThreeFour = oneTwo ::: threeFour

println(oneTwo + " and " + threeFour + " were not mutated.")
println("Thus, " + oneTwoThreeFour + " is a new list.")

val zero = -1 :: 0 :: oneTwo
println(zero)
