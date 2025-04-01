/*
    After completing the instructional videos, implement a Sudoku checker function that determines whether a given Sudoku puzzle is valid or not.
    A valid Sudoku must not contain any repeated numbers in the same row, column, or 3x3 subgrid (box).
    Use the character '-' to represent empty cells within the puzzle.

    - The function should return a Boolean value only—true if the Sudoku is valid, and false otherwise.

    You must follow a Test-Driven Development (TDD) approach while building this function:
        - Create a check function, as demonstrated in the tutorial, and write all necessary tests first without implementing any logic inside the actual Sudoku checker function.
          Initially, the function should always return false.
        - Present your written test cases to your mentor during the daily meeting.
          Once your mentor approves the test cases, proceed to implement the logic in the function incrementally until all test cases pass successfully.
        - After completing the implementation, design a full flowchart representing the logic of the function using draw.io.

    Extra: you can make the function dynamic and accept different size of the game like 4 * 4 or 16 * 16 not only 3 * 3
 */

fun main() {
    check(name = "when enter an empty sudoku return true", result = isSudokuValid(), correctResult = true)
    check(
        name = "when enter a completed sudoku not contains any repeated numbers in the same row, column, or 3x3 subgrid (box) return true",
        result = isSudokuValid(),
        correctResult = true
    )
    check(
        name = "when enter an uncompleted sudoku not contains any repeated numbers in the same row, column, or 3x3 subgrid (box) return true",
        result = isSudokuValid(),
        correctResult = true
    )

    check(
        name = "when enter a completed sudoku contains any repeated numbers in the same row return false",
        result = isSudokuValid(),
        correctResult = false
    )
    check(
        name = "when enter an uncompleted sudoku contains any repeated numbers in the same row return false",
        result = isSudokuValid(),
        correctResult = false
    )

    check(
        name = "when enter a completed sudoku contains any repeated numbers in the same column return false",
        result = isSudokuValid(),
        correctResult = false
    )
    check(
        name = "when enter an uncompleted sudoku contains any repeated numbers in the same column return false",
        result = isSudokuValid(),
        correctResult = false
    )

    check(
        name = "when enter a completed sudoku contains any repeated numbers in the same subgrid (box) return false",
        result = isSudokuValid(),
        correctResult = false
    )
    check(
        name = "when enter an uncompleted sudoku contains any repeated numbers in the same subgrid (box) return false",
        result = isSudokuValid(),
        correctResult = false
    )
}


fun check(
    name: String,
    result: Boolean,
    correctResult: Boolean,
) {
    if (result == correctResult) {
        println("Success - $name")
    } else {
        println("Failed - $name")
    }
}