
//1


// final variable is variable whose value cannot be changed
// the value will be constant 
// class Employee {
//     //public final String name;
//     // error: variable name not initialized in the default constructor
//     // public final String name;
//     public static final  String name;
//     // static final variable cannot be initilized in a constuctor 
//     //  they must be assigned  a value with their declaration
//     // they must be decalred in static  block 
//     // static variable are shared among all the objects of a class
//     // creating a new object would change the static variable
//     // this is not allowed if the static variable  is final
//         public String email_address;

//     public String getName() {
//         return name;
//     }
// // there is need only the default constuctor
//     // Employee() {
//     //     name = "Pranil Takawane";
//     // }
// static {
//     name = "Pranil Takawane";
// }
//     public String getEmail_address() {
//         return email_address;
//     }

//     public void setEmail_address(String email_address) {
//         this.email_address = email_address;
//     }

//     public void getdetails() {
//         System.out.println("Name =" + getName() + "\nEmail \n" + getEmail_address());
//     }
// }

// class Manager extends Employee {
//     public String Dept = "";

//     public String getDept() {
//         return Dept;
//     }

//     public void setDept(String dept) {
//         Dept = dept;
//     }

//     public void getdetails() {
//         System.out.println("Name " + getName() + " \nEmail " + getEmail_address() + "\nDept " + getDept());
//     }
// }

// public class final_keyword {
//     public static void main(String[] args) {
//         Manager obj = new Manager();
//         obj.setDept("BCA");
//         obj.setEmail_address("Pannu@gmail.com");
//         // obj.setName(" Pranil Takawane ");
//         obj.getdetails();
//     }
// }


//2


// final keyword to the method appiled then watching 
// class Employee {
//     //public final String name;
//     // error: variable name not initialized in the default constructor
//     // public final String name;
//     public final  String name;
//     // static final variable cannot be initilized in a constuctor 
//     //  they must be assigned  a value with their declaration
//     // they must be decalred in static  block 
//     // static variable are shared among all the objects of a class
//     // creating a new object would change the static variable
//     // this is not allowed if the static variable  is final
//         public String email_address;

//     public String getName() {
//         return name;
//     }
// // there is need only the default constuctor
//     // Employee() {
//     //     name = "Pranil Takawane";
//     // }
// // static {
// //     name = "Pranil Takawane";
// // }
// Employee(){
//     name="Pranil Takwane ";
// }
// // const cant be final 
// // error: modifier final not allowed here
// // final Employee(){
// //       ^
//     public String getEmail_address() {
//         return email_address;
//     }

//     public void setEmail_address(final String email_address) {
//         this.email_address = email_address;
//     }
// //     error: getdetails() in Manager cannot override getdetails() in Employee
// //     public void getdetails() {
// //                 ^
// //   overridden method is final
//     // public final void getdetails() {
//     //     System.out.println("Name =" + getName() + "\nEmail \n" + getEmail_address());
//     // }

//     //^^^^ this is becuaed is you write any method as final then this method cant be Override
//     public void getdetails() {
//         System.out.println("Name =" + getName() + "\nEmail \n" + getEmail_address());
//     }
// }

// class Manager extends Employee {
//     public String Dept = "";

//     public String getDept() {
//         return Dept;
//     }

//     public void setDept(String dept) {
//         Dept = dept;
//     }

//     public void getdetails() {
//         System.out.println("Name " + getName() + " \nEmail " + getEmail_address() + "\nDept " + getDept());
//     }
// }

// public class final_keyword {
//     public static void main(String[] args) {
//         Manager obj = new Manager();
//         obj.setDept("BCA");
//         obj.setEmail_address("Pannu@gmail.com");
//         // obj.setName(" Pranil Takawane ");
//         obj.getdetails();
//     }
// }

//3

 final class Employee {
    //public final String name;
    // error: variable name not initialized in the default constructor
    // public final String name;
    public final  String name;
    // static final variable cannot be initilized in a constuctor 
    //  they must be assigned  a value with their declaration
    // they must be decalred in static  block 
    // static variable are shared among all the objects of a class
    // creating a new object would change the static variable
    // this is not allowed if the static variable  is final
        public String email_address;

    public String getName() {
        return name;
    }
// there is need only the default constuctor
    // Employee() {
    //     name = "Pranil Takawane";
    // }
// static {
//     name = "Pranil Takawane";
// }
Employee(){
    name="Pranil Takwane ";
}
// const cant be final 
// error: modifier final not allowed here
// final Employee(){
//       ^
    public String getEmail_address() {
        return email_address;
    }

    public void setEmail_address(final String email_address) {
        this.email_address = email_address;
    }
//     error: getdetails() in Manager cannot override getdetails() in Employee
//     public void getdetails() {
//                 ^
//   overridden method is final
    // public final void getdetails() {
    //     System.out.println("Name =" + getName() + "\nEmail \n" + getEmail_address());
    // }

    //^^^^ this is becuaed is you write any method as final then this method cant be Override
    public void getdetails() {
        System.out.println("Name =" + getName() + "\nEmail \n" + getEmail_address());
    }
}

class Manager extends Employee {
    public String Dept = "";

    public String getDept() {
        return Dept;
    }

    public void setDept(String dept) {
        Dept = dept;
    }

    public void getdetails() {
        System.out.println("Name " + getName() + " \nEmail " + getEmail_address() + "\nDept " + getDept());
    }
}

public class final_keyword {
    public static void main(String[] args) {
        Manager obj = new Manager();
        obj.setDept("BCA");
        obj.setEmail_address("Pannu@gmail.com");
        // obj.setName(" Pranil Takawane ");
        obj.getdetails();
    }
}
