package pagibigQueuing;

public class PagIbigQueueSystem {
    private static PagIbigQueueSystem instance;
    private int currentQueueNumber;

    private PagIbigQueueSystem() {
        this.currentQueueNumber = 0;
    }

    public static synchronized PagIbigQueueSystem getInstance() {
        if (instance == null) {
            instance = new PagIbigQueueSystem();
        }
        return instance;
    }

    public synchronized int issueNewTicket() {
        currentQueueNumber++;
        System.out.println("New ticket issued: #" + currentQueueNumber);
        displayOnlineMonitor();
        return currentQueueNumber;
    }

    public synchronized void displayOnlineMonitor() {
        System.out.println("Online Monitor - Current Queue Number: #" + currentQueueNumber);
    }

    public synchronized void resetQueue(int newNumber) {
        this.currentQueueNumber = newNumber;
        System.out.println("System Notice: Queue reset to #" + newNumber);
        displayOnlineMonitor();
    }
}