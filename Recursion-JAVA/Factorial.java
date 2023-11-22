public class FactorialNo{
private static int Factorial(int i) {
    if(i == 0 || i ==1)
    return 1;
    return i*Factorial(i-1);
    }
  public static void main(String[] agrs){
    System.out.println(Factorial(6));
  }
}
