
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

class Outerinner {
    int a;
    int b;

    public Outerinner(int a, int b) {
        this.a = a;
        this.b = b;
    }

    class inner {
        public int meth1() {
            System.out.println("This is The Inner Class Methd ");
            return a + b;
        }
    }

    public int meth2() {
        inner obj1 = new inner();
        return (obj1.meth1());
    }

    public static void main(String[] args) {
        System.out.println("I am In The Outerinner Class ");
        Outerinner obj = new Outerinner(19, 90);
        System.out.println(obj.meth2());
    }
}
