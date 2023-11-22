public class Permutation{
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
   public static void main(String[] args) {
        problem 1 :- Print All Permutations of a string ??? 
        String Str = "SujitKargal";
        PrintPermutation(Str, "");
   }
}
