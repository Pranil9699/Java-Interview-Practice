interface Lambda_ex{
    float meth1(float a , float b , float c);
}
public class Lambda_expresion_ex {
    public static void main(String[] args) {
        System.out.println("This is the Lambda interface Expression");
        Lambda_ex obj = (a,b,c)->{
            float MAX = a;
            if(b>MAX)
            MAX = b;
            if(c> MAX)
            MAX = c;
            return MAX;
        };
        System.out.println("The MAximum of three Numbers is "+obj.meth1(90,34,89));
    

    }
}
