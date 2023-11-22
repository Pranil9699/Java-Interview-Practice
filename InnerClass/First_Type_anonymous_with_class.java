class Popcorn{
    public void test(){
        System.err.println("Salty . . .");
    }
}
public class First_Type_anonymous_with_class {
    public static void main(String[] args) {
        Popcorn obj1  = new Popcorn();
        obj1.test();
        Popcorn obj2 = new Popcorn(){
            public void test(){
                System.err.println("Spicy . . .");
            }
           };
           obj2.test();
       Popcorn obj3 = new Popcorn(){
        public void test(){
            System.err.println("Sweet . . .");
        }
       };
       obj3.test();
       System.out.println("Checking How many CLass file genrated ...");
       System.out.println(new Popcorn().getClass().getName()+".class");
       System.out.println(new First_Type_anonymous_with_class().getClass().getName()+".class");
       System.out.println(obj2.getClass().getName()+".class");
       System.out.println(obj3.getClass().getName()+".class");
    }
}
