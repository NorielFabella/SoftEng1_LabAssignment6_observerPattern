public class PSE {
    public static void main(String[] args) {

        Subscriber alice = new Subscriber("Alice");
        Subscriber bob = new Subscriber("Bob");
        Subscriber charlie = new Subscriber("Charlie");

        NewsAgency newsAgency = new NewsAgency();

        newsAgency.attach(alice);
        newsAgency.attach(bob);
        newsAgency.attach(charlie);
        
        System.out.println("Breaking News Published!");
        newsAgency.setLatestNews("Massive storm heading towards the coast!");

        newsAgency.detach(bob);

        System.out.println("\nNew Breaking News Published!");
        newsAgency.setLatestNews("Government announces new economic policies.");

        newsAgency.attach(bob);

        System.out.println("\nFinal Breaking News Published!");
        newsAgency.setLatestNews("Scientists discover cure for a major disease!");
    }
}