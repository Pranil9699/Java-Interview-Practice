import javax.lang.model.util.ElementScanner14;
import javax.print.CancelablePrintJob;

import java.util.Scanner;
import java.util.StringJoiner; 
class challenge_one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int answer= getresult(12,23);
        System.out.println("The result is "+answer);
        answer= getresult(90,23);
        System.out.println("The result is "+answer);
        answer= getresult(2,98);
        System.out.println("The result is "+answer);

    }
   public static int  getresult(int a , int b){
    int chack ;
    int sum = a + b;
    if(sum >100)
    chack = 1 ;
    else if ( sum < 100)
    chack = 0;
    else 
    chack = 2;
    return chack;
   }
}
