package org.example

import kotlin.random.Random

fun main() {

    val provinces = arrayOf("Alberta", "British Columbia", "Manitoba",
        "New Brunswick", "Newfoundland & Labrador",  "NorthWest territories",
        "Nova Scotia", "Nunavut", "Ontario", "Prince Edward Island",
        "Quebec", "Saskatchewan", "Yukon")

    val capitals = arrayOf("Edmonton", "Victoria", "winnipeg", "Fredricton",
        "St. John's", "Yellow Knife", "Halifax", "Iqaluit", "Toronto",
        "Charlottetown", "quebec City", "Regina", "White Horse")

    var duplicates = arrayOf(false, false, false, false
        false, false, false, false,
        false, false, false, false, false)

    var answer = ""
    var correct = 0

    println("Welcome to the geography quiz - Good Luck!")

    var question = 0

    for (count in 0..12)
    {
        do {
            question = Random.nextInt(0, 13) // random number 0 to 12
        } while(duplicates[question] == true)

        duplicates[question] = true

        println("What is the Capital of" + provinces[question] + "?")
        answer = readLine().toString()

        if (answer == capitals[question])
            println("Congratulations, you are correct")
        correct += 1  // equivalent to correct = correct + 1

        else
        {
            println("Sorry you are incorrect")
        }

    }

    println("You got " + correct + " questions correct.")

}