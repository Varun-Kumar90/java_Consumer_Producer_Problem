public class Main {

    public static void main(String[] args) {

        Comp comp = new Comp();

        Producer p = new Producer(comp);
        Consumer c = new Consumer(comp);

        p.start();
        c.start();
    }
}