public interface NewsSubject {
    void attach(Subscriber subscriber);
    void detach(Subscriber subscriber);
    void notifySubscribers();
}