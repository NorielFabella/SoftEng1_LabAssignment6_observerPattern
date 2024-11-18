import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements NewsSubject {

    private List<Subscriber> subscribers = new ArrayList<>();
    private String latestNews;


    public String getLatestNews() {
        return latestNews;
    }

    public void setLatestNews(String latestNews) {
        this.latestNews = latestNews;
        notifySubscribers(); 
    }

    @Override
    public void attach(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void detach(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.updateNews(latestNews);
        }
    }
}