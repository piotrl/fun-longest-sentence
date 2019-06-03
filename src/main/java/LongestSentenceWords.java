import java.util.Arrays;

class LongestSentenceWords {

    int findLongestSentenceWords(String note) {
        String cleanNote = cleanUpNote(note);

        return longestSentence(cleanNote);
    }

    private Integer longestSentence(String note) {
        String[] sentences = note.split("\\.");
        return Arrays.stream(sentences)
                .map(sentence -> sentence.split(" "))
                .max((o1, o2) -> o1.length - o2.length)
                .map((words) -> words.length)
                .orElse(0);
    }

    private String cleanUpNote(String note) {
        return note.replaceAll("\\s\\s+", " ")
                .replace("?", ".")
                .replace("!", ".")
                .replace("..", ".")
                .replaceAll("^\\.", "");
    }
}
