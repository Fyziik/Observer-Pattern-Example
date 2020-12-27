package observable;

import java.util.HashSet;
import java.util.Set;

public class TwitterJunior implements ITwitterApps{

    Set<String> censoredWords = new HashSet<>();

    public TwitterJunior() {
        censoredWords.add("Fuck");
        censoredWords.add("ass");
    }

    public void addCensoredWord(String word) {
        this.censoredWords.add(word);
    }

    @Override
    public void update(String text) {
        System.out.println("Junior says: " + checkTweet(text));
    }

    private String checkTweet(String text) {
        for (String censWord : censoredWords) {
            if (text.contains(censWord)) {
                text = text.replace(censWord, "****");
            }
        }
        return text;
    }

}
