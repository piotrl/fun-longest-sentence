//The task is:
//Check how many words are in the longest sentence in note.
//Note can has a lot of sentences
//Sentence is always finish by "." or "?" or "!"
//Between every word or sign You can find white spaces - solve it
//Empty sentence like "" or "   " has 0 words

public class BasedOn {

    public static void main(String[] args) {

        //i create notes

        //String note = "    .    ... !??? ?? ... New York, Buenos AIRES, york. Travels are sooo  goood   .. You know that, right?  . ?? !  " +
        //"So many bea  utiful  places    aroun     nd. !   . Return to home! !";

        String note = "It will be long sentence.    .I would   like to  check more CONditIONs  ." +
                "... .   ... .  .. ...... . . . . Maybe dots and question marks?? ?   ? ? ? ?   ?????But, remember  . About" +
                " exclamation mark! !! !!! ! ! ! ! ! !! And of course . check ? everything twice ! for .?!" +
                " example example ..??? like!!... that.!?" +
                "And!for?the.end something like that    .";


        System.out.println("The note is: \n" + note);


        //First I need to prepare my note

        //remove white spaces between the real words, if there is more than one white space
        //and leave only one like "Tomorrow   I am" for "Tomorrow I am".
        note = note.replaceAll("\\s\\s+", " ");

        //remove every white spice between special characters ".?!" and change for "."
        // and change every character "!?." for "."
        note = note.replaceAll("\\s?[!?.]\\s?", ".");

        //more than one dot? Remove them and leave only one
        note = note.replaceAll("\\.\\.+", ".");

        //remove dot from the beginning
        note = note.replaceAll("^\\.", "");


        System.out.println("\n\nAfter preparation the note is: \n" + note + "\n");


        //we put note to the table of strings
        //it will allow us to divide our note for sentences (split by ".")
        String[] tableOfStrings = note.split("\\.");

        //only for our information - how many sentences we have
        System.out.println("We have: " + tableOfStrings.length + " sentences:\n");


        String[] tableOfWords;
        int count = 0;

        //here we check how many words has every sentence
        //every word is divide by one white space
        for (String takeNextTwo : tableOfStrings) {

            tableOfWords = takeNextTwo.split("\\s");

            //only informations
            System.out.print("\nThe sentence has size: " + tableOfWords.length +
                    ". The sentence is: ");

            for (String nextSentence: tableOfWords) {
                System.out.print(nextSentence + " ");

            }

            //and if the sentence has got more words than previous one
            //we change our variable "count"
            if (tableOfWords.length > count) {
                count = tableOfWords.length;
            }


        }

        System.out.println("\n\nThe longest sentence have: " + count + " words.");

    }

}
