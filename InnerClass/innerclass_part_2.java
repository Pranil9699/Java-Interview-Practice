// public class innerclass_part_2 {


//     public void method1(){
//         class inner{
//             public void getsum(int A, int B){
//         System.out.println("Addtion "+A+" AND "+B+" = "+(A+B));
//             }
//         }
//         inner obj = new inner();
//     System.out.println("I am in The Method " );
// obj.getsum(12, 90);
// obj.getsum(90, 29);
//     }
//     public static void main(String[] args) {
//         innerclass_part_2 obj = new innerclass_part_2();
//         obj.method1();
//     }
// }


//2


// public class innerclass_part_2 {
// int a=90;
// static int b =67;
// // public static void method1(){ // if we declared as a static method then only static variable can access Not instance variable accessed
//    public void method1(){ 
//         class inner{
//             public void getsum(int A, int B){
//         System.out.println("Addtion "+A+" AND "+B+" = "+(A+B));
//             }
//         }
//         inner obj = new inner();
//         System.out.println("I am in The Method " );
//         obj.getsum(a, b);
//         // error: non-static variable a cannot be referenced from a static context
//         //obj.getsum(a, b);
//     }
//     public static void main(String[] args) {
//         innerclass_part_2 obj = new innerclass_part_2();
//         obj.method1();
//     }
// }


// 3

public class innerclass_part_2 {

    public void method1(){ 
      // final int x =10;  // this variable need to be final keyword if we dont apply then it shows the ERROR      
      int x =10;
      class inner{
                public void getdetails(int A){
            System.out.println("The Number is "+ A);
                }
            }
            inner obj = new inner();
            System.out.println("I am in The outer Method " );
            obj.getdetails(x);
          
        }
        public static void main(String[] args) {
            innerclass_part_2 obj = new innerclass_part_2();
            obj.method1();
        }
    }