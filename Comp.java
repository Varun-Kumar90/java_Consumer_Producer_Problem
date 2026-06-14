public class Comp {
    int n;
    boolean f = false;

    synchronized public void produceItem(int n) throws InterruptedException {
        while(f) {
            wait();
        }

        this.n = n;
        System.out.println("Produced: " + this.n);

        f = true;
        notifyAll();
    }

    synchronized public int consumeItem() throws InterruptedException {
        while(!f) {
            wait();
        }

        System.out.println("Consumed: " + this.n);

        f = false;
        notifyAll();

        return this.n;
    }
}