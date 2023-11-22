public class FindWayToInvite{

// Find the How many way to To Call the Guest in Party which is single or pair wise
    public static int CallGuest(int n){
        if(n<=1){
            return 1;
        }
        // For Single Guest Way To Call
        int Ways1  = CallGuest(n-1);

        // For Pair Wise Guest Way To Call
        int Ways2  = (n-1) * CallGuest(n-2);
        return Ways1+Ways2;
    }
     public static void main(String[] args) {
        // Problem 5 :- Find The Number Of Ways in  Which you Can Invite n People To your Party , Single or in Pair wise????
        int n =6 ;
        System.out.println(CallGuest(n));
     }
}
