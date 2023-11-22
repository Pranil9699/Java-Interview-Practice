class PlaceAtLastPosition{
    public static void main(String[] args) {
        String str = "Pxranxxil";
     PlaceAtLast(str,0,0,"");
     
    }

    private static void PlaceAtLast(String str, int idex,int count,String newstr) {
        if(idex == str.length()){
            for(int i = 0 ; i< count;i++)
            newstr+='x';
            System.out.println(newstr);
            return ;
        }
        char currChar = str.charAt(idex);
        if(currChar == 'x')
        {
            count++;
            PlaceAtLast(str, idex+1, count, newstr);
        } else{
            newstr+=currChar;
            PlaceAtLast(str, idex+1, count, newstr);
        }
    }
}
