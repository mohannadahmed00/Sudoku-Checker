fun main() {
    check(name = "when enter an empty sudoku then return true", result = isSudokuValid(), correctResult = true)
    check(name = "when enter a completed valid sudoku then return true", result = isSudokuValid(), correctResult = true)

    check(
        name = "when enter a sudoku with just one completed row without repeated or out of range numbers then return true",
        result = isSudokuValid(),
        correctResult = true
    )
    check(
        name = "when enter a sudoku with more than one completed row without repeated or out of range numbers then return true",
        result = isSudokuValid(),
        correctResult = true
    )
    check(
        name = "when enter a sudoku with just one completed column without repeated or out of range numbers then return true",
        result = isSudokuValid(),
        correctResult = true
    )
    check(
        name = "when enter a sudoku with more than one completed column without repeated or out of range numbers then return true",
        result = isSudokuValid(),
        correctResult = true
    )
    check(
        name = "when enter a sudoku with just one completed subgrid (box) without repeated or out of range numbers then return true",
        result = isSudokuValid(),
        correctResult = true
    )
    check(
        name = "when enter a sudoku with more than one completed subgrid (box) without repeated or out of range numbers then return true",
        result = isSudokuValid(),
        correctResult = true
    )

    check(
        name = "when enter a sudoku with just one uncompleted row without repeated or out of range numbers then return true",
        result = isSudokuValid(),
        correctResult = true
    )
    check(
        name = "when enter a sudoku with more than one uncompleted row without repeated or out of range numbers then return true",
        result = isSudokuValid(),
        correctResult = true
    )
    check(
        name = "when enter a sudoku with just one uncompleted column without repeated or out of range numbers then return true",
        result = isSudokuValid(),
        correctResult = true
    )
    check(
        name = "when enter a sudoku with more than one uncompleted column without repeated or out of range numbers then return true",
        result = isSudokuValid(),
        correctResult = true
    )
    check(
        name = "when enter a sudoku with just one uncompleted subgrid (box) without repeated or out of range numbers then return true",
        result = isSudokuValid(),
        correctResult = true
    )
    check(
        name = "when enter a sudoku with more than one uncompleted subgrid (box) without repeated or out of range numbers then return true",
        result = isSudokuValid(),
        correctResult = true
    )

    check(
        name = "when enter a sudoku contains any repeated numbers in the same completed row then return false",
        result = isSudokuValid(),
        correctResult = false
    )
    check(
        name = "when enter a sudoku contains any repeated numbers in the same uncompleted row then return false",
        result = isSudokuValid(),
        correctResult = false
    )
    check(
        name = "when enter a sudoku contains any repeated numbers in the same completed column then return false",
        result = isSudokuValid(),
        correctResult = false
    )
    check(
        name = "when enter a sudoku contains any repeated numbers in the same uncompleted column then return false",
        result = isSudokuValid(),
        correctResult = false
    )
    check(
        name = "when enter a sudoku contains any repeated numbers in the same completed subgrid (box) then return false",
        result = isSudokuValid(),
        correctResult = false
    )
    check(
        name = "when enter a sudoku contains any repeated numbers in the same uncompleted subgrid (box) then return false",
        result = isSudokuValid(),
        correctResult = false
    )

    check(
        name = "when enter a valid sudoku but contains out of range numbers in the same completed row then return false",
        result = isSudokuValid(),
        correctResult = false
    )
    check(
        name = "when enter a valid sudoku but contains out of range numbers in the same uncompleted row then return false",
        result = isSudokuValid(),
        correctResult = false
    )
    check(
        name = "when enter a valid sudoku but contains out of range numbers in the same completed column then return false",
        result = isSudokuValid(),
        correctResult = false
    )
    check(
        name = "when enter a valid sudoku but contains out of range numbers in the same uncompleted column then return false",
        result = isSudokuValid(),
        correctResult = false
    )
    check(
        name = "when enter a valid sudoku but contains out of range numbers in the same completed subgrid (box) then return false",
        result = isSudokuValid(),
        correctResult = false
    )
    check(
        name = "when enter a valid sudoku but contains out of range numbers in the same uncompleted subgrid (box) then return false",
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