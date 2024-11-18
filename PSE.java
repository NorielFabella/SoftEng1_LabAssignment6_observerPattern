public class PSE {
    public static void main(String[] args) {

        Subscriber juan = new Subscriber("Juan");
        Subscriber john = new Subscriber("John");
        Subscriber charlie = new Subscriber("Charlie");

        NewsAgency newsAgency = new NewsAgency();

        newsAgency.attach(juan);
        newsAgency.attach(john);
        newsAgency.attach(charlie);
        
        System.out.println("Breaking News Published!");
        newsAgency.setLatestNews("Massive storm heading towards the coast!");

        newsAgency.detach(john);

        System.out.println("\nNew Breaking News Published!");
        newsAgency.setLatestNews("Government announces new economic policies.");

        newsAgency.attach(john);

        System.out.println("\nFinal Breaking News Published!");
        newsAgency.setLatestNews("Scientists discover cure for a major disease!");
    }
}