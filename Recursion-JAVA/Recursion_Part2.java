import java.util.ArrayList;

public class Recursion_Part2 {

    // Possible combination for the 4 letters string to calculate ans showing
    public static void PrintPermutation(String Mainstr, String Permutationstr) {
        if (Mainstr.length() == 0) {
            System.out.println(Permutationstr);
            return;
        }
        for (int i = 0; i < Mainstr.length(); i++) {
            char currChar = Mainstr.charAt(i);

            String newStr = Mainstr.substring(0, i) + Mainstr.substring(i + 1);
            PrintPermutation(newStr, Permutationstr + currChar);
        }
    }

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

    // find how many way to fill the tile in the floor the tiles are size (0,1)
    // means it aquiare the 2 cells
    public static int PrintPlaceTiles(int n, int m) {
        // if n = m then there are only 2 ways are fiting 
        if (n == m)
            return 2;
        // if n is less than m then there is only 1 way fiting are fit
        if (n < m)
            return 1;
        // Checking how many fit in Vertically
        int Vertically = PrintPlaceTiles(n - m, m);
        // Checking how many fit in Horizontally
        int Horizontally = PrintPlaceTiles(n-1, m);

        return Vertically + Horizontally;

    }


    // Find the How many way to To Call the Guest in Party which is single or pair wise
    public static int CallGuest(int n){
        if(n<=1){
            return 1;

        }

        // For Single Guest Way To Call
        int Ways1  = CallGuest(n-1);

        // For Pair Wise Guest Way To Call
        int Ways2  = (n-1) * CallGuest(n-2);

        return Ways1+Ways2;

    }

    // Print All Subset Of N number possible All Print 
    public static void PrintSubset(int n , ArrayList<Integer> subset){
        // base case if n==0 the Stop
        if(n==0)
        {
            ShowSubset(subset);
            return;
        }
        // ADD All Subset in ArrayList
        subset.add(n);
        PrintSubset(n-1, subset);

        // Added Remove 
        subset.remove(subset.size()-1);
        PrintSubset(n-1, subset);
        
    }
    private static void ShowSubset(ArrayList<Integer> subset) {
       for(int i =0 ; i < subset.size(); i++) {
     System.out.print(subset.get(i)+" ");    
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // problem 1 :- Print All Permutations of a string ??? 
        // String Str = "Lata";
        // PrintPermutation(Str, "");
        // problem 2 :- Count total Paths in a maze to move from (0,0) to (n,m)???
        // counting the Path for reaching in the Meze 3,3 place
        // int i, j, n, m;
        // i = j = 0;
        // n = m = 3;
        // System.out.println(countPath(i, j, n, m));
        // problem 3 :- Place Tiles of size 1 * m in a floor of size n * m ???
        // int n = 4, m = 2;
        // System.out.println(PrintPlaceTiles(n, m));

        // Problem 5 :- Find The Number Of Ways in  Which you Can Invite n People To your Party , Single or in Pair wise????

        // int n =6 ;
        // System.out.println(CallGuest(n));

        // Problem 6 :- Print all The Subsets of a Set of First N Natural Number

        int n = 10;
        ArrayList<Integer> subset = new ArrayList<>();
        PrintSubset(n,subset);  // time Compacity of this program is O(2^n);
    }

}
