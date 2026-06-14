public class Consumer extends Thread {

    Comp c;

    public Consumer(Comp c) {
        this.c = c;
    }

    public void run() {
        while(true) {
            try {
                c.consumeItem();
                Thread.sleep(1000);
            }
            catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
}