import java.util.HashMap;

public class RansomNote {

    public static boolean ransomeNoteCanBeConstructedFromMagazine(String[] magazine, String[] note) {

        HashMap<String, Integer> wordsTable = new HashMap<>();

        for(int i = 0; i <= note.length-1; i++)
        {
            String word = note[i];

            if(!wordsTable.containsKey(word))
            {
                wordsTable.put(word, 1);
            }
            else
            {
                wordsTable.put(word, wordsTable.get(word) + 1);
            }

        }

        for(int j = 0; j <= magazine.length - 1; j++)
        {
            String word = magazine[j];
            if(wordsTable.containsKey(word))
            {
                wordsTable.put(word, wordsTable.get(word) - 1);
                if(wordsTable.get(word) == 0)
                {
                    wordsTable.remove(word);
                }
            }

        }

        return wordsTable.size() == 0;
    }
}
