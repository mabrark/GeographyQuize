package org.example

import kotlin.random.Random

fun main() {

    val provinces = arrayOf(
        "Alberta", "British Columbia", "Manitoba",
        "New Brunswick", "Newfoundland & Labrador", "NorthWest Territories",
        "Nova Scotia", "Nunavut", "Ontario", "Prince Edward Island",
        "Quebec", "Saskatchewan", "Yukon"
    )

    val capitals = arrayOf(
        "Edmonton", "Victoria", "Winnipeg",
        "Fredericton", "St. John's", "Yellowknife",
        "Halifax", "Iqaluit", "Toronto",
        "Charlottetown", "Quebec City", "Regina", "Whitehorse"
    )

    // Track which questions have been asked
    val duplicates = Array(13) { false }

    var correct = 0

    println("Welcome to the Geography Quiz - Good Luck!")
    println("------------------------------------------")

    for (i in 0..12) {

        // Get a unique random index
        var question: Int
        do {
            question = Random.nextInt(0, 13)
        } while (duplicates[question])

        duplicates[question] = true

        print("What is the capital of ${provinces[question]}? ")
        val answer = readLine()?.trim() ?: ""

        if (answer.equals(capitals[question], ignoreCase = true)) {
            println("✅ Correct!")
            correct += 1
        } else {
            println("❌ Incorrect. The capital is: ${capitals[question]}")
        }

        println()
    }

    println("------------------------------------------")
    println("Quiz Completed!")
    println("You got $correct out of 13 correct.")
    println("------------------------------------------")

    readLine()
}
