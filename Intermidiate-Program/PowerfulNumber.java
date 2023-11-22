import java.util.Scanner;
public class Java_Que {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Power");
        int pow=sc.nextInt();
        int M=CalculatePower(pow);
        int temp = M;
        System.out.println(" 2 Power "+pow+" = "+M);
        // checking the Number is single or not and get the answer
        int digit=calsingle(M);
        System.out.println("The Sum of "+temp+ " Number is "+digit);
    }
public static int calsingle(int M ){
    if(M == 0){
        return M;
    }
    int sum=0;
    while(M!=0){
        int tem = M % 10;
        sum+=tem;
        M/=10;
    }
        if(sum>9){
            M = sum;
            System.out.println("Yes");
            sum = calsingle(M);
        }
        return sum;
}
    public static int CalculatePower( int pow) {
        // First base Case
        if (pow == 0)
            return 1;
        int xPowernum1 = CalculatePower(pow-1);
        int xPowernum2 = 2 * xPowernum1;
        return xPowernum2;
    }
}
