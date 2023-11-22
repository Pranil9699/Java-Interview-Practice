import java.util.Scanner;

public class Recursion_Part1 {
    // public static void printnumber(int n){
    // if(n==1000)
    // return;
    // if(n%2==0){
    // System.out.print("->"+n);
    // }
    // printnumber(n+1);

    // }
    // public static int SumOfNnaturalNo(int n){
    // if(n==1){
    // return 1;
    // }
    // return n+SumOfNnaturalNo(n-1);
    // }

    // private static int Factorial(int i) {
    // if(i == 0 || i ==1)
    // return 1;
    // return i*Factorial(i-1);
    // }
    // private static void FibonaciSeries(int firstterm, int secondterm, int n) {
    // if(n ==0 )
    // return ;
    // int Resulttem = firstterm+secondterm;
    // System.out.print(", "+Resulttem);
    // FibonaciSeries(secondterm, Resulttem, n-1);
    // }

    private static int CalculatePower(int num, int pow) {
        // First base Case
        if (pow == 0)
            return 1;
        if (num == 0)
            return 0;
        // int xPowernum1 = CalculatePower(num, pow-1);
        // int xPowernum2 = num * xPowernum1;
        // return xPowernum2;

        // if we calculate by checking even or odd number then the time will be logn
        // using this trick the stack height is become logn
        if (pow % 2 == 0)
            return CalculatePower(num, pow / 2) * CalculatePower(num, pow / 2);
        else
            return CalculatePower(num, pow / 2) * CalculatePower(num, pow / 2) * num;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // printnumber(0);

        // System.out.println(SumOfNnaturalNo(10));

        // System.out.println(Factorial(6));

        // int firstterm=0,secondterm=1;
        // System.out.print("FibonaciSeries is -> "+firstterm);
        // System.out.print(", "+secondterm);
        // int n = 20 ;
        // FibonaciSeries(firstterm, secondterm, n);
        System.out.println("Enter Number ");
        int Num = sc.nextInt();
        System.out.println("Enter Number Power ");
        int Pow = sc.nextInt();
        System.out.println("Answer :- " + CalculatePower(Num, Pow));
    }

}
