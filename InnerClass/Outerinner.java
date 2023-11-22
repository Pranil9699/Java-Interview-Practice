
// public class Outerinner {
//     class inner{

//    public void meth1(){
//     System.out.println("I am In Inner Class");
//    }
//     }
//     public static void main(String[] args) {
//         System.out.println("Outer Main Class ");

//     }
// }
// class Outerinner{
//      int a;
//     int b ;

//     public Outerinner(int a, int b) {
//         this.a=a;
//         this.b=b;
//     }
//     class inner{
//        public  int  meth1(){
//         System.out.println("This is The Inner Class Methd ");
//         return a+b;
//        }
//     }
//     public static void main(String[] args){
//         System.out.println("I am In The Outerinner Class ");

//         // 1  way to define 
//         // Outerinner obj = new Outerinner(1234,90);
//         // Outerinner.inner obj1 = obj.new inner(); 
//         //System.out.println(obj1.meth1());

//         // 2   way to define 
//         // Outerinner.inner obj = new Outerinner(12,34).new inner();
//         // System.out.println(obj.meth1());

//        // 3 way to define in single line 
//        System.out.println(new Outerinner(54, 67).new inner().meth1());

//     }
// }
// compile using ->    javac Outerinner.java 
// run using ->     java Outerinner
// Outer class contains the main method 
// but inner class can't hold the static method 
// inner class contains the nonstatic mehods 
// first  step to create the Outerinner class obj 
// after that we create the inner class obj 

// class Outerinner {
//     int a=23;
//     int b=56;

//     /* Modifier are applicable for Outerinner class */
//         // 1 public
//         // 2 default
//         // 3  final
//         // 4  strietfop
//         // 5 abstract



// // Inner class we cant declared The Static  variable 
// //  But We can assess the statis and Instance Variable in inner class 
//     class inner {

//     /* Modifier are applicable for Outerinner class */
//         // 1 public
//         // 2 default
//         // 3  final
//         // 4  strietfop
//         // 5 abstract
//         // 6 static
//         // 7 private 
//         // 8 protected

//         int a = 12;
//         int b = 20;
//         public void methodVaribale() {
//             int a =100;
//             int b =200;
//             System.out.println("This is The Inner Class Methd ");
//            System.out.println("This Accesing local method variable "+ (a + b));
//            System.out.println("This Accesing local inner class variable "+(this.a + this.b));
//            System.out.println("This Accesing  Outerinner class variable "+(Outerinner.this.a + Outerinner.this.b));
          
//         }
//     }


//     public static void main(String[] args) {
//         System.out.println("I am In The Outerinner Class ");
//         new Outerinner().new inner().methodVaribale();
//     }
// }




// in javawe can used the nested class
/*
 * class A{
 * class B{
 * class C{
 * public void calling(){
 * }
 * }
 * }
 * }
 * 
 * 
 * 
 * // caling by using 
 * A a = new A();
 * A.B b = a.new B();
 *A.B.C c = b.new C();
 c.calling();
 */
