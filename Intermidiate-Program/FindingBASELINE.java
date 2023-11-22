import java.util.Scanner;
public class Main
{
  public static void function(int Numberlist[], int baseline){
       int count=0;
		for(int i: Numberlist){
		    System.out.print(i+ " ");
		    count++;
		}
		
		int lesscount=0,greatercount=0;
		System.out.println();
		for(int i =0 ; i<count; i++){
		    if(Numberlist[i]< baseline){
		        lesscount++;
		    }
		    else if(Numberlist[i]> baseline){
		        greatercount++;
		    }
		   
		    
		}
		System.out.println("The Lesser Numbers Count is "+lesscount+"\nThe Greater Numbers Count is"+greatercount);
		    
    }
	public static void main(String[] args) {
	     System.out.println("Enter the Size of Array ");
		Scanner sc = new Scanner(System.in);
		int Size = sc.nextInt();
		int[] Arraylist = new int[Size];
		System.out.println("Enter the Elements in the Matrix ");
		for(int i =0 ; i<Size; i++){
		    Arraylist[i]=sc.nextInt();
		}
		System.out.println("Enter the Baseline ");
		int key=sc.nextInt();
		function(Arraylist,key);
	    
	}
		
}
