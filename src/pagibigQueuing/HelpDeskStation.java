package pagibigQueuing;

public class HelpDeskStation {
    private String stationName;
    private PagIbigQueueSystem queueSystem;

    public HelpDeskStation(String stationName) {
        this.stationName = stationName;
        this.queueSystem = PagIbigQueueSystem.getInstance();
    }

    public void serveNextCustomer() {
        System.out.println(stationName + " is serving.");
        queueSystem.displayOnlineMonitor();
    }

    public void resetStationQueue(int resetNumber) {
        System.out.println(stationName + " triggered a queue reset.");
        queueSystem.resetQueue(resetNumber);
    }
}