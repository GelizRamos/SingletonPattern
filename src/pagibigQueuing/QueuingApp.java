package pagibigQueuing;

public class QueuingApp {
    public static void main(String[] args) {
        System.out.println("Pag-ibig Office Centralized Queuing System\n");

        PagIbigQueueSystem centralSystem = PagIbigQueueSystem.getInstance();

        HelpDeskStation station1 = new HelpDeskStation("Help Desk 1");
        HelpDeskStation station2 = new HelpDeskStation("Help Desk 2");
        HelpDeskStation station3 = new HelpDeskStation("Help Desk 3");

        System.out.println("--- Customers Obtaining Queue Numbers ---");
        centralSystem.issueNewTicket();
        centralSystem.issueNewTicket();
        centralSystem.issueNewTicket();

        System.out.println("\n--- Help Desk Stations Serving Customers ---");
        station1.serveNextCustomer();
        station2.serveNextCustomer();

        System.out.println("\n--- Reorganization / Technical Issue Reset ---");
        station2.resetStationQueue(100);

        System.out.println("\n--- Resuming Operations After Reset ---");
        centralSystem.issueNewTicket();
        station3.serveNextCustomer();
    }
}