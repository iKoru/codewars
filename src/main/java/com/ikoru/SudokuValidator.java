package com.ikoru;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SudokuValidator {
  public static boolean check(int[][] sudoku) {
    // 1. zero, row test
    if(!Arrays.stream(sudoku).allMatch(row -> Arrays.stream(row).distinct().count() == 9L && Arrays.stream(row).noneMatch(cell -> cell == 0))){
      return false;
    }
    // 2. column test
    if(!IntStream.range(0, sudoku.length).parallel().mapToObj(r -> IntStream.range(0, sudoku.length).parallel().map(c -> {return sudoku[c][r];})).allMatch(row -> row.distinct().count() == 9)){
      return false;
    }
    // 3. block test
    if(!IntStream.range(0, sudoku.length / 3).allMatch(row -> IntStream.range(0, sudoku[0].length / 3).allMatch(column -> {return IntStream.of(sudoku[row * 3][column * 3], sudoku[row * 3][column * 3 + 1], sudoku[row * 3][column * 3 + 2], sudoku[row * 3 + 1][column * 3], sudoku[row * 3 + 1][column * 3 + 1], sudoku[row * 3 + 1][column * 3 + 2], sudoku[row * 3 + 2][column * 3], sudoku[row * 3 + 2][column * 3 + 1], sudoku[row * 3 + 2][column * 3 + 2]).distinct().count() == 9;}))){
      return false;
    }
    return true;
  }

}