
public class ShowPossibleSubset
{
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
        // Problem 6 :- Print all The Subsets of a Set of First N Natural Number

        int n = 10;
        ArrayList<Integer> subset = new ArrayList<>();
        PrintSubset(n,subset);  // time Compacity of this program is O(2^n);
    }
}
