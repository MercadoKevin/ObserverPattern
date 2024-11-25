package observerPattern;

public class NewsSubscriptionService {
    public static void main(String[] args) {
        
        NewsAgency agency = new NewsAgency();

      
        BasicSubscriber subscriber1 = new BasicSubscriber("Jhoanna");
        BasicSubscriber subscriber2 = new BasicSubscriber("Jerry");

       
        agency.subscribe(subscriber1);
        agency.subscribe(subscriber2);

 
        agency.publishNews("WEATHER REPORT!: Bring an umbrella on the go for todays weather is partly couldy with a chance of rain in the evening!");

    
        agency.unsubscribe(subscriber1);

 
        agency.publishNews("UPDATES!: Gasoline prices are surging!");

     
        BasicSubscriber subscriber3 = new BasicSubscriber("Irsish");
        agency.subscribe(subscriber3);

        agency.publishNews("BREAKING NEWS!: The Golden State Warriors are back were they belong!! they have once again win their 5th NBA Championship!");
    }
}
