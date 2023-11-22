 public class NaturalNo{
 public static int SumOfNnaturalNo(int n){
    if(n==1){
    return 1;
    }
    return n+SumOfNnaturalNo(n-1);
    }
   public static void main(String[] args){
     System.out.println(SumOfNnaturalNo(10));
   }
 }
