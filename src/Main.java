public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        CounterBlocked example = new CounterBlocked();



/*
        Thread t1 = new Thread(() -> counter.increment());
        Thread t2 = new Thread(() -> counter.increment());
        Thread t3 = new Thread(() -> counter.increment());
        Thread t4 = new Thread(() -> counter.increment());
*/

        Thread t1 = new Thread(() -> example.incrementB());
        Thread t2 = new Thread(() -> example.incrementB());
        Thread t3 = new Thread(() -> example.incrementB());
        Thread t4 = new Thread(() -> example.incrementB());


        t1.start();
        t2.start();
        t3.start();
        t4.start();


        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //System.out.println("Final count: " + counter.getCount());
        System.out.println("Final count: " + example.getCountB());
    }
}



