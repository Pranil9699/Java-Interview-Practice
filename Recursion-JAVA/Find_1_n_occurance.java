public class Find_1_n_occurance{
    public static int first=-1;
    public static int last = -1;
    private static void FindOccurance(String str,int idex, char character) {
if(idex == str.length()){
    System.out.println("First Occurance of Charcter "+character+" is "+first);
    System.out.println("Last Occurance of Charcter "+character+" is "+last);
    return;
}
char Currentelement = str.charAt(idex);
if(Currentelement == character){
    if(first==-1){
        first=idex;
    }
    else{
        last=idex;
    }
}
FindOccurance(str, idex+1, character);
    }
    public static void main(String[] args) {
        String str ="Pranil Is Not Good Boy Which is Very Bad Thing";
        System.out.println(str);
        FindOccurance(str,0,'o');
    }
}
