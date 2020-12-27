package observer;

import observable.ITwitterApps;

import java.util.ArrayList;
import java.util.List;

public class Twitter {

    private List<ITwitterApps> twitterApps = new ArrayList<>();

    public void addObserver(ITwitterApps app) {
        this.twitterApps.add(app);
    }

    public void removeObserver(ITwitterApps app) {
        this.twitterApps.remove(app);
    }

    public void broadcastTweet(String tweet) {
        for (ITwitterApps twitterApp : this.twitterApps) {
            twitterApp.update(tweet);
        }
    }


}
