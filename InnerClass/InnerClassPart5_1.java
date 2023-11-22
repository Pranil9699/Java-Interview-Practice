//3. interface inside interface
/*
if you want to access the Outer interface we directly access this without interfare in inner interface 
and 
same as we wabnt to access the Inner Interface we directly assess this inner interface without interfare of the outer interface


interface Outer{
public void meth1();
interface Inner{
public void meth2();
}
}
class Test1 implements Outer{
public void meth1(){
System.out.println("I am Outer Interface Implementing ...");
}
}
class Test2 implements Outer.Inner{
public void meth2(){
System.out.println("I am Inner Interface Implementing ...");
}
}
class Testing{
public static void main(String[] args){
Test1 obj1 = new Test1();
obj1.meth1();
Test2 obj2 = new Test2();
obj2.meth2();
}
}
*/
//4. class inside interface
/*
interface Email{
	public void email(EmailDetails e);
	class EmailDetails{
		String to,body,from;
		public EmailDetails(String to, String body,String from){
			this.to=to;
			this.body=body;
			this.from=from;
		}
		public String  getto(){
			return this.to;
		}
		public String  getbody(){
			return this.body;
		}
		public String  getfrom(){
			return this.from;
		}
	}
}
class inher extends Email.EmailDetails{
	inher(String to, String body,String from){
	super(to,body,from);
	}
	 String show(){
		return ("To -: "+getto()+"\nBody -: "+getbody()+"\nFrom -: "+getfrom());
	}
}
class Testing{
	public static void main(String[] args){
	inher obj = new inher("NandiniShelar@gmail.com","I lost My First Love","TakawanePranil22@gmail.com");
	System.out.println(obj.show());
	}
}

*/
// 5. class inside interface

//If you wnat the default implemented method for interface then we can do the class method and write our code inside it 
// The class inside interface is always public , STATIC WITHOUT OUTER OBJECT PRESENT OR NOT

interface Vehicle{
	public int getnoWheels();
	class DefaultVehicle implements Vehicle{
		public int getnoWheels(){
			return 2;
		}
	}
}
class Bus implements Vehicle{
		public int getnoWheels(){
			return 6;
		}
}
class Testing{
	public static void main(String[] args){
	Vehicle.DefaultVehicle obj1 =new Vehicle.DefaultVehicle();
	System.out.println("Default Vehicle Have "+obj1.getnoWheels()+" Wheels");
	Bus obj2 = new Bus();
	System.out.println("Bus Vehicle Have "+obj2.getnoWheels()+" Wheels");
	}
}

// class inside class :- Is ------------------------------------
// interface inside class :- Is always static but not be public 
// interface inside interface :- Is Always public and static 
// class inside interface :- Is Always public and static 
