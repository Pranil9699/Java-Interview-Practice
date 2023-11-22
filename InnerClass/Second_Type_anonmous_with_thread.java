public class Second_Type_anonmous_with_thread {
    public static void main(String[] args) {
        Runnable R = new Runnable(){
            public void run(){
                for(int i =0 ; i< 900 ; i++)
                System.out.println(i+"I am Child Class");

            }
        };
        Thread T = new Thread(R);
        T.start();
        for(int i =0 ; i< 10000 ; i++)
        System.out.println(i+"I am Main Thread ");

    }
}
