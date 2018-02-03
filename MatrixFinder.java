//Sweet Dreams
//Hasif Ahmed, Ben Platt
//APCS2 pd1
//HW03 -- I Am Still Searching
//2018-02-02
public class MatrixFinder{
    int[][] testcase;
    /* This method¡¯s goal is to search through a 2D array for a specific int. It takes a 2D int array and a int value.
    The int value is the one you are seeking inside of the 2D int array. Let¡¯s call the method Finder(). int[0][n-1] is the
    starting point of the algorithm, and is the top right corner of the matrix. Because this matrix is ordered from L-> R and
    top -> bottom, there are 2 items in the matrix that are both the greatest number in its row/column and the smallest number
    in its column/row. int[n-1][0] can also be a starting point, but the algorithm would need to be adjusted to account for that.
    If the values of row and column, which are initially 0 and n -1, do not exceed the dimensions of the matrix, the
    int[row][column] is compared with the target. If this is evaluated to be true, then the the while loop is exited through a
    return statement. If this is not true, then the boolean target > int[row][column] is evaluated, and if true, then 1 is
    added to the current row number because that means we need traverse in the downward direction because our value in the
    column is too small. If the opposite is true, that means the value the item that the target is being compared to is too
    large, and we need to traverse towards the left.*/

    //Constructor: MethodFinder
    //What it does: Generates some testcases to test out the finder method by instantiating and filling a 2D array
    public MatrixFinder(){
      //testcase = new int[][] { {0,1,2}, {1,2,3}, {2,3,4} };
      //testcase = new int[][] { {0,3,7}, {1,4,8}, {2,6,11} };
      testcase = new int[][] { {0,2,7}, {1,4,8}, {2,6,11} };
    }

    //Method: finder()
    //Parameters: 2D int array, int value
    //What it does: It returns the index of the int value inside the 2D int array,
    //If the int value is not in the 2D int array, it returns (-1,-1)
    public static String finder(int[][] matrix, int value){
      int row = 0; //begnning at top row
      int column = matrix.length - 1; //beginning at last column
      //top right is the start
      while (row < matrix.length && column >= 0) { //while loop, breaks when the element is at the bottom left index
        if( value == matrix[row][column]){ //conditional, checks if the value has been found
          return "(" + row + "," + column + ")"; //returns index
        }
        if(value > matrix[row][column]) { //if the value is greater
          row += 1; //go down a row
        }
        else if( value < matrix[row][column]){ //if the value is smaller
          column -= 1; //go back a column
        }
      }
      return "(-1,-1)"; //if value was not found, return this
    }

    //in order to print the 2D array
    public String toString(){
      String returned = ""; //creates final string to be returned
      for(int x = 0; x < testcase[0].length; x++){ //first for loop, by rows
        returned += "| "; //beginning of each row
        for(int j = 0; j < testcase.length; j++){ //second for loop, by columns
          returned += testcase[x][j] + " "; //adds value at the index of the 2D array to the string
        }
        returned += "|\n"; //end of each row
      }
      returned = returned.substring(0,returned.length() - 1); //removes the extra character
      return returned; //return the string
    }
    public static void SOP(Object x){
      System.out.println(x);
    }

    //TESTING!!!!!!!!!!!!!!!!
    public static void main(String[] args) {
      MatrixFinder test = new MatrixFinder();
      SOP("--------------------------------------");
      SOP("The number we are looking for is 3.");
      SOP("The given array is...");
      SOP(test);
      SOP("The position of the 3 is...");
      SOP(finder(test.testcase, 3));




    }

}
