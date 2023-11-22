  public class FindWayToServe{
public static int countPath(int i, int j, int n, int m) {
        if (i == n || j == m)
            return 0;
        if (i == n - 1 && j == m - 1)
            return 1;

        // calculate the Downwards path to going 3 , 3 place
        int Downwards = countPath(i + 1, j, n, m);

        // calculate the Right path to going 3 , 3 place
        int Rightwards = countPath(i, j + 1, n, m);

        return Downwards + Rightwards;
    }
 public static void main(String[] args) {
      
        // problem 3 :- Place Tiles of size 1 * m in a floor of size n * m ???
        int n = 4, m = 2;
        System.out.println(PrintPlaceTiles(n, m));
 }
  }
