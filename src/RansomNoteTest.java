import org.junit.Test;

import static org.junit.Assert.*;

public class RansomNoteTest {

    @Test
    public void ransomeNoteCanBeConstructedFromMagazine() {

        String[] mazagine = {"give", "me" , "one" , "grand" , "today" , "night"};
        String[] note = {"give", "one",  "grand",  "today"};

        boolean result =  RansomNote.ransomeNoteCanBeConstructedFromMagazine(mazagine,note);
        assertTrue(result);
    }
}