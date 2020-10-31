import java.lang.Character;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Word {
   public static String mix(String word)
   {
       String mixed = "";
       int lastIndex = word.length()-1;
       if (word.length() > 3)
       {
           mixed += word.charAt(0);
           mixed += shuffleString(word.substring(1, lastIndex));
           mixed += word.charAt(lastIndex);
       }
           else mixed = word;
       return mixed;
   }
   private static String shuffleString(String word)
   {
       List<String> letters;
       letters = Arrays.asList(word.split(""));
       Collections.shuffle(letters);

       String shuffledString = "";
       for (String letter : letters) {
           shuffledString += letter;
       }

       return shuffledString;
   }
   public static int lastLetterIndex(String word)
    {
        int index = word.length()-1;
        while(!Character.isLetter(word.charAt(index)))
            index--;
        return index;
    }
}
