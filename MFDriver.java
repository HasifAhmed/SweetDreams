public class MFDriver {
  public static void SOP(Object x){
    System.out.println(x);
  }
  public static void main(String[] args) {
    MatrixFinder test = new MatrixFinder();
    int counter = 0;
    for(int i = 0; i < 1000; i ++){
      long start = System.nanoTime();
      //Immediately after'testcase' choose an integer from 0 to 6 that represents an array from 1000 x 1000 to 7000 x 7000 respectively
      test.finder(test.testcase6, 1000000000);
      long end = System.nanoTime() - start;
      counter += end;
    }
    counter /= 1000;
    SOP("It took " + counter + " nanoseconds on average to find the worst-case value in this array");
  }
}
