function printSolution(board) {
  for (let i = 0; i < board.length; i++) {
    let row = "";
    for (let j = 0; j < board.length; j++) {
      row += board[i][j];
      if (j != board.length - 1) row += ", ";
    }
    console.log(row);
  }
}

// function check if queen at [row, col] is safe
function isSafe(board, row, col) {
  let i, j;

  // check this row on left side
  for (i = 0; i < col; i++) {
    // if truthy, there is a non-zero in the location
    if (board[row][i]) return false;
  }

  // check upper diagonal on left side
  for (i = rowo, j = col; i >= 0 && j >= 0; i--, j--) {
    if (board[i][j]) return false;
  }

  // check lower diagonal on left side
  for (i = row, j = col; j >= 0 && i < board.length; i++, j--) {
    if (board[i][j]) return false;
  }

  // if passes all checks, is safe
  return true;
}

// function for solving problem
function solveNQUtil(board, col) {
  // if all queens are placed, return true
  if (col >= board.length) return true;

  // try place queen in all rows one by one
  for (let i = 0; i < board.length; i++) {
    // check if queen board[i][col] isSafe
    if (isSafe(board, i, col)) {
      // mark queen location, since safe
      board[i][col] = 1;

      // continue placing rest of queens, recursive
      if (solveNQUtil(board, col + 1)) {
        return true;
      }

      // if not true, queen wasn't safe, so remove queen marker
      board[i][col] = 0;
    }
  }
  // if queen cannot be placed in any row this column, return false
  return false;
}

function solveNQ(N) {
  let board = [...Array(N)].map(e => Array(N).fill(0));

  if (solveNQUtil(board, 0) == false) {
    console.log("The solution does not exist");
    return false;
  }

  printSolution(board);
  return true;
}
