public class Main {
    static final String EXAMPLE_TEST =("На краю дороги стоял дуб. Вероятно, в десять раз старше берез, составлявших лес, он был в десять раз толще, и в два раза выше каждой березы.");
    public static void main(String[] args)
    {
        System.out.print(EXAMPLE_TEST + "\n");
        String[] words;
        words = Sentence.toWords(EXAMPLE_TEST);
            for(String word : words)
            {
                int index = Word.lastLetterIndex(word);
                System.out.print(Word.mix(word.substring(0, index+1))+word.substring(index+1,word.length()) + " ");
            }
    }
}
