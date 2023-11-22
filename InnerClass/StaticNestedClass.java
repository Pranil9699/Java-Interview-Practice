// public class StaticNestedInnerClass {
//  static   int i =0;
//     static class Nested{
//         public void show(){
//             System.out.println(i+"I am The Static Nested Inner Class Invoked . . .");
//         }
//         // public void show(){
//         //     System.out.println("I am The Static Nested Inner Class Invoked . . .");
//         // }
//     }
//     public static void main(String[] args) {
//         // Nested obj2 = new Nested()
//         // obj2.show();
//         // StaticNestedInnerClass obj = new StaticNestedInnerClass();
//         // StaticNestedInnerClass.Nested obj2 = new Nested();
//         // obj2.show();
//         StaticNestedInnerClass.Nested obj2 = new StaticNestedInnerClass().Nested();
//     }
// }
// if y want to call the static nested class  without creating the object of outer class it possible 
// if y want to access the Static varible outside of nested class then we need that create the outer class object and then invoked it ...
public class StaticNestedInnerClass {
     static   int i =0;
        static class Nested{
           public static void main(String[] args) {
            System.out.println("I Am Nested class Main Method Invoker . . .");
           }
        }
        public static void main(String[] args) {
            System.out.println("I Am Inner class Main Method Invoker . . .");
           }
    }
