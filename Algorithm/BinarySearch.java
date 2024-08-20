package Algorithm;

// searches the array A for the integer N
// precondition: A must be sorted into increasing order
// postcondition: if N is in the array, the return value, i
//   satisfies A[i] == N. if N is not in the array, then
//   the return value is -1.
public class BinarySearch {
  static int binarySearch(int[] A, int N) {

    int lowestPossibleLoc = 0;
    int highestPossibleLoc = A.length - 1;

    while (highestPossibleLoc >= lowestPossibleLoc) {
      int middle = (lowestPossibleLoc + highestPossibleLoc) / 2;
      if (A[middle] == N) {
        // N has been found at this index
        return middle;
      } else if (A[middle] > N) {
        // eliminate locations >= middle
        highestPossibleLoc = middle - 1;
      } else {
        // eliminate locations <= middle
        lowestPossibleLoc = middle + 1;
      }
    }

    // At this point, highestPossibleLoc < lowestPossibleLoc,
    // which means that N is known to be not in the array. Return
    // a -1 to indicate that N could not be found in the array.

    return -1;

  }
}
