public class TowerOfHanoi {
    public static void main(String[] args) {
       System.out.println("Tower Of Hanoi  . . .");
       int n = 4;
       TowerOfHanoi(n,"S","H","D"); 
    }

    private static void TowerOfHanoi(int n, String Src, String helper, String Dest) {
        if(n == 1){
            System.out.println("Transfer Disk "+n+" From "+Src+" To "+Dest);
            return;
        }
        TowerOfHanoi(n-1, Src,  Dest,helper);
        System.out.println("Transfer Disk "+n+" From "+Src+" To "+Dest);
        TowerOfHanoi(n-1, helper, Src,  Dest);
    }
}
