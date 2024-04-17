fun main() {
    gradeScore(95) // Output should be A
    gradeScore(85) // Output should be B
    gradeScore(55) // Output should be F
    gradeScore(-5) // Output should be Invalid Score
    gradeScore(105) // Output should be Invalid Score
    gradeScore("Five") // Output should be Invalid Input
    gradeScore(true) // Output should be Invalid Input
    gradeScore(75.5) // Output should be C
}

public fun gradeScore(score: Any): String {
    /* The following code should take an input, convert it to Double if numerical type
     * If not a nymerical type, returns Invalid Input */
	val numericValue =
        when (score) {
            is Int -> score.toDouble()
            is Double -> score
            is Float -> score.toDouble()
            else -> {
 				 println("Invalid Input")
  				 return "Invalid Input"
			}
        }
    
    // The following code grades the valid numerical Input
    val grade = when {
        // If the output is less than 0 or above 100, returns Invalid Score as output
        (numericValue < 0 || numericValue > 100) -> "Invalid Score"
        (numericValue >= 90) -> "A"
        (numericValue >= 80) -> "B"
        (numericValue >= 70) -> "C"
        (numericValue >= 60) -> "D"
        else -> "F"
    }
   	println(grade)
    return grade
}
