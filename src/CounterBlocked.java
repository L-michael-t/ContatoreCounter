//uesto è con il counterblock
public class CounterBlocked {
    private final Object lock = new Object();
    private int countB = 0;

    public void incrementB() {
        
            int i = 0;
            while (i < 5000) {
            synchronized (lock) {
                i++;
                countB++;
            }

        }
    }
        public int getCountB() {
            return this.countB;
        }

    }




