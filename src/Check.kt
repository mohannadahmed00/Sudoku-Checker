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


    check(
        name = "when enter an empty sudoku return true", result = isSudokuValid(
            sudokuBoard = listOf(
                listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
                listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
                listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
                listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
                listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
                listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
                listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
                listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
                listOf('-', '-', '-', '-', '-', '-', '-', '-', '-')
            )
        ), correctResult = true
    )
    check(
        name = "when enter a completed sudoku not contains any repeated numbers in the same row, column, or 3x3 subgrid (box) return true",
        result = isSudokuValid(
            sudokuBoard = listOf(
                listOf('5', '3', '4', '6', '7', '8', '9', '1', '2'),
                listOf('6', '7', '2', '1', '9', '5', '3', '4', '8'),
                listOf('1', '9', '8', '3', '4', '2', '5', '6', '7'),
                listOf('8', '5', '9', '7', '6', '1', '4', '2', '3'),
                listOf('4', '2', '6', '8', '5', '3', '7', '9', '1'),
                listOf('7', '1', '3', '9', '2', '4', '8', '5', '6'),
                listOf('9', '6', '1', '5', '3', '7', '2', '8', '4'),
                listOf('2', '8', '7', '4', '1', '9', '6', '3', '5'),
                listOf('3', '4', '5', '2', '8', '6', '1', '7', '9')
            )
        ),
        correctResult = true
    )
    check(
        name = "when enter an uncompleted sudoku not contains any repeated numbers in the same row, column, or 3x3 subgrid (box) return true",
        result = isSudokuValid(
            sudokuBoard = listOf(
                listOf('5', '3', '-', '-', '7', '-', '-', '-', '-'),
                listOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
                listOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
                listOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
                listOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
                listOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
                listOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
                listOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
                listOf('-', '-', '-', '-', '8', '-', '-', '7', '9')
            )
        ),
        correctResult = true
    )

    check(
        name = "when enter a completed sudoku contains any repeated numbers in the same row return false",
        result = isSudokuValid(
            sudokuBoard = listOf(
                listOf('5', '3', '4', '6', '7', '8', '9', '1', '2'),
                listOf('6', '7', '2', '1', '9', '5', '3', '4', '8'),
                listOf('1', '9', '8', '3', '7', '2', '5', '6', '7'),
                listOf('8', '5', '9', '7', '6', '1', '4', '2', '3'),
                listOf('4', '2', '6', '8', '5', '3', '7', '9', '1'),
                listOf('7', '1', '3', '9', '2', '4', '8', '5', '6'),
                listOf('9', '6', '1', '5', '3', '7', '2', '8', '4'),
                listOf('2', '8', '7', '4', '1', '9', '6', '3', '5'),
                listOf('3', '4', '5', '2', '8', '6', '1', '7', '3')
            )
        ),
        correctResult = false
    )
    check(
        name = "when enter an uncompleted sudoku contains any repeated numbers in the same row return false",
        result = isSudokuValid(
            sudokuBoard = listOf(
                listOf('5', '3', '4', '6', '7', '8', '9', '1', '2'),
                listOf('6', '7', '2', '1', '9', '5', '3', '4', '-'),
                listOf('-', '9', '7', '-', '-', '-', '-', '6', '7'),
                listOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
                listOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
                listOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
                listOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
                listOf('-', '-', '-', '1', '1', '9', '-', '-', '5'),
                listOf('-', '-', '-', '-', '8', '-', '-', '7', '9')
            )
        ),
        correctResult = false
    )

    check(
        name = "when enter a completed sudoku contains any repeated numbers in the same column return false",
        result = isSudokuValid(
            sudokuBoard = listOf(
                listOf('5', '3', '4', '6', '7', '8', '9', '1', '2'),
                listOf('6', '7', '2', '1', '9', '5', '3', '4', '8'),
                listOf('1', '9', '8', '3', '4', '3', '5', '6', '7'),
                listOf('8', '5', '9', '7', '6', '1', '4', '2', '3'),
                listOf('4', '2', '6', '8', '5', '3', '7', '9', '1'),
                listOf('7', '1', '3', '9', '2', '4', '8', '5', '6'),
                listOf('9', '6', '2', '5', '3', '7', '2', '8', '4'),
                listOf('2', '8', '7', '4', '1', '9', '6', '3', '5'),
                listOf('3', '4', '5', '2', '8', '6', '1', '7', '9')
            )
        ),
        correctResult = false
    )
    check(
        name = "when enter an uncompleted sudoku contains any repeated numbers in the same column return false",
        result = isSudokuValid(
            sudokuBoard = listOf(
                listOf('5', '3', '-', '-', '7', '-', '-', '-', '-'),
                listOf('6', '-', '-', '1', '9', '5', '-', '7', '-'),
                listOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
                listOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
                listOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
                listOf('7', '-', '8', '-', '2', '-', '-', '-', '6'),
                listOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
                listOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
                listOf('-', '-', '-', '-', '8', '-', '-', '7', '9')
            )
        ),
        correctResult = false
    )

    check(
        name = "when enter a completed sudoku contains any repeated numbers in the same subgrid (box) return false",
        result = isSudokuValid(
            sudokuBoard = listOf(
                listOf('5', '3', '4', '6', '7', '8', '9', '1', '2'),
                listOf('6', '5', '2', '1', '9', '5', '3', '4', '8'),
                listOf('1', '9', '8', '3', '4', '2', '5', '6', '7'),
                listOf('8', '5', '9', '7', '6', '1', '4', '2', '3'),
                listOf('4', '2', '6', '8', '5', '3', '7', '9', '1'),
                listOf('7', '1', '3', '9', '2', '6', '8', '5', '6'),
                listOf('9', '6', '1', '5', '3', '7', '2', '8', '4'),
                listOf('2', '8', '7', '4', '1', '9', '6', '3', '5'),
                listOf('3', '4', '5', '2', '8', '6', '1', '7', '9')
            )
        ),
        correctResult = false
    )
    check(
        name = "when enter an uncompleted sudoku contains any repeated numbers in the same subgrid (box) return false",
        result = isSudokuValid(
            sudokuBoard = listOf(
                listOf('5', '3', '-', '-', '7', '-', '-', '-', '-'),
                listOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
                listOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
                listOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
                listOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
                listOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
                listOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
                listOf('-', '-', '-', '4', '1', '9', '-', '2', '5'),
                listOf('-', '-', '-', '-', '8', '-', '-', '7', '9')
            )
        ),
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