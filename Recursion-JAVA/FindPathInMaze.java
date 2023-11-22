public class FindPathInMaze{
   // Counting the Path for going to 3, 3 place in matrix
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
 
        problem 2 :- Count total Paths in a maze to move from (0,0) to (n,m)???
        counting the Path for reaching in the Meze 3,3 place
        int i, j, n, m;
        i = j = 0;
        n = m = 3;
        System.out.println(countPath(i, j, n, m));
}
}
