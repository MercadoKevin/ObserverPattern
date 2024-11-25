package observerPattern;


public class BasicSubscriber implements Subscriber {
    private final String name;

    public BasicSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println(name + " received news: " + news);
    }
}
