public class Recursion_Part1 {
     public static void printnumber(int n){
     if(n==1000)
     return;
     if(n%2==0){
     System.out.print("->"+n);
                }
     printnumber(n+1);
     }
    public static void main(String[] args) {
        printnumber(0);
    }
}
