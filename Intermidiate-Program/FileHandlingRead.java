import java.io.File; 
import java.io.FileNotFoundException; 
import java.util.Scanner; 
 
public class ass { 
    public static void main(String[] args) throws FileNotFoundException{ 
    String inputstring = getstring(); 
    // replacing the String content  
    inputstring=replacestring(inputstring); 
    System.out.println("The output of program : "); 
    showoutput(inputstring); 
    } 
    public static String getstring()  throws FileNotFoundException { 
        File newfile = new File("input.txt"); 
        Scanner Scantext = new Scanner(newfile); 
        String newstring = new String(); 
        while (Scantext.hasNextLine()) { 
            newstring += Scantext.nextLine(); 
        } 
        Scantext.close(); 
        return newstring; 
    } 
    public static String replacestring(String newstring){ 
        String replacedword[]={" And "," and "," or "," Or ",". "}; 
        for(int i = 0 ; i < replacedword.length;i++){ 
            newstring = newstring.replace(replacedword[i], "\n"); 
        } 
        return newstring; 
    } 
    public static void showoutput(String newstring){ 
        System.out.println(newstring); 
    } 
}
/*
input.txt
An old Stork lived on the side of a fish pond. He was too old to fish any longer,
 and he had to come up with an idea for food. Suddenly, he had a great idea.
He stood in the water with a sad face. A crab came up to him and ask him why he
was so unhappy.
The Stork said "I've heard that this pond is going to dry up soon and now I have
 to fly away to another pond."
Concerned, the crab asked the stork to save the animals in the pond as well.
He would take a couple of fish in his beak and fly away towards another pond. Once
 he would reach far out of sight the pond, he would eat them. He did this many times.
Now it was the crab’s turn. As they were flying the crab looked down but could not 
see a pond however he saw a lot of fish bones. The crab immediately realized what was 
happening and grabbed the stork’s throat tight with his sharp claws. The stork 
struggled to get free. But the crab held on. Soon the stork fell to the ground. The crab 
crawled back to his pond to tell the story to the rest of the pond creatures.

*/
