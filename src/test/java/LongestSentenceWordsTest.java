import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSentenceWordsTest {

    @Test
    void testEmptyInput() {
        // given
        LongestSentenceWords service = new LongestSentenceWords();
        String input = "";

        // when
        int result = service.findLongestSentenceWords(input);

        // then
        assertEquals(0, result);
    }

    @Test
    void testSingleSentence() {
        // given
        LongestSentenceWords service = new LongestSentenceWords();
        String input = "hello buddy, what's up?";

        // when
        int result = service.findLongestSentenceWords(input);

        // then
        assertEquals(4, result);
    }

    @Test
    void testTwoSentences() {
        // given
        LongestSentenceWords service = new LongestSentenceWords();
        String input = "hi! What's up my friend?";

        // when
        int result = service.findLongestSentenceWords(input);

        // then
        assertEquals(4, result);
    }

    @Test
    void testComplexInput() {
        // given
        LongestSentenceWords service = new LongestSentenceWords();
        String input = "It will be long sentence.    .I would   like to  check more CONditIONs  ." +
                "... .   ... .  .. ...... . . . . Maybe dots and question marks?? ?   ? ? ? ?   ?????But, remember  . About" +
                " exclamation mark! !! !!! ! ! ! ! ! !! And of course . check ? everything twice ! for .?!" +
                " example example ..??? like!!... that.!?" +
                "And!for?the.end something like that    .";

        // when
        int result = service.findLongestSentenceWords(input);

        // then
        assertEquals(7, result);
    }

}
