
public class CalculatePow{
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
        System.out.println("Enter Number ");
        int Num = sc.nextInt();
        System.out.println("Enter Number Power ");
        int Pow = sc.nextInt();
        System.out.println("Answer :- " + CalculatePower(Num, Pow));
}
}
