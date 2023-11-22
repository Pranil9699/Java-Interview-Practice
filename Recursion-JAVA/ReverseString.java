public class ReverseString {
        public static void main(String[] args) {
        String str="CHINTU";
        PrintReverseString(str,str.length()-1);    
        }

        private static void PrintReverseString(String str, int i) {
            if(i == 0 )
            {
                System.out.println(str.charAt(i));
                return;
            }
            System.out.print(str.charAt(i));
            PrintReverseString(str, i-1);
        }
    }
