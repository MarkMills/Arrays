import java.util.Arrays;
class Main {
  public static void main(String[] args) {
    int[] in = {23, 79, 41, 68, 17, 39, 51, 75, 95, 19};
    //create array
    System.out.print("Integer values: ");
    for (int i = 0; i < 10; i++) {
      if (i != 9) {
        System.out.print(in[i] +", ");
      } else {
        System.out.print(in[i]);
      }
    }
//    System.out.println("Integer values: "+ in[0] +", "+ in[1] +", "+ in[2] +", " + in[3] +", " + in[4] +", "+ in[5] +", "+ in[6] +", "+ in[7] +", "+ in[8] +", "+ in[9]);
    //print array
    Arrays.sort(in); 
    //sort array to find smallest
    System.out.println("\nSmallest integer: "+ in[0]); 
    //print array
  }
}
