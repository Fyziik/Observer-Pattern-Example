import observable.TwitterJunior;
import observable.TwitterSenior;
import observer.Twitter;

public class Main {


    public static void main(String[] args) {
        //Create observer
        Twitter twitter = new Twitter();

        //Add observables to observer
        twitter.addObserver(new TwitterJunior());
        twitter.addObserver(new TwitterSenior());

        twitter.broadcastTweet("Fuck donald trump, he's an ass");
    }




}
