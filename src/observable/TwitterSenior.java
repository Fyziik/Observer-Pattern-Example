package observable;

public class TwitterSenior implements ITwitterApps {

    @Override
    public void update(String tweet) {
        System.out.println("Senior says: " + tweet);
    }

}
