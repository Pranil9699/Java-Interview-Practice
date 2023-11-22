import java.io.*;
public class inputBuffer {
    public static void main(String[] args) throws IOException {
        String str, str1, str2, str3, str4, str5, str6,str7,string;
        int n;
        float n1;
        byte n2;
        char n3;
        boolean n4;
        double n5;
        long  n6;
        short n7;
        InputStreamReader obj = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(obj);
        System.out.println("Enter the integer ");
        str = br.readLine();
        System.out.println("Enter the float ");
        str1 = br.readLine();
        System.out.println("Enter the byte ");
        str2 = br.readLine();
        System.out.println("Enter the Character ");
        str3 = br.readLine();
        System.out.println("Enter the Boolean ");
        str4 = br.readLine();
        System.out.println("Enter the Double ");
        str5 = br.readLine();
        System.out.println("Enter the Long");
        str6 = br.readLine();
        System.out.println("Enter the Short ");
        str7 = br.readLine();
        System.out.println("Enter the String ");
        string = br.readLine();
       // for int
        try{
            n = Integer.parseInt(str);
            System.out.println(" n " + n);
        }
        catch(Exception e){
            System.out.println("Exception In Integer");
        }
               // for float
        try{
            n1 = Float.parseFloat(str1);
        System.out.println(" n1 " + n1);
        }
        catch(Exception e){
            System.out.println("Exception In Float");
        }
              // for byte
        try {
            n2 = Byte.parseByte(str2);
            System.out.println(" n2 " + n2);
        } catch (Exception e) {
            System.out.println("Exception In Byte");
        }
               // for char
        try {
            n3 = str3.charAt(0);
            System.out.println(" n3 " + n3);
        } catch (Exception e) {
            System.out.println("Exception In Character");
        }
       // for boolean
       try {
        n4 = Boolean.parseBoolean(str4);
        System.out.println(" n4 " + n4);
       } catch (Exception e) {
        System.out.println("Exception In Boolean");
       }
       // for double
       try{
        n5 = Double.parseDouble(str5);
        System.out.println(" n5 " + n5);
        } catch(Exception e){
        System.out.println("Exception In Double");
        }
        // for long
        try{
        n6 = Long.parseLong(str6);
        System.out.println(" n6 " + n6);
        } catch(Exception e){
        System.out.println("Exception In Long");
        }
        // for short
       try{
        n7 =Short.parseShort(str7);
        System.out.println(" n7 " + n7);
        } catch(Exception e){
        System.out.println("Exception In Short");
       }
       System.out.println(" String "+ string);
    }
}
