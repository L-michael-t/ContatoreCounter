public class CounterBlocked {
    private final Object lock = new Object();
    private int countB = 0;

    public void incrementB() {
        synchronized (lock) {
            int i = 0;
            while (i < 5000) {
                i++;
                countB++;
            }

        }
    }
        public int getCountB() {
            return this.countB;
        }

    }




