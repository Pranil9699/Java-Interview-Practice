class RemoveDuplicates{
    public static boolean[] map = new boolean[26];
    public static void removeDublicates(String str , int idex , String newstr){
        if(idex == str.length()){
            System.out.println(newstr);
            return ;
        }

        char Currentelement = str.charAt(idex);
        if(map[Currentelement -'a']){
            removeDublicates(str, idex+1, newstr);
        } else {
        newstr+=Currentelement;
        map[Currentelement-'a']=true;
        removeDublicates(str, idex+1, newstr);
        }
    }
    public static void main(String[] args) {
        String str = "abbcdrgggfsaa";
        removeDublicates(str, 0 , "");
        
    }
}
