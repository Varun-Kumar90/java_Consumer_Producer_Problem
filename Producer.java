public class Producer extends Thread {

    Comp c;

    public Producer(Comp c) {
        this.c = c;
    }

    public void run() {
        int i = 1;

        while(true) {
            try {
                c.produceItem(i);
                Thread.sleep(2000);
                i++;
            }
            catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
}