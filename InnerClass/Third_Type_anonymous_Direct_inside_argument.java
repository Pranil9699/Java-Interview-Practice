public class Third_Type_anonymous_Direct_inside_argument {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            public void run(){
                for(int i =0 ; i< 100 ; i++)
                System.out.println(i+"I am Child Class");
            }
        }).start();
        for(int i =0 ; i< 100 ; i++)
        System.out.println(i+"I am Main Class");
    }
}
