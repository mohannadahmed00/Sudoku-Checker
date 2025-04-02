import kotlin.math.sqrt

fun isSudokuValid(sudokuBoard: List<List<String>>): Boolean {
    if (isEmptyBoard(sudokuBoard)) return true
    if (!isValidRows(sudokuBoard)) return false
    if (!isValidColumns(sudokuBoard)) return false
    if (!isValidSubGrids(sudokuBoard)) return false
    return true
}

fun isEmptyBoard(sudokuBoard: List<List<String>>): Boolean {
    sudokuBoard.forEach { rows ->
        rows.forEach { cell ->
            if (cell != "-") return false
        }
    }
    return true
}

fun isValidRows(sudokuBoard: List<List<String>>): Boolean {
    sudokuBoard.forEach { row ->
        val seen = mutableListOf<String>()
        row.forEach { cell ->
            if (isValidCell(cell, sudokuBoard.size, seen)) seen.add(cell)
        }
    }
    return true
}

fun isValidColumns(sudokuBoard: List<List<String>>): Boolean {
    for (columnIndex in sudokuBoard[0].indices) {
        val seen = mutableListOf<String>()
        sudokuBoard.forEach { row ->
            val cell = row[columnIndex]
            if (isValidCell(cell, sudokuBoard.size, seen)) seen.add(cell)
        }
    }
    return true
}

fun isValidSubGrids(sudokuBoard: List<List<String>>): Boolean {
    val steps = sqrt(sudokuBoard.size.toDouble()).toInt()
    for (columnIndex in sudokuBoard[0].indices step steps) {
        for (rowIndex in sudokuBoard.indices step steps) {
            val seen = mutableListOf<String>()
            val horizontalRange = columnIndex..columnIndex + (steps - 1)
            val verticalRange = rowIndex..rowIndex + (steps - 1)
            for (x in horizontalRange) {
                for (y in verticalRange) {
                    val cell = sudokuBoard[x][y]
                    if (!isValidCell(cell, sudokuBoard.size, seen)) {
                        return false
                    } else {
                        seen.add(cell)
                    }
                }
            }
        }
    }
    return true
}

fun isValidCell(cell: String, range: Int, seen: MutableList<String>): Boolean {
    if (!isNumeric(cell) && cell != "-") return false
    if (isNumeric(cell)) {
        if (cell.toInt() !in 1..range) return false
        if (seen.contains(cell)) return false
    }
    return true
}

fun isNumeric(input: String) = input.toIntOrNull() != null

