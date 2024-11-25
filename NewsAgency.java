package observerPattern;

import java.util.ArrayList;
import java.util.List;


public class NewsAgency {
    private final List<Subscriber> subscribers = new ArrayList<>();


    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
        System.out.println("A new subscriber has been added.");
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
        System.out.println("A subscriber has been removed.");
    }

    public void publishNews(String news) {
        System.out.println("Breaking News: " + news);
        for (Subscriber subscriber : subscribers) {
            subscriber.update(news);
        }
    }
}
