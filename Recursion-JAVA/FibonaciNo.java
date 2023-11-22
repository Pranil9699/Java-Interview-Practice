public class FibonaciNo{
  private static void FibonaciSeries(int firstterm, int secondterm, int n) {
    if(n ==0 )
    return ;
    int Resulttem = firstterm+secondterm;
    System.out.print(", "+Resulttem);
    FibonaciSeries(secondterm, Resulttem, n-1);
    }
  public static void main(String[] args){
    int firstterm=0,secondterm=1;
        System.out.print("FibonaciSeries is -> "+firstterm);
        System.out.print(", "+secondterm);
        int n = 20 ;
        FibonaciSeries(firstterm, secondterm, n);
  }
}
